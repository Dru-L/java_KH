package com.kh.io;

import com.kh.io.assiststream.A_ByteToCharStream;
import com.kh.io.assiststream.B_BufferedStream;
import com.kh.io.assiststream.C_DataStream;
import com.kh.io.assiststream.D_ObjectStream;
import com.kh.io.bytestream.FileByteStream;
import com.kh.io.charstream.FileCharStream;
import com.kh.io.file.FileTest;

public class Application {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

//		new FileTest().method1();
		// => FileTest fileTest = new FileTest();
		// => fileTest.method1();
//		new FileTest().method2();

//		FileInputStream, FileOutputStream 테스트 (바이트기반)
		new FileByteStream().fileSave();
//		new FileByteStream().fileRead();
		
//		FileReader, FileWriter 테스트 (문자기반)
//		new FileCharStream().fileSave();
//		new FileCharStream().fileRead();
		
		//가변인자
//		new FileCharStream().sum(10,5,11);
//		new FileCharStream().sum(5,6);
//		new FileCharStream().sum(5);
		
		//문자 변환 보조 스트림 테스트
//		new A_ByteToCharStream().input();
//		new A_ByteToCharStream().output();
		
		//성능 향상 보조 스트림
//		new B_BufferedStream().fileSave();
//		new B_BufferedStream().fileRead();
		
		//기본타입 입출력 보조 스트림 테스트
//		new C_DataStream().fileSaveAndRead();
		
		//객체 입출력 보조 스트림
//		new D_ObjectStream().fileSave();
//		new D_ObjectStream().fileRead();
		
		System.out.println("프로그램 종료");
	}
}