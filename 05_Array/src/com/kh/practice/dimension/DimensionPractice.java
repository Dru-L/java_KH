package com.kh.practice.dimension;

import java.math.*;
import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
//		3행 3열짜리 문자열 배열을 선언 및 할당하고
//		인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		String[][] str = new String[3][3];

		// 2차원 배열의 행에 해당하는 인덱스를 제어
		for (int i = 0; i < 3; i++) {
			// 2차원 배열의 열에 해당하는 인데스를 제어
			for (int j = 0; j < 3; j++) {
				// "(0,0)"형식으로 저장
				str[i][j] = "(" + i + "," + j + ")";
			}
		}
		// 출력
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(str[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 1 ~ 16까지 값을 차례대로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.
		int[][] arr = new int[4][4];
		int num = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				// arr[i][j] = (j+1) + (i*4);
				arr[i][j] = num++;
				if (arr[i][j] < 10)
					System.out.print(" ");
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.
		int[][] arr = new int[4][4];
		int num = 16;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = num--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice4() {
//		4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후 처리하세요.
		final int ROW = 4;
		final int COL = 4;
		int[][] nums = new int[ROW][COL];

		// 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장
		for (int i = 0; i < ROW - 1; i++) { // 행의 인덱스
			for (int j = 0; j < COL - 1; j++) { // 열의 인덱스
				// 임의의 정수값 =>랜덤값
				int random = (int) ((Math.random() * 10) + 1);
				nums[i][j] = random;
			}
		}

		// 3열:각 행값들의 합
		// 0행 => (0,3) = (0,0) + (0,1) + (0,2)
		// 1행 => (1,3) = (1,0) + (1,1) + (1,2)
		// 2행 => (2,3) = (2,0) + (2,1) + (2,2)
		for (int i = 0; i < ROW - 1; i++) {
			for (int j = 0; j < COL - 1; j++) {
				nums[i][3] += nums[i][j];
				// i=0, j=0) nums[0][3] =nums[0][3] + nums[0][0];
				// i=0, j=1) nums[0][3] =nums[0][3] + nums[0][1];
				// i=0, j=2) nums[0][3] =nums[0][3] + nums[0][2];
			}
		}

		// 3행: 각 열값들의 합
		// (3,0) = (0,0) + (1,0) + (2,0)
		// (3,1) = (0,1) + (1,1) + (2,1)
		// (3,2) = (0,2) + (1,2) + (2,2)
		// (3,3) = (0,3)+(1,3)+(2,3)+ (3,0)+(3,1)+(3,2)
		int sum = 0;
		for (int i = 0; i < COL; i++) { // 열 인덱스
			for (int j = 0; j < ROW - 1; j++) { // 행 인덱스
				nums[3][i] += nums[j][i];
			}

			if (i == 3) {
				sum += nums[3][i];
				continue;
			}

			sum += nums[3][i];
		}

		// 결과 출력
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void practice5() {
//		2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
//		“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
//		크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
//		(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄)
		Scanner sc = new Scanner(System.in);
		System.out.print("행 크기: ");
		int row = sc.nextInt();
		System.out.print("열 크기: ");
		int col = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[row][col];

		if (row < 0 || row > 11 || col < 0 || row > 11) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		} else {
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					char al = (char) ((int) ((Math.random() * 26) + 65)); // 65~90 대문자
					// (char)((int)(Math.random()*26)+97) 소문자
					arr[i][j] = al;
					System.out.print((char) arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

	public void practice6() {
//		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
//			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
//			위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제4 흐름’과 같은 방식으로 출력하세요.
//			단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public void practice7() {
//		사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
//		문자형 가변 배열을 선언 및 할당하세요.
//		그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 크기: ");
		int row = sc.nextInt();
		sc.nextLine();
		int alphabet = 97;
		char[][] chr = new char[row][];

		for (int i = 0; i < row; i++) {
			System.out.print(i + "행의 열 크기: ");
			int col = sc.nextInt();
			sc.nextLine();

			chr[i] = new char[col]; // 1차원 배열에 새로운 1차원 배열 선언

			for (int j = 0; j < col; j++) {
				if (col != 0) {
					chr[i][j] = (char) alphabet;
					alphabet++;
				}
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < chr[i].length; j++) {
				System.out.print(chr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {
//		1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
//		2열 3행으로 2차원 배열 2개를 이용하여 분단을 나눠
//		1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
//		<출석부>
//		1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
//		7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];

		int num = 0;

		System.out.println("== 1분단 ==");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				group1[i][j] = students[num];
				num++;
				System.out.print(group1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				group2[i][j] = students[num];
				num++;
				System.out.print(group2[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice9() {
//		위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여
//		해당 학생이 어느 자리에 앉았는지 출력하세요.
		Scanner sc = new Scanner(System.in);
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];

		int index = 0;
		// 2차원 배열에 대입
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 2; c++) {
				group1[r][c] = students[index];
				group2[r][c] = students[index + 6];
				index++;
			}
		}

		// 출력
		System.out.println("== 1분단 ==");
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 2; c++) {
				System.out.print(group1[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 2; c++) {
				System.out.print(group2[r][c] + " ");
			}
			System.out.println();
		}

		// 검색기능
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();

		// 1분단(group1), 2분단(group2)에서 검색
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 2; c++) {
				if (group1[r][c].equals(name)) {
					System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 %s에 있습니다.\n", name, (r + 1), (c == 0 ? "왼쪽" : "오른쪽"));
					break;
				}else if(group2[r][c].equals(name)) {
					System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 %s에 있습니다.\n", name, (r + 1), (c == 0 ? "왼쪽" : "오른쪽"));
					break;
				}
			}
		}
	}

	public void practice10() {
//		String 2차원 배열 6행 6열을 만들고 행의 맨 위와 열의 맨 앞은 각 인덱스를 저장하세요.
//		그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요.
		String[][] str = new String[6][6];

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 0 && j > 0) {
					str[0][j] = (j - 1) + "";
				} else if (j == 0 && i > 0) {
					str[i][0] = (i - 1) + "";
					;
				} else {
					str[i][j] = " ";
				}
			}
		}

		while (true) {
			System.out.print("행 인덱스 입력 : ");
			y = sc.nextInt();
			if (y == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.print("열 인덱스 입력 : ");
			x = sc.nextInt();
			sc.nextLine();
			// 입력받은 인덱스는 x+1, y+1을 해야함
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (i == x + 1 && j == y + 1) {
						str[i][j] = "X";
					}
					System.out.print(str[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
}
