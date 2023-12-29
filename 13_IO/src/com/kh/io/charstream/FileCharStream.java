package com.kh.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharStream {
	public void fileSave() { //출력 스트림
	//try-with resource 구문을 통해서 리소스를 자동으로 close() 시킨다.
		char[] arr = new char[] {'a', 'p', 'p', 'l', 'e'};
//		try (FileWriter fw = new FileWriter("b_char.txt")) {
		try (FileWriter fw = new FileWriter("b_char.txt",true)) { //뒤에 계속 이어서 쓰기(계속 반복해서 실행하면 계속해서 실행한 내용 전체가 뒤에 덧붙여짐)
			fw.write("안녕하세요.");
			fw.write("만나서 반갑습니다.");
			fw.write('\n');	//줄바꿈
			fw.write('A');
			fw.write('한');
			fw.write('\n');	//줄바꿈
//			fw.write(new char[] {'a', 'p', 'p', 'l', 'e'});
			fw.write(arr);
			fw.write('\n');
			fw.write(arr, 1, 2); //arr배열의 1번 인덱스부터 2개만 출력하겠다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() { //입력 스트림 => 해당하는 파일이 존재하지 않으면 FileNotFoundException 예외 발생
		try(FileReader fr = new FileReader("b_char.txt")) {
			
			int value = 0;
			while((value = fr.read()) != -1){
				System.out.print((char)value); //전체 출력
			}
		}catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void sum(int ... arr) {
		int result = 0;
		for(int i =0; i<arr.length; i++) {
			result +=arr[i];
		}
		System.out.println(result);
	}
}
