package com.kh.io.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	//File 클래스 테스트
	public void method1() {
		try {
			//메모리 상에만 존재하는 객체
			File file = new File("test.txt");  //해당 자바가 있는 클래스 폴더에 저장됨
//			File file = new File("D:/test.txt"); //경로 지정
			
			System.out.println("파일명 :" + file.getName());	//파일명
			System.out.println("경로 : " + file.getAbsolutePath());	//파일 저장 경로
			System.out.println("파일 존재 여부 : " + file.exists());	//파일이 실제로 존재하는가
			//메모리 상에서만 존재하기때문에 false 가 나오고, 그 이후 코드(createNewFile)로 실제 파일이 만들어지기 때문에 2번째 부터는 true라고 나옴.
			System.out.println("파일 여부 : " + file.isFile());
			System.out.println("폴더 여부 : " + file.isDirectory());
			//파일인지 폴더인지 확인
			
			//createNewFile() 메소드를 실행해야만 실제 파일이 만들어진다.
			file.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//폴더 생성 후 파일 생성 테스트
	public void method2() {
		try {
			//폴더 생성
//			File tempDir = new File("D:/temp");
			File tempDir = new File("D:/temp/demo"); //temp폴더가 만들어지지 않은 상태에서 그 하위 폴더를 만들라고 하면 에러남.
			
			if(!tempDir.exists()) {
				boolean result = tempDir.mkdirs(); //mkdir() : make directory(지정 폴더만 생성) , mkdirs():지정 폴더의 상위 폴더부터 하위폴더까지 전체 생성.
				System.out.println("D:/temp 폴더 생성!!");
			}
			
//			File file = new File("D:/temp/test.txt"); //없는 폴더를 지정해서 파일을 만드려고 하면(존재하지 않는 경로 제시) IOException 에러가 난다.
			File file = new File("D:/temp/demo/test.txt"); //없는 폴더를 지정해서 파일을 만드려고 하면(존재하지 않는 경로 제시) IOException 에러가 난다.
			
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
