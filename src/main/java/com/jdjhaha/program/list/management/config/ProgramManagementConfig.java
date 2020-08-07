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
		programManager.addProgram(new ProgramVO(1, "메인 페이지 호출", "/main.do"));
		programManager.addProgram(new ProgramVO(2, "회원가입 페이지 호출", "/member/regist.do"));
		programManager.addProgram(new ProgramVO(3, "로그인 페이지 호출", "/member/login.do"));
		programManager.addProgram(new ProgramVO(4, "로그인 실행", "/member/login.json"));
		programManager.addProgram(new ProgramVO(5, "로그아웃 실행", "/member/logout.json"));
		
		return programManager;
	}
}
