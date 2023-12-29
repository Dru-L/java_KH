package com.kh.wrapper;

public class IntegerTest {
	public static void main(String[] args) {
		//Integer 클래스 선언하고 100을 저장
		Integer num = 100;
		int iNum = num.intValue(); //클래스가 가지고 있는 값을 꺼내올 수 있음.
		
		System.out.println(num);
		System.out.println(iNum);
		
		int jNum = 200;
		int sum = iNum + jNum;
		System.out.println(sum);
		System.out.println(num + jNum); // num => num.intValue() 자동형변환
										// num.intValue() + jNum => 오토 언박싱
		
		Integer i = jNum;
		System.out.println(i); 		//Integer.valueOf(jNum)
		
		
		String zero = "0";
		//정수형으로 변환
		System.out.println(Integer.parseInt(zero) == 0);
		Integer.parseInt(zero);
	}
}
