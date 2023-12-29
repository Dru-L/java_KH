package com.kh.example;

import java.io.FileInputStream;

public class ExceptionTest {
	public static void main(String[] args) {
		//unchecked exception(try-catch 문이나 if문)
		try {
			System.out.println(3/0);
		}catch(Exception e) {
			System.out.println("Exception 발생" + e.getMessage());
		}
//		//if문으로도 처리 가능
//		int n= 0;
//		if (n !=0) {
//			System.out.println(3/n);
//		}
		
		
//		String filename =  "";
//		try {
//		FileInputStream fi = new FileInputStream(filename); //checked exception
//		}catch(Exception e) { //어떤 오류인지 모를시 상위클래스 Exception입력 가능
//			
//		}
	}
}
