package com.scobolsolo.servlets.tournament;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.lang3.Validate;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opal.TransactionContext;

import com.scobolsolo.application.*;
import com.scobolsolo.servlets.ScobolSoloControllerServlet;

public class UploadCardSystem extends ScobolSoloControllerServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String RETURN_URL = "/tournament/cards.jsp";
	
	@Override
	protected String processInternalTwo(final HttpServletRequest argRequest, final HttpSession argSession, final Account argUser) throws Exception {
		Validate.isTrue(hasUpload(argRequest));
		
		final List<FileItem> lclItems = getUploadItems(argRequest);
		
		final Phase lclPhase = Validate.notNull(PhaseFactory.getInstance().forId(Integer.valueOf(getUploadParameterValue(lclItems, "phase_id"))));
		final Tournament lclT = lclPhase.getTournament();
		Validate.isTrue(argUser.mayManageCardSystem(lclT), "Not authorized");
		
		final FileItem lclUpload = Validate.notNull(getUpload(lclItems, "file"));
		Validate.notNull(lclUpload);
		
		final List<Round> lclRounds = lclPhase.getRounds();
		
		final RoundGroup lclFirstRoundGroup = lclRounds.get(0).getRoundGroup();
		
		final Workbook lclWB = new XSSFWorkbook(lclUpload.getInputStream());
		final Sheet lclSheet;
		if (lclWB.getNumberOfSheets() == 0) {
			throw new IllegalArgumentException("Workbook has no sheets");
		} else if (lclWB.getNumberOfSheets() == 1) {
			lclSheet = Validate.notNull(lclWB.getSheetAt(0));
		} else {
			final String lclSheetName = DownloadSpreadsheetForCardSystem.makeSheetName(lclPhase);
			lclSheet = Validate.notNull(lclWB.getSheet(lclSheetName), "No sheet named '" + lclSheetName + '\'');
		}
		
		final Map<Integer, Round> lclRoundsByColumnIndex = new ConcurrentHashMap<>();
		
		
		try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
			final Iterator<Row> lclRI = lclSheet.rowIterator();
			Rows:
			while (lclRI.hasNext()) {
				final Row lclRow = lclRI.next();
				
				if (lclRow.getRowNum() == 0) {
					final Iterator<Cell> lclHeaderRowCells = lclRow.cellIterator();
					Header_Cells:
					while (lclHeaderRowCells.hasNext()) {
						final Cell lclC = lclHeaderRowCells.next();
						if (lclC.getColumnIndex() == 0) {
							continue Header_Cells;
						}
						
						if (lclC.getCellType() == Cell.CELL_TYPE_BLANK) {
							continue Header_Cells;
						}
						
						final String lclRoundKey = getStringCellValue(lclC);
						
						Round lclRound = findRoundByName(lclRounds, lclRoundKey);
						if (lclRound == null) {
							lclRound = findRoundByShortName(lclRounds, lclRoundKey);
						}
						
						Validate.notNull(lclRound, "No round named '" + lclRoundKey + '\'');
						lclRoundsByColumnIndex.put(lclC.getColumnIndex(), lclRound);
						lclRoundsByColumnIndex.put(lclC.getColumnIndex() + 1, lclRound);
					}
					
					continue Rows;
				}
				
				Room lclRoom = null;
				Card lclWinningCard = null;
				Card lclLosingCard = null;
				
				final Iterator<Cell> lclCI = lclRow.cellIterator();
				Cells:
				while (lclCI.hasNext()) {
					final Cell lclCell = lclCI.next();
					
					if (lclCell.getColumnIndex() == 0) {
						final String lclRoomKey = getStringCellValue(lclCell);
						
						lclRoom = RoomFactory.getInstance().forNameTournamentCode(lclRoomKey, lclT.getCode());
						if (lclRoom == null) {
							lclRoom = RoomFactory.getInstance().forShortNameTournamentCode(lclRoomKey, lclT.getCode());
						}
						
						Validate.notNull(lclRoom, "There is no room named '" + lclRoomKey + '\'');
						
						continue Cells;
					}
					
					
					final Round lclRound = Validate.notNull(lclRoundsByColumnIndex.get(lclCell.getColumnIndex()), "Unknown round for column index " + lclCell.getColumnIndex());
					
					final String lclCardShortName = getStringCellValue(lclCell);
					final Card lclC = Validate.notNull(CardFactory.getInstance().forShortNamePhaseId(lclCardShortName, lclPhase.getIdAsObject()), "No card short-named '" + lclCardShortName + "' (row " + lclCell.getRowIndex() + ", column " + lclCell.getColumnIndex() + ')');
					
					if (lclWinningCard == null && lclLosingCard == null) {
						lclWinningCard = lclC;
					} else if (lclWinningCard != null && lclLosingCard == null) {
						lclLosingCard = lclC;
					} else if (lclWinningCard == null && lclLosingCard != null) {
						lclWinningCard = lclC;
					} else { // both are non-null
						throw new IllegalStateException("Both cards are non-null");
					}
					
					if (lclWinningCard != null && lclLosingCard != null) {
						// We have a full specification for a Match.
					
						if (lclWinningCard.getSequence() > lclLosingCard.getSequence()) {
							// They're flipped, so we put them in the right order
							final Card lclTemp = lclLosingCard;
							lclLosingCard = lclWinningCard;
							lclWinningCard = lclTemp;
						}
						
						// Delete any Match already assigned for that room and round
						final Match lclOld = Match.forRoundRoom(lclRound, lclRoom);
						if (lclOld != null) {
							lclOld.unlink();
						}
						
						
						final Match lclM = MatchFactory.getInstance().create();
						
						lclM.setRound(lclRound);
						lclM.setRoom(lclRoom);
						
						lclM.setWinningCard(lclWinningCard);
						lclM.setLosingCard(lclLosingCard);
						
						// If it's in the first round group, we populate the Game record with the players based on initial card assignments
						if (lclRound.getRoundGroup() == lclFirstRoundGroup) {
							Game lclG = GameFactory.getInstance().create();
							lclG.setMatch(lclM);
							lclG.setIncomingWinningCardPlayer(lclWinningCard.getInitialPlayer());
							lclG.setIncomingLosingCardPlayer(lclLosingCard.getInitialPlayer());
						}
						
						lclWinningCard = null;
						lclLosingCard = null;
					}
				}
			}
			
			lclTC.complete();
			
			return RETURN_URL + "?phase_id=" + lclPhase.getId();
		}
	}
	
	protected String getStringCellValue(final Cell argC) {
		if (argC == null) {
			return null;
		}
		
		final int lclCellType = argC.getCellType();
		
		switch(lclCellType) {
			case Cell.CELL_TYPE_BLANK: return "";
			
			case Cell.CELL_TYPE_BOOLEAN: return String.valueOf(argC.getBooleanCellValue());
			
			case Cell.CELL_TYPE_ERROR: return String.valueOf(argC.getErrorCellValue());
			
			case Cell.CELL_TYPE_FORMULA: return argC.getCellFormula();
			
			case Cell.CELL_TYPE_STRING: return argC.getStringCellValue();
			
			case Cell.CELL_TYPE_NUMERIC:
				final double lclDoubleValue = argC.getNumericCellValue();
				if (Double.compare(lclDoubleValue, Math.floor(lclDoubleValue)) == 0 && !Double.isInfinite(lclDoubleValue)) {
					return String.valueOf((int) lclDoubleValue);
				} else {
					return String.valueOf(lclDoubleValue);
				}
			
			default: throw new IllegalArgumentException("Unknown CellType for cell in row " + argC.getRowIndex() + ", column " + argC.getColumnIndex());
		}
	}
	
	protected Round findRoundByShortName(final Collection<Round> argRounds, final String argShortName) {
		if (argShortName == null || argRounds == null || argRounds.isEmpty()) {
			return null;
		}
		
		for (final Round lclR : argRounds) {
			if (lclR.getShortName().equals(argShortName)) {
				return lclR;
			}
		}
		
		return null;
	}
	
	protected Round findRoundByName(final Collection<Round> argRounds, final String argName) {
		if (argName == null || argRounds == null || argRounds.isEmpty()) {
			return null;
		}
		
		for (final Round lclR : argRounds) {
			if (lclR.getName().equals(argName)) {
				return lclR;
			}
		}
		
		return null;
	}
}
