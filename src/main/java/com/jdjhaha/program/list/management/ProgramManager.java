package com.jdjhaha.program.list.management;

import java.util.LinkedList;

import org.springframework.stereotype.Component;

@Component("programManager")
public class ProgramManager {
	private LinkedList<ProgramVO> programList = null;
	
	public ProgramManager() {
		programList = new LinkedList<ProgramVO>();
		this.addProgram(new ProgramVO(1, "���� ������ ȣ��", "/main.do"));
		this.addProgram(new ProgramVO(2, "ȸ������ ������ ȣ��", "/member/regist.do"));
		this.addProgram(new ProgramVO(3, "�α��� ������ ȣ��", "/member/login.do"));
		this.addProgram(new ProgramVO(4, "�α��� ����", "/member/login.json"));
		this.addProgram(new ProgramVO(5, "�α׾ƿ� ����", "/member/logout.json"));
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
