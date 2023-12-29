package com.kh.practice.comp.func;
import java.math.*;
import java.util.Scanner;

public class RockPaperScissors {
	public void rps() {
//		사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
//		랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
//		사용자가 “exit”를 입력하기 전까지 가위바위보를 계속 진행하고 “exit”가 들어가면 반복을 멈추고
//		몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int win = 0;
		int lose = 0;
		int cp = 0;
		String crps = "";
		String prps = "";
		String answer = "";
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		do {
			int random = (int)((Math.random()*3)+1);//랜덤값 1,2,3

			if (random == 1) {
				crps = "가위";
			} else if (random == 2) {
				crps = "바위";
			} else {
				crps = "보";
			}
			
			System.out.print("가위바위보 : ");
			prps = sc.nextLine();
			
			if (prps.equals("가위")) {
				switch (random) {
				case 1:
					answer = "비겼습니다.";
					cp++;
					break;
				case 2:
					answer = "졌습니다.";
					lose++;
					break;
				case 3:
					answer = "이겼습니다.";
					win++;
					break;
				}
				total++;
				System.out.printf("컴퓨터 : %s\n%s : %s\n%s\n",crps,name,prps,answer);
			}else if(prps.equals("바위")) {
				switch (random) {
				case 1:
					answer = "이겼습니다.";
					win++;
					break;
				case 2:
					answer = "비겼습니다.";
					cp++;
					break;
				case 3:
					answer = "졌습니다.";
					lose++;
					break;
				}
				total++;
				System.out.printf("컴퓨터 : %s\n%s : %s\n%s\n",crps,name,prps,answer);
			}else if(prps.equals("보")) {
				switch (random) {
				case 1:
					answer = "졌습니다.";
					lose++;
					break;
				case 2:
					answer = "이겼습니다.";
					win++;
					break;
				case 3:
					answer = "비겼습니다.";
					cp++;
					break;
				}
				total++;
				System.out.printf("컴퓨터 : %s\n%s : %s\n%s\n",crps,name,prps,answer);
			}
		}while(!prps.equals("exit"));
		System.out.printf("%d전 %d승 %d무 %d패", total, win, cp, lose);
		
	}
}
