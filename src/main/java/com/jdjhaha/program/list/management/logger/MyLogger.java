package com.jdjhaha.program.list.management.logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.jdjhaha.program.list.management.ProgramManager;

public abstract class MyLogger {
	
	@Autowired
	ProgramManager programManager;
	
	public void setProgramManager(ProgramManager programManager) {
		this.programManager = programManager;
	}
	
	public abstract void printAllProgram();
}
