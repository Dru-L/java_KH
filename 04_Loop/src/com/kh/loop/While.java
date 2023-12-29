package com.kh.loop;
import java.util.Scanner;
import java.lang.Math;

public class While {
	/*
	 * 반복문 while
	 * [표현법]
	 * //[초기식]   //생략가능
	 * while(조건식) {
	 *  //반복적으로 실행할 코드
	 *  //[증감식] //생략가능
	 *  }
	 *  
	 *  -실행순서
	 *  조건식 검사 -> 조건이 true면 반복할 코드 실행
	 *  ->조건식 검사 -> 조건이 true면 반복할 코드 실행
	 *  ->조건식 검사 -> 조건이 false면 반복문 종료
	 */
	public void method1() {
		// "Happy" 문장 5번 출력하기
		int i = 0;
		while(i<5) {
			System.out.println("Happy");
			i++;
		}
	}
	
	public void method2() {
		System.out.println("1)짝수 출력");
		System.out.println("2)홀수 출력");
		System.out.print("선택 : ");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		int i;
		//사용자가 선택한 값에 따라 1~10사이 정수 중
		// 짝수 또는 홀수만 출력
		
		if(sel == 1) {
			i = 2;
			while(i % 2 == 0 && i <= 10) {
				System.out.printf("%d ",i);
				i += 2;
			}
		}else if(sel == 2){
			i = 1;
			while(i % 2 != 0 && i <= 10) {
				System.out.printf("%d ",i);
				i += 2;
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
//        int i = 1;
//        
//        while(i <= 10)
//        {
//            if(sel == 1 && i%2 == 0)
//            {
//                System.out.println(i);
//            }
//            else if(sel == 2 && i%2 == 1)
//            {
//                System.out.println(i);
//            }
//            i++;
//        }
	}
	
	public void method3() {
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
		int i = 1;
		
		while (i<=random) {
			total += i++;
			//total = total + i; > i++;
//			i++;
		}
		System.out.print(total);
	}
	
	public void method4() {
		int sel = 3;
		do {
			System.out.println("1)짝수 출력");
			System.out.println("2)홀수 출력");
			System.out.println("3)종료");
			System.out.print("선택 : ");
			
			Scanner sc = new Scanner(System.in);
			sel = sc.nextInt();
			//method2()..
		      int i = 1;		      
		      while(i <= 10) {
		          if(sel == 1 && i%2 == 0){
		              System.out.println(i);
		          }
		          else if(sel == 2 && i%2 == 1){
		              System.out.println(i);
		          }
		          i++;
		      }
			
		} while (sel != 3);
	}
}
