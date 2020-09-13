package com.jdjhaha.program.list.management.logger;

import com.jdjhaha.program.list.management.ProgramManager;

public abstract class MyLogger {
	
	
	ProgramManager programManager;
	private String logPath;
	
	public void setProgramManager(ProgramManager programManager) {
		this.programManager = programManager;
	}
	
	public String getLogPath() {
		return logPath;
	}

	public void setLogPath(String logPath) {
		this.logPath = logPath;
	}

	public abstract void printAllProgram();
}
