package com.kh.io.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileByteStream {
	public void fileSave() {	//출력 스트림 => 해당하는 파일이 존재하지 않으면 파일을 만들어서 출력
		FileOutputStream fos = null; //참조변수 속의 null => 참조변수가 아무것도 참조하지 않겠다.
//		byte[] arr = new byte[3];
//		
//		arr[0] = 99;
//		arr[1] = 100;
//		arr[2] = 101;
		
//		byte[] arr = new byte[] {99,100,101};
		byte[] arr = {99,100,101};
		
		System.out.println(Arrays.toString(arr));
		
		try {
			fos = new FileOutputStream("a_byte.dat"); //dat : 일반 데이터파일에 대한 확장자
//			fos = new FileOutputStream("a_byte.dat",true); //뒤에 계속 이어서 쓰기(계속 반복해서 실행하면 계속해서 실행한 내용 전체가 뒤에 덧붙여짐)
			
			fos.write(97); //파일에 데이터를 쓰는 메소드 (아스키코드로 읽음 => 자동 형변환)
			fos.write('b');
			fos.write(10); // 줄바꿈 문자가 저장
			fos.write('c');
			fos.write(10);
			fos.write(arr); //배열 저장 (아스키코드로 읽음 => 자동 형변환) => byte 배열로만 사용 가능.
			fos.write(10);
			fos.write(arr, 1, 2); //arr배열의 1번 인덱스부터 2개만 출력하겠다.
			fos.write(10);
			fos.write('한'); //한글은 2byte로 표현되기 때문에 byte 단위 스트림으로는 제한이 있다.
			fos.flush();  //잔류 데이터 방출
			
//			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//스트림을 사용했으면 반드시 닫아주어야한다. 오류가 나던 안나던 무조건 닫아주어야하기 때문에 finally에 사용
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {	//입력 스트림 => 해당하는 파일이 존재하지 않으면 FileNotFoundException 예외 발생
		FileInputStream fis = null;
		byte[] arr = new byte[100];
		
		try {
			fis = new FileInputStream("a_byte.dat");
			
//			System.out.println((char)fis.read()); //int값으로 출력이 되기때문에 문자로 보고 싶으면 형변환
//			System.out.println(fis.read());
//			//읽다가 다 읽으면 -1로 처리됨
			
			//전체 값 출력할 때
			 //read가 2번 호출되기 때문에 정상적으로 값을 출력 할 수 없다.
//			while(fis.read() != -1) {
//				System.out.print((char)fis.read());
//			}
			//고로 아래와 같이 코드를 수정한다.
			int value = 0;
			
			while((value = fis.read()) != -1) {
				System.out.print((char)value);
			}
			
			
			//배열로 출력할때 (배열도 반복문 가능)
//			int value = fis.read(arr);
//			int value = fis.read(arr,5,10); //5인덱스부터 10개만 출력
//			
//			System.out.println("읽어온 byte의 수 : " + value);
//			System.out.println(Arrays.toString(arr));
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
