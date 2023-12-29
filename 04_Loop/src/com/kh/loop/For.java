package com.kh.loop;
import java.util.Scanner;
import java.lang.Math;

public class For {
/*
 * 반복문 : 반복해서 수행하는 문장
 * 
 * [표현법]
 * for(초기식; 조건식; 증감식){
 *	//반복적으로 수행할 코드
 * }
 * 
 *  * 초기식 : 반복문이 수행될 때 "최초 한번만 실행되는 구문"
 *  * 조건식 : "반복문이 수행될 조건"을 작성하는 구문
 *  		- 조건식이 true이면, 반복할 코드를 수행
 *  		- 조건식이 false이면 반복문 종료
 *  * 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
 *	=> 보통 초기식, 조건식, 증감식에서 사용하는 변수가 동일하다.
 *
 *	* for문 실행 순서
 *	초기식 -> 조건식 검사 -> true라면 반복할 코드 실행 -> 증감식
 *		 -> 조건식 검사 -> true라면 반복할 코드 실행 -> 증감식
 *	-------------------계속 반복---------------------
 *	     -> 조건식 검사 -> false라면 반복문(for) 종료
 *	* 초기식, 조건식, 증감식 생략 가능
 *	 : ; 필수로 입력
 *	 for(초기식; 조건식;) {}
 *	 for(; 조건식; 조건식;) {}
 *	 for(초기식;; 조건식;) {}
 */
	
	public void method1() {
		//"Happy"5번 출력
//		for (int i=0; i<5; i++) { //(int i=5; i>0; i--) 등등 다양한 방법으로 쓸 수 있음
//			System.out.println("Happy");
//		}
		
		int j;
		for(j=1; j<6; j++) {
			System.out.println("Happy");
		}
		System.out.println("최종: " +j); //최종적으로 증감연산을 한 이후에 반복문이 멈춤
	}
	
	public void method2() {
		//반복문을 사용해서 10 ~ 1 출력
		for (int i=10; i>0; i--){
			System.out.print(i);
			if (i != 1) {
				System.out.print(" "); //i가 1이 아닐 때 공백 추가
				// 10 9 8 7 6 ... 1
			}
		}
	}
	
	public void method3() {
		//1 ~ 10 까지의 총 합을 구하여 출력
		int total = 0;
		for (int i=1; i<=10; i++) {
			System.out.print(i + "+" + total + "=");
			total += i;
			System.out.print(total+"\n");
		}
		System.out.println("총 합:" + total);
	}
	
	public void method4() {
		//1 ~ 10 까지의 정수 중에서 사용에게 입력받은 값까지의 총합
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(1~10) : ");
		int end = sc.nextInt();
		int total = 0;
		
		if (end>=1 && end<=10) {
			for (int i =1; i<=end; i++) {
				System.out.print(i + "+" + total + "=");
				total += i;
				System.out.print(total+"\n");
			}
			System.out.println("총 합:" + total);
		}else{
			System.out.println("입력 오류");
		}
	}
	
	public void method5() {
		// 랜덤값까지의 총 합을 구하여 출력
		/*
		 * [랜덤값 구하는 방법]
		 * - Math : java.lang.Math
		 * 			random()
		 * 	* Math.random()
		 * 	  0.0 ~ 0.99999999(0.0<=1.0)
		 *  (int)(Math.random() * 10) // 0~9까지의 반환값
		 */
		int random = (int)(Math.random() * 10 + 1); //1~10까지의 값 랜덤
		System.out.print("1부터 "+random+"까지의 합: ");
		int total = 0;
		
		for (int i =1; i<=random; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	public void method6() {
		final String STR = "Story";
		//각 인덱스(위치)별 문자를 한 줄 씩 출력
		int lg = STR.length();
		
		for (int i=0; i<lg; i++) {
			System.out.println(STR.charAt(i));
		}
	}
	
	public void method7() {
		//구구단 3단 출력
		for (int i=1; i<10; i++) {
			int j = i * 3;
			System.out.println("3 x " + i +" = " +j);
			System.out.printf("3 x %d = %d\n", i, (i*3));
		}
	}
	
	public void method8() {
		//2~9단 구구단 출력. 중첩 반복문 사용
		for (int i=1; i<10; i++) {
//			if (i != 2) {
//				System.out.println("-------------");
//			}
			for(int j=2; j<10; j++) {
				System.out.printf("%d x %d = %d\t",j,i,(j*i));
				// \n : 줄바꿈, \t :탭(   )
			}
			if (i != 9) {
				System.out.println();
			}
		}
	}
}

