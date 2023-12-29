package com.kh.operator;

public class Arithmetic {
	/*
	 * 산술 연산자 (이항 연산자, 2개의 값으로 연산 수행)
	 * => + - * / %
	 * 
	 * 우선 순위 : * / % > + -
	 */
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		// 나머지 연산자 (%)
		// - 짝수/홀수 판별
		// (num % 2 == 0) => 짝수
		// (num % 2 != 0) or !(num % 2 == 0) => 홀수
		System.out.printf("num1은 짝수인가 ? %b\n", num1, (num1 % 2 == 0));
		System.out.printf("num2은 홀수인가 ? %b", num2, (num2 % 2 != 0));
	}
	
	public void method2() {
		//결과 예측해보기
		int a = 5;
		int b = 10;
		
		int c = (++a) + b;  // c = 6 + 10 = 16
		int d = c / a;	// d = 16 / 6 = 2
		int e = c % a;	// e = 16 % 6 = 4
		
		int f = e++; // f = 4
		// e = e+1 = 5
		
		int g = (--b) + (d--); //g = 9 + 2 = 11
		//d = d-1 = 1
		
		//a=6, b=9, c=16, d=1, e=5, f=4, g=11, h=2
		int h = 2;
		
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		//i = 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2) = 12
		
		System.out.println("a : " + a); //7
		System.out.println("b : " + b); //9
		System.out.println("c : " + c); //15
		System.out.println("d : " + d); //1
		System.out.println("e : " + e); //6
		System.out.println("f : " + f); //4
		System.out.println("g : " + g); //10
		System.out.println("h : " + h); //2
		System.out.println("i : " + i); //12
	}

}
