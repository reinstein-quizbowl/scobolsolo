package com.scobolsolo.output;

import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.DirectoryNotEmptyException;
import java.util.List;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.exec.Executor;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.ExecuteStreamHandler;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.exec.LogOutputStream;

public class LaTeXCompiler {
	private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(LaTeXCompiler.class);
	
	public static final String LATEX_PATH = "/usr/local/texlive/2014/bin/x86_64-linux/pdflatex";
	public static final String TEX_MIME_TYPE = "application/x-tex";
	public static final String PDF_MIME_TYPE = "application/pdf";
	
	public static final long TIMEOUT = 15000L; // 15000 ms, or 15 seconds
	
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
			final CollectingLogOutputStream lclOutAndError = new CollectingLogOutputStream();
			try {
				final Executor lclExec = new DefaultExecutor();
				lclExec.setWorkingDirectory(getOutputDirectory());
				lclExec.setWatchdog(new ExecuteWatchdog(TIMEOUT));
				
				final CommandLine lclCommandLine = new CommandLine(LATEX_PATH);
				lclCommandLine.addArgument(getInputFile().getCanonicalPath());
				
				final ExecuteStreamHandler lclStreamHandler = new PumpStreamHandler(lclOutAndError);
				lclExec.setStreamHandler(lclStreamHandler);
				
				boolean lclEncounteredError = false;
				StringBuilder lclErrorSB = new StringBuilder();
				lclExec.execute(lclCommandLine);
			} catch (IOException lclIOE) {
				List<String> lclErrors = lclOutAndError.getLines().stream().filter(argS -> argS.startsWith("!")).collect(Collectors.toList());
				if (lclErrors.isEmpty()) {
					throw new RuntimeException(lclIOE);
				} else {
					for (String lclS : lclErrors) {
						ourLogger.error(lclS);
					}
					throw new IllegalArgumentException("Couldn't compile LaTeX: " + StringUtils.join(lclErrors, '\n'), lclIOE);
				}
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
	
	private static class CollectingLogOutputStream extends LogOutputStream {
		private final List<String> myLines = new LinkedList<String>();
		
		@Override
		protected void processLine(String line, int level) {
			myLines.add(line);
		}   
		
		public List<String> getLines() {
			return myLines;
		}
	}
}
