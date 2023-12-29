package com.kh.practice.comp.func;
import java.math.*;
import java.util.*;

public class UpAndDown {
	public void upDown() {
//		1부터 100 사이의 정수 중 임의의 난수가 정해지고 사용자는 정해진 난수를 맞추는데
//		몇 번 만에 맞췄는지 출력하세요.
		int random = (int)((Math.random()*100)+1);//랜덤값 1~100
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 0;
		
		do {
			System.out.print("1~100사이의 임의의 난수를 맞춰보세요 : ");
			num = sc.nextInt();
			if (random < num) {
				System.out.println("Down !");
			}else if(random > num){
				System.out.println("Up !");
			}
			count++;
		}while(random != num);
		System.out.println("정답입니다 !!");
		System.out.println(count + "회 만에 맞추셨습니다.");
	}
}
