package com.scobolsolo.paperwork;

import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.DirectoryNotEmptyException;

import org.apache.commons.lang3.Validate;

public class LaTeXCompiler {
	// private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(LaTeXCompiler.class);
	
	public static final String LATEX_PATH = "/usr/local/texlive/2014/bin/x86_64-linux/pdflatex";
	public static final String TEX_MIME_TYPE = "application/x-tex";
	public static final String PDF_MIME_TYPE = "application/pdf";
	
	protected static final int DEFAULT_COMPILATION_PASSES = 2;
	
	private final File myInputFile;
	private final File myOutputDirectory;
	
	public LaTeXCompiler(final LaTeXOutputter argOutputter) {
		this(argOutputter.getFile());
	}
	
	public LaTeXCompiler(final File argInputFile) {
		this(argInputFile, argInputFile.getParentFile());
	}
	
	public LaTeXCompiler(final File argInputFile, final File argOutputDirectory) {
		myInputFile = Validate.notNull(argInputFile);
		
		Validate.notNull(argOutputDirectory);
		Validate.isTrue(argOutputDirectory.isDirectory());
		myOutputDirectory = argOutputDirectory;
	}
	
	public File compile() {
		return compile(DEFAULT_COMPILATION_PASSES);
	}
	
	public File compile(final int argPasses) {
		for (int lclPass = 1; lclPass <= argPasses; ++lclPass) {
			try {
				final ProcessBuilder lclLaTeXPB = new ProcessBuilder(LATEX_PATH, getInputFile().getCanonicalPath());
				lclLaTeXPB.directory(getOutputDirectory());
				final Process lclLaTeXProcess = lclLaTeXPB.start();
				try (BufferedReader lclOutput = new BufferedReader(new InputStreamReader(lclLaTeXProcess.getInputStream()))) {
				
					@SuppressWarnings("unused") String lclOutputLine;
					while ((lclOutputLine = lclOutput.readLine()) != null) {
						// We need to read this output to avoid the process blocking.  But we don't want to actually see it or anything.
						// ourLogger.debug(lclOutputLine);
					}
				}
			} catch (IOException lclIOE) {
				throw new RuntimeException(lclIOE);
			}
		}
		
		try {
			final File lclAux = findFileWithExtension(getInputFile(), getOutputDirectory(), ".aux");
			if (lclAux != null) {
				Files.delete(lclAux.toPath());
			}
			
			final File lclLog = findFileWithExtension(getInputFile(), getOutputDirectory(), ".log");
			if (lclLog != null) {
				Files.delete(lclLog.toPath());
			}
			
			final File lclOut = findFileWithExtension(getInputFile(), getOutputDirectory(), ".out");
			if (lclOut != null) {
				Files.delete(lclOut.toPath());
			}
			
			final File lclXwm = findFileWithExtension(getInputFile(), getOutputDirectory(), ".xwm");
			if (lclXwm != null) {
				Files.delete(lclXwm.toPath());
			}
		} catch (DirectoryNotEmptyException lclDNEE) {
			throw new IllegalStateException("Tried to delete a directory", lclDNEE);
		} catch (IOException lclIOE) {
			throw new RuntimeException("Could not clean up aux, log, out, and xwm files", lclIOE);
		} catch (SecurityException lclSE) {
			throw new IllegalStateException("Not allowed to clean up aux, log, out, and xwm files", lclSE);
		}
		
		return getPDFFile(getInputFile(), getOutputDirectory());
	}
	
	public File getInputFile() {
		return myInputFile;
	}
	
	public File getOutputDirectory() {
		return myOutputDirectory;
	}
	
	protected static File findFileWithExtension(final File argLaTeXFile, final File argDirectory, final String argExtension) {
		Validate.notNull(argLaTeXFile);
		Validate.notNull(argDirectory);
		Validate.isTrue(argDirectory.isDirectory());
		Validate.notNull(argExtension);
		
		final String lclNormalizedArgExtension = argExtension.charAt(0) == '.' ? argExtension : "." + argExtension;
		final String lclFilenameWithExtension;
		
		final String lclBaseFilename = argLaTeXFile.getName();
		if (lclBaseFilename.endsWith(".tex")) {
			lclFilenameWithExtension = lclBaseFilename.substring(0, lclBaseFilename.length() - 4) + lclNormalizedArgExtension;
		} else {
			lclFilenameWithExtension = lclBaseFilename + lclNormalizedArgExtension;
		}
		
		for (final File lclF : argDirectory.listFiles()) {
			if (lclFilenameWithExtension.equals(lclF.getName())) {
				return lclF;
			}
		}
		
		return null;
	}
	
	public static File getPDFFile(final File argLaTeXFile, final File argDirectory) {
		return findFileWithExtension(argLaTeXFile, argDirectory, ".pdf");
	}
}
