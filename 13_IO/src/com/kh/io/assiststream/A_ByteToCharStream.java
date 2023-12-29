package com.kh.io.assiststream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A_ByteToCharStream {	
	public void input() {
//		Scanner sc = new Scanner(System.in);//표준 입력 스트림
//		System.out; //표준 출력 스트림
//		char[] arr = new char[10];
//		try(InputStreamReader isr = new InputStreamReader(System.in)) {
//			System.out.print("문자열 입력 > ");
//			
//			isr.read(arr);
//			
// //		System.out.println(Arrays.toString(arr));
//			for (char c : arr) {
//				System.out.println(c);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("문자열 입력 > ");
			
			String value = br.readLine();
			
			System.out.println(value);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void output() {
		
		try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
			osw.write("한시간 남았어요 :)");
			osw.write("여러분 파이팅...!!^^");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//현재로써는 OutputStreamWriter로 System.out이 전체 close되기 때문에 그 이후 "시스템 종료"도 출력안되고 close된다.
	}
}
