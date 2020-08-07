package com.jdjhaha.program.list.management;

import java.util.LinkedList;

public class ProgramManager {
	private LinkedList<ProgramVO> programList = null;
	
	public ProgramManager() {
		programList = new LinkedList<ProgramVO>();
	}
	
	public void addProgram(ProgramVO program) {
		programList.add(program);
	}
	
	public ProgramVO getProgram(int id) {
		ProgramVO resultProgram = null;
		for(int i=0; i<programList.size() ; i++) {
			if(programList.get(i).getId() == id) {
				resultProgram = programList.get(i);
				break;
			}
		}
		
		return resultProgram;
	}
}
