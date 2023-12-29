package com.kh;
import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
	//	practice1();
	//	practice2();
		practice3();
	//	practice4();
	}
	
	public static void practice1() {
		// 실습문제 1.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String gender = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		double cm = sc.nextDouble();
		
		System.out.println("키 " + cm + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다. ^^");
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다. ^^", cm, age, gender, name);
	}
	
	public static void practice2() {
		// 실습문제 2.
		Scanner pl = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int n1 = pl.nextInt();
		
		System.out.print("두번째 정수 : ");
		int n2 = pl.nextInt();
		
		int p = n1 + n2;
		int mi = n1 - n2;
		int mu = n1 * n2;
		int d = n1 / n2;
		
		System.out.println("더하기 결과 : " + p + "\n" + "빼기 결과 : " + mi + "\n" + "곱하기 결과 : " + mu + "\n" + "나누기 결과 : " + d);
		System.out.printf("더하기 결과 : %d\n빼기 결과 : %d\n곱하기 결과 : %d\n나누기 결과 : %d", p, mi, mu, d);
	}
	
	public static void practice3() {
		// 실습문제 3.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double w = sc.nextDouble();
		
		System.out.print("세로 : ");
		double h = sc.nextDouble();
		
		double area = w * h;
		double per = (w + h) *2 ;
		
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + per);
		System.out.printf("면적 : %.2f\n둘레 : %.1f", area, per);
	}
	
	public static void practice4() {
		// 실습문제 4.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
		
		char w1 = word.charAt(0); //해당 문자열의 첫번째 문자
		char w2 = word.charAt(1);
		char w3 = word.charAt(2);
		
		System.out.println("첫 번째 문자 : " + w1 + "\n" + "두 번째 문자 : " + w2 + "\n" + "세 번째 문자 : " + w3);
		System.out.printf("첫 번째 문자 : %c\n두 번째 문자 : %c\n세 번째 문자 : %c\n", w1, w2, w3);		
	}
}
