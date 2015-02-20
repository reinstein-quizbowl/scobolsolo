package com.scobolsolo.servlets.tournament;

import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.siliconage.web.ControllerServlet;

import com.scobolsolo.application.*;
import com.scobolsolo.paperwork.*;
import com.scobolsolo.servlets.DownloadServlet;

public class GeneratePaperwork extends DownloadServlet {
	private static final long serialVersionUID = 1L;
	
	public static final String BASE_DIRECTORY = "/home/scobolsolo/scobolsolo/data/paperwork/";
	
	public static final String MIME_TYPE_PDF = "application/pdf";
	public static final String MIME_TYPE_ZIP = "application/zip";
	
	@Override
	protected Download makeDownload(final HttpServletRequest argRequest, final Account argUser) {
		final Tournament lclT = Validate.notNull(TournamentFactory.getInstance().fromHttpRequest(argRequest));
		Validate.isTrue(argUser.mayUpdate(lclT), "Not authorized");
		
		final String lclBaseFilename = cleanFilename(lclT.getShortName() + '-');
		
		List<LaTeXOutputter> lclOutputters = new ArrayList<>();
		
		if (ControllerServlet.getBooleanParameter(argRequest, "school_welcome_sheets")) {
			lclOutputters.add(new SchoolWelcomeSheetOutputter(new File(BASE_DIRECTORY + lclBaseFilename + "school-welcome.tex"), lclT));
		}
		
		if (ControllerServlet.getBooleanParameter(argRequest, "player_welcome_sheets")) {
			lclOutputters.add(new PlayerWelcomeSheetOutputter(new File(BASE_DIRECTORY + lclBaseFilename + "player-welcome.tex"), lclT));
		}
		
		if (ControllerServlet.getBooleanParameter(argRequest, "staff_welcome_sheets")) {
			lclOutputters.add(new StaffWelcomeSheetOutputter(new File(BASE_DIRECTORY + lclBaseFilename + "staff-welcome.tex"), lclT));
		}
		
		if (ControllerServlet.getBooleanParameter(argRequest, "championship_rules")) {
			lclOutputters.add(new ChampionshipRulesOutputter(new File(BASE_DIRECTORY + lclBaseFilename + "championship-rules.tex"), lclT));
		}
		
		if (ControllerServlet.getBooleanParameter(argRequest, "replacement_guides")) {
			lclOutputters.add(new ReplacementGuideOutputter(new File(BASE_DIRECTORY + lclBaseFilename + "replacement-guides.tex"), lclT));
		}
		
		for (Phase lclP : lclT.createPhaseArray()) {
			final String lclPhaseSpecificBaseFilename = lclBaseFilename + cleanFilename(lclP.getShortName() + '-');
			if (lclP.isCardSystem()) {
				if (ControllerServlet.getBooleanParameter(argRequest, "player_cards_" + lclP.getId())) {
					lclOutputters.add(new PlayerCardOutputter(new File(BASE_DIRECTORY + lclPhaseSpecificBaseFilename + "player-cards.tex"), lclP));
				}
				
				if (ControllerServlet.getBooleanParameter(argRequest, "room_cards_" + lclP.getId())) {
					lclOutputters.add(new RoomCardOutputter(new File(BASE_DIRECTORY + lclPhaseSpecificBaseFilename + "room-cards.tex"), lclP));
				}
				
				if (ControllerServlet.getBooleanParameter(argRequest, "master_by_card_" + lclP.getId())) {
					lclOutputters.add(new MasterByCardOutputter(new File(BASE_DIRECTORY + lclPhaseSpecificBaseFilename + "master-schedule-by-card.tex"), lclP));
				}
				
				if (ControllerServlet.getBooleanParameter(argRequest, "master_by_room_" + lclP.getId())) {
					lclOutputters.add(new MasterByRoomOutputter(new File(BASE_DIRECTORY + lclPhaseSpecificBaseFilename + "master-schedule-by-room.tex"), lclP));
				}
			}
			
			if (ControllerServlet.getBooleanParameter(argRequest, "scoresheets_" + lclP.getId())) {
				lclOutputters.add(new ScoresheetOutputter(new File(BASE_DIRECTORY + lclPhaseSpecificBaseFilename + "scoresheets.tex"), lclP));
			}
		}
		
		final boolean lclIncludeTexFiles = ControllerServlet.getBooleanParameter(argRequest, "include_tex_files");
		
		final List<File> lclFiles = new ArrayList<>(lclIncludeTexFiles ? 2*lclOutputters.size() : lclOutputters.size());
		
		for (LaTeXOutputter lclO : lclOutputters) {
			lclO.output();
			
			if (lclIncludeTexFiles) {
				lclFiles.add(lclO.getFile());
			}
			
			final LaTeXCompiler lclC = new LaTeXCompiler(lclO);
			final File lclPDF = lclC.compile();
			
			lclFiles.add(lclPDF);
		}
		
		if (lclFiles.size() == 1) {
			final File lclF = lclFiles.get(0);
			return new Download(lclF, MIME_TYPE_PDF, lclF.getName());
		} else {
			final File lclZipFile = new File(BASE_DIRECTORY + lclBaseFilename + "paperwork.zip");
			try (FileOutputStream lclFOS = new FileOutputStream(lclZipFile)) {
				try (ZipOutputStream lclZOS = new ZipOutputStream(lclFOS)) {
					for (final File lclF : lclFiles) {
						final ZipEntry lclZE = new ZipEntry(lclF.getName());
						lclZOS.putNextEntry(lclZE);
						
						try (BufferedInputStream lclBIS = new BufferedInputStream(new FileInputStream(lclF))) {
							int lclRead;
							while ((lclRead = lclBIS.read()) != -1) {
								lclZOS.write(lclRead);
							}
						}
						
						lclZOS.closeEntry();
					}
				}
				
				return new Download(lclZipFile, MIME_TYPE_ZIP, lclZipFile.getName());
			} catch (IOException lclIOE) {
				throw new IllegalStateException(lclIOE);
			}
		}
	}
}
