package com.kh;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		test00();
		test01();
		test02();
	}

public static void test00(){
	Scanner sc = new Scanner(System.in);
	String word = sc.nextLine();
	char w1 = word.charAt(0);
	char w2 = word.charAt(1);
	char w3 = word.charAt(2);
	System.out.print(w3 + " " + w1);
}

public static void test01(){
	
	//정수 3개가 공백을 두고 입력이 될 때
	// ex) 10 34 56
      Scanner sc = new Scanner(System.in);
      int a, b, c;
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      
      int p = a + b + c;
      double n = (double)p/3;
      
      System.out.println(p);
      //평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
      System.out.println(String.format("%.1f", n));
      
      /*double pie = 3.14159265358979; //반올림 
		System.out.println(Math.round(pie)); //결과 : 3
		System.out.println(Math.round(pie*100)/100.0); //결과 : 3.14
		System.out.println(Math.round(pie*1000)/1000.0); //결과 : 3.142
		
		System.out.println(String.format("%.2f", pie)); //결과 : 3.14
		System.out.println(String.format("%.3f", pie)); //결과 : 3.142
       */
	
 }

 public static void test02(){
	 Scanner sc = new Scanner(System.in);
      int a, b;
      a=sc.nextInt();
      b=sc.nextInt();
      
      if (a==b) {
    	  System.out.println(1);
      }else {
    	  System.out.println(0);
      }
      //int result = (b >= a) ? 1 : 0;
    	  
 }
}
