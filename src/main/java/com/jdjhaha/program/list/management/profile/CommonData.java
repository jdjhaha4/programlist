package com.jdjhaha.program.list.management.profile;

public class CommonData {
	
	private String profileName;
	
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public void init() {
		System.out.println("common data "+profileName+" 에서 초기화된 객체 입니다.");
	}
}
