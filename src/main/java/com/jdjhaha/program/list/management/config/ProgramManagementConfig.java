package com.jdjhaha.program.list.management.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdjhaha.program.list.management.ProgramManager;
import com.jdjhaha.program.list.management.ProgramVO;

@Configuration
public class ProgramManagementConfig {
	
	@Bean
	public ProgramManager programManager() {
		ProgramManager programManager = new ProgramManager();
		programManager.addProgram(new ProgramVO(1, "���� ������ ȣ��", "/main.do"));
		programManager.addProgram(new ProgramVO(2, "ȸ������ ������ ȣ��", "/member/regist.do"));
		programManager.addProgram(new ProgramVO(3, "�α��� ������ ȣ��", "/member/login.do"));
		programManager.addProgram(new ProgramVO(4, "�α��� ����", "/member/login.json"));
		programManager.addProgram(new ProgramVO(5, "�α׾ƿ� ����", "/member/logout.json"));
		
		return programManager;
	}
}
