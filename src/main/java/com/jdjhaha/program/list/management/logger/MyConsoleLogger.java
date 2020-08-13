package com.jdjhaha.program.list.management.logger;

import java.util.LinkedList;

import com.jdjhaha.program.list.management.ProgramVO;

public class MyConsoleLogger extends MyLogger {
	
	private boolean lineBreakFlag;
	
	public MyConsoleLogger(boolean lineBreakFlag) {
		this.lineBreakFlag = lineBreakFlag;
	}

	@Override
	public void printAllProgram() {
		LinkedList<ProgramVO> programList = programManager.getProgramList();
		for(ProgramVO tmpProgramVO : programList) {
			if(lineBreakFlag) {
				System.out.println(tmpProgramVO.toString());
			}else {
				System.out.print(tmpProgramVO.toString());
			}
			
		}
	}

}
