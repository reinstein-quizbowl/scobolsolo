package com.scobolsolo.paperwork;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.lang3.Validate;

public abstract class LaTeXOutputter {
	protected static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(LaTeXOutputter.class.getName());
	
	public static final String LATEX_NEWLINE = "\\\\";
	protected static final String FILENAME_SEPARATOR = "-";
	
	private final File myFile;
	private final PrintWriter myWriter;
	
	public LaTeXOutputter(final File argFile) {
		super();
		
		myFile = Validate.notNull(argFile);
		
		try {
			myWriter = new PrintWriter(new BufferedWriter(new FileWriter(myFile)), true);
		} catch (IOException lclIOE) {
			throw new RuntimeException(lclIOE);
		} catch (SecurityException lclSE) {
			throw new RuntimeException(lclSE);
		}
	}
	
	public void output() {
		try {
			outputInternal();
			
			getWriter().flush();
		} catch (IOException lclIOE) {
			ourLogger.error(lclIOE);
			throw new RuntimeException(lclIOE);
		}
	}
	
	protected abstract void outputInternal() throws IOException;
	
	public File getFile() {
		return myFile;
	}
	
	public File getDirectory() {
		return getFile().getParentFile();
	}
	
	protected PrintWriter getWriter() {
		return myWriter;
	}
	
	public static String escape(final String argS) {
		if (argS == null) {
			return null;
		}
		
		final StringBuilder lclSB = new StringBuilder();
		for (final char lclC : argS.toCharArray()) {
			switch(lclC) {
				case '\n': lclSB.append("\\\\"); break;
				case '#': lclSB.append("\\#"); break;
				case '$': lclSB.append("\\$"); break;
				case '%': lclSB.append("\\%"); break;
				case '&': lclSB.append("\\&"); break;
				case '\\': lclSB.append("\\textbackslash "); break;
				case '^': lclSB.append("\\^{}"); break;
				case '_': lclSB.append("\\_"); break;
				case '{': lclSB.append("\\{"); break;
				case '}': lclSB.append("\\}"); break;
				case '~': lclSB.append("\\~{}"); break;
				default: lclSB.append(lclC);
			}
		}
		
		return lclSB.toString();
	}
	
	protected static void outputFileContents(final String argFilename, final PrintWriter argPW) {
		Validate.notNull(argFilename);
		outputFileContents(new File(argFilename), argPW);
	}
	
	protected static void outputFileContents(final File argFile, final PrintWriter argPW) {
		Validate.notNull(argFile);
		Validate.notNull(argPW);
		
		try (BufferedReader lclReader = new BufferedReader(new FileReader(argFile))) {
			String lclLine = null;
			while ((lclLine = lclReader.readLine()) != null) {
				argPW.println(lclLine);
			}
		} catch (IOException lclIOE) {
			ourLogger.error(lclIOE);
			throw new RuntimeException(lclIOE);
		}
	}
	
	public static String getFilenameSeparator() {
		return System.getProperty("file.separator");
	}
}
