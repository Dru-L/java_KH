package com.kh.practice;
import java.util.Scanner;

public class ControlPractice {
	public void method1() {
		//정수를 입력 받아 1 ~ 100 사이의 값인 경우 입력 값을 출력하고,
		//범위를 벗어난 경우 "잘못 입력되었습니다."를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("1~100사이 숫자 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if (num >= 1 && num <= 100) {
			System.out.println("결과 : " + num);
		}else {
			System.out.println("잘못 입력되었습니다.");
		}
	}
	
	public void method2() {
//		실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하고
//		세 과목 점수 40점 이상이고, 평균이 60점 이상인 경우 "합격" 그렇지 않으면 "불합격"을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("국어:");
		double ko = sc.nextDouble();
		System.out.print("영어:");
		double eng = sc.nextDouble();
		System.out.print("수학:");
		double math = sc.nextDouble();
		sc.nextLine();
		
		int total = (int)(ko + eng + math);
		int avg = total/3;
		System.out.printf("총점은 %d점이고, 평균은 %d점입니다.\n",total,avg);
		
		if ((ko>=40 && eng>=40 && math>=40)&&(avg>=60)) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void method3() {
//		키와 몸무게를 입력받아 BMI를 계산하여 저체중/정상체중/과체중/비만을 출력하세요.
//		BMI 계산식 : 몸무게(kg)/(키(m) x 키(m))
//		저체중: 18.5 이하, 정상체중: 18.5 ~ 22.9, 과체중: 23.0 ~ 24.9, 비만: 25.0 이상
		Scanner sc = new Scanner(System.in);
		System.out.print("키(cm) : ");
		double cm = sc.nextDouble();
		System.out.print("몸무게(kg) : ");
		double kg = sc.nextDouble();
		sc.nextLine();
		
		//키 cm => m
		cm /= 100; //cm*=0.01
		double bmi = (kg/(cm*cm));
		
		String result = "";
		if (bmi <= 18.4) {
			result="저체중";
		}else if ((bmi >= 18.5) && (bmi <= 22.9)) {
			result="정상체중";
		}else if ((bmi >= 23.0) && (bmi <= 24.9)) {
			result="과체중";
		}else {
			result="비만";
		}
		
		System.out.printf("BMI는 %.1f로 %s입니다.",bmi, result);
	}
	
	public void method4() {
//		사용자로부터 아이디와 비밀번호를 입력받아 미리 저장된 값과 비교하여 같을 경우 "로그인 성공",
//		그렇지 않은 경우 "로그인 실패"를 출력하세요. (초기값=>아이디: kh_manager, 비밀번호: 1234567)
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		final String _id = "kh_manager";
		final String _pw = "1234567";
		
		//문자열이 같은지 비교하는 메소드 A.equals(B) : A와 B가 같으면 true, 다르면 false
		if (id.equals(_id) && pw.equals(_pw)) {
			System.out.println("로그인 성공");
		} else if (id.equals(_id)) {
			System.out.println("비밀번호 틀림");
		} else if (pw.equals(_pw)) {
			System.out.println("아이디 틀림");
		} else {
			System.out.println("로그인 오류");
		}
	}
	
	public void method5() {
//		정수를 2개와 연산 기호를 입력받아 연산 결과를 출력하세요.
//		연산 기호를 잘못 입력했을 경우 "입력이 잘못되었습니다."라고 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자 입력: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("연산기호 입력(+, -, *, /, %) : ");
		char sum = sc.next().charAt(0);
		sc.nextLine();
		
		switch(sum){
		case '+': 
			System.out.println("결과 :"+ (a + b));
			break;
		case '-':
			System.out.println("결과 :"+ (a - b));
			break;
		case '*':
			System.out.println("결과 :"+ (a * b));
			break;
		case '/':
			System.out.println("결과 :"+ (a / b));
			break;
		case '%':
			System.out.println("결과 :"+ (a % b));
			break;
			default:
				System.out.println("입력이 잘못되었습니다.");
		}
		
	}
	
	public void method6() {
//		임의의 값을 입력 받아 가운데 값만 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		String word = sc.nextLine();
		int center = word.length() / 2;
		
//		if (word.length() % 2 != 0) { //길이가 홀수일때
//			System.out.println("결과 :"+ word.charAt(center));
//		}else { //길이가 짝수일때
//			System.out.println("결과 :"+ word.charAt(center-1) + word.charAt(center));
//		}
		
		if (word.length() % 2 == 0) { //길이가 짝수일때는 가운데 문자 중 앞의 문자를 출력하자
			center--;
		}
		
		char ch = word.charAt(center);
		System.out.println("결과 :"+ch);
		
	}
	
	public void method7() {
//		두 자리 정수를 입력 받아 10의 자리 수와 1의 자리수가 같은 경우 “10의 자리와 1의 자리의 수가
//		같습니다.” 출력, 다른 경우 큰 값에서 작은 값을 뺀 결과를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("두 자리의 정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(10<= num && num <= 99) {
			int ap = num/10;
			int dui = num % 10;
			
			if(ap == dui) {
				System.out.println("10의 자리 수와 1의 자리 수가 같습니다.");
			}else {
				int result = ap < dui ? dui - ap : ap - dui;
				System.out.println("결과 : "+ result);				
			}
		}
	}
	
	public void method8() {
//		은행에 돈을 맡기기 위해 입금 금액 입력 시
//		5만원권, 1만원권, 5천원권, 1천원권 개수와 동전 금액을 출력 (사용자의 입력은 정수로 받음)
		Scanner sc = new Scanner(System.in);
		System.out.print("입금 금액: ");
		int num = sc.nextInt();
		
		int m50 = num / 50000;
		num %= 50000;
		int m10 = num / 10000;
		num %= 10000;
		int m5 = num / 5000;
		num %= 5000;
		int m1 = num / 1000;
		num %= 1000;
		System.out.printf("5만원권: %d\n1만원권: %d\n5천원권: %d\n1천원권: %d\n동전 금액: %d\n",m50,m10,m5,m1,num);		
		
//		int _man = num /10000;
//		int _5man = 0;
//		if (_man >= 5) {
//			_5man = 1; //1
//			_man -= 5; //8-5 =3
//		}
//		num %= 10000;
//		System.out.println("5만원권: "+_5man);
//		System.out.println("1만원권: "+_man);
//		
//		int _1000 = num / 1000; //3
//		int _5000 = 0;
//		if (_1000 >= 5) {
//			_5000 = 1;
//			_1000 -= 5;
//		}
//		num %= 1000;
//		System.out.println("5천원권: "+_5000);
//		System.out.println("1천원권: "+_1000);
//		
//		System.out.println("동전 금액 :" + num);
	}
	
	public void method9() {
//		태어난 해, 월, 일을 입력받아 사주팔자를 보는 프로그램을 작성하시오.
//		사주를 보는 방법)
//		세 수(년,월,일)가 주어지면,  (년 - 월 + 일)에 마지막 숫자가 0이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		int t = y - m + d;
		
		if (t%10 == 0) {
			System.out.println("대박");
		}else {
			System.out.println("그럭저럭");
		}
	}
	public void method10() {
//		태어난 해, 월, 일을 입력받아 사주팔자를 보는 프로그램을 작성하시오.
//		사주를 보는 방법)
//		세 수(년,월,일)가 주어지면,  (년 + 월 + 일)에 100의 자리 숫자가 짝수이면 "대박"을 출력, 그렇지 않으면 "그럭저럭"을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		
		int t = ((y + m + d)/100)%10;
		
		if (t % 2 == 0) {
			System.out.println("대박");
		}else {
			System.out.println("그럭저럭");
		}
	}
	
	public void method11() {
//		수호는 30분 전으로 돌아가고 싶은 1人 이다.
//		공백을 기준으로 시간과 분이 주어진다.
//		그러면 이 시간을 기준으로 30분전의 시간을 출력하시오. (시의 범위 : 0~ 23) (분의 범위 : 0~ 59)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m >= 30) {
            m -= 30;
        } else {
            if (h == 0) {
                h = 23;
            } else {
                h--;
            }
            m += 30;
        }
		System.out.println(h + " " + m);
	}
}
