package com.jdjhaha.program.list.management.testcom;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestComponent {
	
	private BufferedWriter writer=null;
	
	public void hello() {
		System.out.println("hello() 함수 실행");
	}
	
	@PostConstruct
	public void testInit() {
		try {
			System.out.println("TestComponent init() 함수 실행");
			String path = "C:/Users/JU/git/programlist/src/main/resources/test.txt";
			File testTxtFile = new File(path);
			if(!testTxtFile.exists()) {
				testTxtFile.createNewFile();
			}
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(testTxtFile,true),"UTF-8"));
			writeLine("init() 함수 실행");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeLine(String msg) {
		try {
			writer.write(new Date()+"::"+msg+"\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@PreDestroy
	public void testDestroy() {
		System.out.println("destroy() 함수 실행");
		writeLine("destroy() 함수 실행");
	}
}
