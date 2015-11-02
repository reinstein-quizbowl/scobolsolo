package com.scobolsolo.servlets.tournament;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.scobolsolo.ScobolSoloConfiguration;
import com.scobolsolo.application.*;
import com.scobolsolo.servlets.DownloadServlet;

public class DownloadSpreadsheetForCardSystem extends DownloadServlet {
	private static final long serialVersionUID = 1L;
	
	public static final String MIME_TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	
	@Override
	protected Download makeDownload(final HttpServletRequest argRequest, final Account argUser) {
		final Phase lclPhase = Validate.notNull(PhaseFactory.getInstance().fromHttpRequest(argRequest));
		final Tournament lclT = lclPhase.getTournament();
		Validate.isTrue(argUser.mayManageCardSystem(lclT), "Not authorized");
		
		final String lclFilename = cleanFilename(lclT.getShortName() + ' ' + lclPhase.getShortName() + " Card System");
		
		final Workbook lclWB = new XSSFWorkbook();
		final Sheet lclSheet = lclWB.createSheet(makeSheetName(lclPhase));
		
		final Row lclHeaderRow = lclSheet.createRow(0);
		final Cell lclRoomHeaderCell = lclHeaderRow.createCell(0);
		lclRoomHeaderCell.setCellValue("Room short name");
		
		int lclColumn = 1;
		final List<Round> lclRounds = lclPhase.getRounds();
		lclRounds.removeIf(argR -> !argR.usesCardSystem());
		
		for (final Round lclR : lclRounds) {
			final Cell lclRoundHeaderCell = lclHeaderRow.createCell(lclColumn);
			lclRoundHeaderCell.setCellValue(lclR.getName());
			
			lclSheet.setColumnWidth(lclColumn, 5*256);
			lclSheet.setColumnWidth(lclColumn + 1, 5*256);
			
			lclColumn += 2;
		}
		
		int lclRow = 1;
		for (final Room lclR : lclPhase.getGameRooms()) {
			final Row lclRoomRow = lclSheet.createRow(lclRow);
			final Cell lclRoomNameCell = lclRoomRow.createCell(0);
			lclRoomNameCell.setCellValue(lclR.getName());
			++lclRow;
		}
		
		lclSheet.autoSizeColumn(0);
		
		final File lclFile = new File(getFullFilename(lclFilename));
		
		try (FileOutputStream lclFOS = new FileOutputStream(lclFile)) {
			lclWB.write(lclFOS);
			
			return new Download(lclFile, MIME_TYPE, lclFilename);
		} catch (IOException lclIOE) {
			throw new IllegalStateException(lclIOE);
		}
	}
	
	/* package */ static String makeSheetName(final Phase argP) {
		Validate.notNull(argP);
		
		return WorkbookUtil.createSafeSheetName(argP.getTournament().getShortName() + ' ' + argP.getShortName() + " Card System");
	}
	
	public static String getDirectory() {
		final String lclSeparator = System.getProperty("file.separator");
		
		return ScobolSoloConfiguration.getInstance().getString("DATA_DIRECTORY") + lclSeparator + ScobolSoloConfiguration.getInstance().getString("GENERATED_SPREADSHEETS_SUBDIRECTORY") + lclSeparator;
	}
	
	public static String getFullFilename(final String argFilename) {
		return getDirectory() + argFilename;
	}
}
