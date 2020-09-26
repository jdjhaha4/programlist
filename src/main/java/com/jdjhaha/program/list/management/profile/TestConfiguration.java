package com.jdjhaha.program.list.management.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

	@Bean(initMethod="init")
	public CommonData commomData() {
		CommonData commomData = new CommonData();
		commomData.setProfileName("test");
		return commomData;
	}
}
