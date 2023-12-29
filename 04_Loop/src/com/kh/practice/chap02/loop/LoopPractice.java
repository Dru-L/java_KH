package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice3() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			for (; num>=1; num--) {
				System.out.printf("%d ",num);
			}	
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
	
	public void practice2() {
//		위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else {
				for (int i=1; i<=num; i++) {
					System.out.printf("%d ",i);
			}
//			break;
		}
	}while(num<1);
//	}while(true);
}
	
	public void practice6() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 >= 1 && num2 >= 1) {
			int min = num1>num2 ? num2 : num1;
			int max = num1<num2 ? num2 : num1;
			
			//for (int i = min; i<=max; i++) {
			for(; min<=max; min++){
				System.out.print(min + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	
	 public void practice11() {
//		 사용자로부터 시작 숫자와 공차를 입력 받아
//		 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.(증가할지 감소할지 조건 추가)
//		 단, 출력되는 숫자는 총 10개입니다.
		 Scanner sc = new Scanner(System.in);
			System.out.print("시작 숫자 : ");
			int start = sc.nextInt();
			System.out.print("공차 : ");
			int to = sc.nextInt();
			sc.nextLine();
			System.out.print("증가/감소 : ");
			String op = sc.nextLine();
			
			int i = 0;
			if (op.equals("증가")) {
				while(i<10) {
					System.out.printf("%d ",start);
					start += to;
					i++;
				}
			}else if(op.equals("감소")){
				while(i<10) {
					System.out.printf("%d ",start);
					start -= to;
					i++;
				}
			}else {
				System.out.println("올바른 증가/감소를 적어주세요.");
			}
	 }
	 
	 public void practice12() {
//		 정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
//		 단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
//		 exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
//		 또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
//		 “0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
//		 없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
//		 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
			System.out.println("종료 시 연산자 입력에 exit을 입력해주세요.");
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			if (op.equals("exit")) {
				System.out.println("종료");
				break;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();	
			
			String result = (num1 + " " + op + " " + num2 + " = ");
			  
			  switch(op) {
			  case "+":
//				  System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
				  result += (num1+num2);
				  break;
			  case "-":
//				  System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
				  result += (num1-num2);
				  break;
			  case "*":
//				  System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));
				  result += (num1*num2);
				  break;
			  case "/":
			  case "%":
				  if(num2 == 0){
					result="0으로 나눌 수 없습니다. 다시 입력해주세요.";
					}else {
						if(op.equals("/")) {
							result += (num1/num2);
						}else {
							result += (num1%num2);
						}
						result += ((op.equals("/"))?(num1/num2):(num1%num2));
					}
				  break;
		 		  default:
		 			 result="없는 연산자입니다. 다시 입력해주세요.";
			  }
			  System.out.println(result);
		 }
	 }
	 
	 public void practice13() {
//		 다음과 같은 실행 예제를 구현하세요.
//		 정수 입력 : 4
//		 *
//		 **
//		 ***
//		 ****
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 입력 : ");
		 int num = sc.nextInt();
		 sc.nextLine();	
//		 String star = "*";
		 
//		 for(int i = 1; i<=num; i++) {
//			 System.out.println(star);
//			 star += "*";
//		 }
		 
		 for(int i = 1; i<=num; i++) {
			//*을 출력. 시작점: 1, 끝점 : 줄 수
			 for (int j = 1; j <= i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 
	 public void practice14() {
//		 다음과 같은 실행 예제를 구현하세요.
//		 정수 입력 : 4
//		 ****
//		 ***
//		 **
//		 *
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 입력 : ");
		 int num = sc.nextInt();
		 sc.nextLine();	
		 
		 //시작점 : 입력값(num),끝점:1
		 for(int i = num; i>=1; i--) {
			 for (int j = 1; j <= i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 
	 public void practice15() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("1 ~ 10까지의 정수 중 하나를 고르시오. : ");
		 int sel = sc.nextInt();
		 if (sel < 1 || sel > 10) {
		 System.out.println("범위를 벗어난 값이 입력되었습니다.");
		 } else {
		 int total = 0;
		 for (int i=1; i<=sel; i++) {
		 total += i;
		 }
		 System.out.printf("1부터 %d까지의 총 합은 %d입니다.\n", sel, total);
		 }


	 }

}
