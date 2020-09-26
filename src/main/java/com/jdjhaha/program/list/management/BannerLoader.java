package com.jdjhaha.program.list.management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.annotation.PostConstruct;

import org.springframework.core.io.Resource;

public class BannerLoader {
	private Resource banner;
	
	public void setBanner(Resource banner) {
		this.banner = banner;
	}
	
	//@PostConstruct
	public void showBanner() throws IOException{
		/*
		 * Files.lines(Paths.get(banner.getURI()), Charset.forName("EUC-KR"))
		 * .forEachOrdered(System.out::println);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(banner.getInputStream(),"euc-kr"));
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
