package com.jdjhaha.program.list.management;

import java.util.LinkedList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jdjhaha.program.list.management.logger.MyLogger;

@Component("programManager")
public class ProgramManager {
	
	@Resource(name="multiLineLogger")
	private MyLogger myLogger;
	
	private LinkedList<ProgramVO> programList = null;
	
	public ProgramManager() {
		programList = new LinkedList<ProgramVO>();
		this.addProgram(new ProgramVO(1, "메인페이지", "/main.do"));
		this.addProgram(new ProgramVO(2, "회원가입페이지", "/member/regist.do"));
		this.addProgram(new ProgramVO(3, "로그인페이지", "/member/login.do"));
		this.addProgram(new ProgramVO(4, "로그인실행", "/member/login.json"));
		this.addProgram(new ProgramVO(5, "로그아웃실행", "/member/logout.json"));
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

	public LinkedList<ProgramVO> getProgramList() {
		return programList;
	}
	
	public void printAllPrograms() {
		myLogger.setProgramManager(this);
		myLogger.printAllProgram();
	}
}
