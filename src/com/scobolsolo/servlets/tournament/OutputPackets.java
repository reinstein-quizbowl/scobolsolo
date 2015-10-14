package com.scobolsolo.servlets.tournament;

import java.io.File;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.Validate;

import com.siliconage.util.Fast3Set;

import com.scobolsolo.application.Account;
import com.scobolsolo.application.Packet;
import com.scobolsolo.application.PacketFactory;
import com.scobolsolo.application.Tournament;
import com.scobolsolo.application.TournamentFactory;
import com.scobolsolo.output.LaTeXCompiler;
import com.scobolsolo.output.LaTeXOutputter;
import com.scobolsolo.output.PacketOutputter;
import com.scobolsolo.servlets.DownloadServlet;
import com.scobolsolo.Utility;

public class OutputPackets extends DownloadServlet {
	private static final long serialVersionUID = 1L;
	
	public static final String MIME_TYPE_PDF = "application/pdf";
	public static final String MIME_TYPE_ZIP = "application/zip";
	
	@Override
	protected Download makeDownload(final HttpServletRequest argRequest, final Account argUser) {
		final Tournament lclT = Validate.notNull(TournamentFactory.getInstance().fromHttpRequest(argRequest));
		final Collection<Packet> lclPackets = Validate.notEmpty(
			PacketFactory.getInstance().multipleFromHttpRequest(argRequest),
			"No packets specified to output"
		);
		
		String lclFilename;
		String lclMimeType;
		
		if (lclPackets.size() == 1) {
			lclFilename = PacketOutputter.makeFilename(lclPackets.iterator().next(), false);
			lclMimeType = MIME_TYPE_PDF;
		} else {
			lclMimeType = MIME_TYPE_ZIP;
			lclFilename = Utility.cleanFilename(lclT.getName() + "-packets.zip");
		}
		
		List<LaTeXOutputter> lclOutputters = lclPackets.stream()
			.sorted()
			.map(argP -> new PacketOutputter(argP))
			.collect(Collectors.toList());
		
		final List<File> lclFiles = new ArrayList<>(lclOutputters.size());
		
		for (LaTeXOutputter lclO : lclOutputters) {
			lclO.output();
			
			final LaTeXCompiler lclC = new LaTeXCompiler(lclO);
			final File lclPDF = lclC.compile();
			
			lclFiles.add(lclPDF);
		}
		
		if (lclFiles.size() == 1) {
			final File lclF = lclFiles.get(0);
			return new Download(lclF, lclMimeType, lclFilename);
		} else {
			final File lclZipFile = new File(lclFilename);
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
				
				return new Download(lclZipFile, lclMimeType, lclZipFile.getName());
			} catch (IOException lclIOE) {
				throw new IllegalStateException(lclIOE);
			}
		}
	}
}
