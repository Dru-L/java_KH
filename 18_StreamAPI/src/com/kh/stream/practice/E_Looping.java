package com.kh.stream.practice;

import java.util.Arrays;

public class E_Looping {
	//최종처리와 중간처리
	
	/*
	 * 반복
	 * 	- 요소 전체를 반복하는 역할을 한다.
	 * 	- peek()
	 * 		- 중간 처리 단계에서 전체 요소를 반복하면서 추가적인 작업을 하기 위해 사용한다.
	 * 	- forEach()
	 * 		- 최종 처리 단계에서 전체 요소를 반복하면서 추가적인 작업을 하기 위해 사용한다.
	 */
	
	public void method1() {
		int[] array = {1,2,3,4,5};
		
		int sum = Arrays.stream(array)
					  .filter(value -> value % 2 == 0)
//			  		  .forEach(value -> System.out.print(value + " "));
//			  		  //forEach는 최종 처리 메소드. sum이나 다른 요소를 쓸거면 지워야함.
					  .peek(value -> System.out.println(value)) // 중간처리 단계이기 때문에 forEach대신 peek
					  .sum();
		System.out.println("Sum : " + sum);
	}
}
