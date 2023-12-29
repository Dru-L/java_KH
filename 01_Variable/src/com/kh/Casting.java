package com.kh;
import java.util.Scanner;

public class Casting {
	public static void main(String[] args) {
	//	practice1();
	//	practice2();
	//	practice3();
	}
	
	public static void practice1() {
		//실습문제 1
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		//String word = sc.nextLine();
		char word = sc.next().charAt(0);
		//char <=> int // 아스키코드 기준에 의해 자동 형변환 가능.
		//int code = word.charAt(0);
		int code = word;
		
		System.out.println(word + " unicode : " + code);
		System.out.printf("%c unicode : %d", word, code);
		
	}
	
	public static void practice2() {
		//실습문제 2
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double korean = sc.nextDouble();
		
		System.out.print("영어 : ");
		double english = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int total = (int)(korean + english + math);
		int average = total / 3;
		
		System.out.printf("총점 : %d\n평균 : %d\n", total, average );
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
	}
	
	public static void practice3() {
		//실습문제 3
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);//2
		System.out.println((int)dNum);//2
		
		System.out.println(iNum2 * dNum);//10.0
		System.out.println((double)iNum1);//10.0
		
		System.out.println((double)iNum1 / iNum2);//2.5
		System.out.println(dNum);//2.5
		
		System.out.println((int)fNum);//3
		System.out.println(iNum1 / (int)fNum);//3
		
		System.out.println(iNum1 / fNum);//3.3333333 -> 실수에서는 소수점 뒤까지 나눈 값이 나옴
		System.out.println((double)iNum1 / fNum);//3.3333333333333335
		
		System.out.println(ch);//'A'
		System.out.println((int)ch);//65 ->아스키코드
		System.out.println(ch + iNum1);//75
		System.out.println((char)(ch + iNum1));//'K'
		
	}
}
