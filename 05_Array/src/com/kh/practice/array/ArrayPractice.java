package com.kh.practice.array;

import java.math.*;
import java.util.*;


public class ArrayPractice {
	 public void practice1() {
//		 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 int[] arr = new int[10];
		 
		 for(int i = 0; i<10; i++) {
			 //인덱스 : 위치값
			 //배열 인덱스 : 배열의 위치값
			 //arr[??]//배열의 ??번째 위치
			 arr[i] = i+1;
			 //i = 0) arr[0] = 0+1 = 1;
			 //i = 1) arr[1] = 1+1 = 2;
			 //...
			 //i = 9) arr[9] = 9+1 = 10;
		 }
		 
//		 for(int i = arr.length-1; i>=0; i--) {
//		 //i = 9) arr[9] = 9+1 =10;
//		 arr[i] = i+1;
//		 System.out.print(arr[i] + " ");
//	 	}
		 
		 //arr 배결에 저장된 데이터 출력
		 //배열 길이 : (배열 변수명).length
		 for(int i = 0; i<arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
	 }
	 
	 public void practice2() {
//		 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 int[] arr = new int[10];
		 
		 for (int i = 0; i<arr.length; i++) {
			 arr[i]=arr.length - i;
			 System.out.print(arr[i] + " ");
		 }
		 
	 }
	 
	 public void practice3() {
//		 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		 Scanner sc = new Scanner(System.in);
		 System.out.print("양의 정수 : ");
		 int num = sc.nextInt();
		 sc.nextLine();
		 if(num>0) { 
			 int[] arr = new int[num];
			 for (int i = 0; i<num; i++) {
				 arr[i] = i+1;
			 }
			 for (int i = 0; i<arr.length; i++) {
				 System.out.print(arr[i] + " ");
			 }
		}
	 }
	 
	 public void practice4() {
//		 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		 배열 인덱스를 활용해서 귤을 출력하세요.
		 
		 String[] arr = new String[5];
		 arr = new String[]{"사과","귤","포도","복숭아","참외"};
//		 String[] arr = {"사과","귤","포도","복숭아","참외"};
		 
		 for (int i=0; i<arr.length; i++) {
			 //arr배열 데이터 중에 "귤"이 있으면 출력
			 if(arr[i].equals("귤")) {
				 System.out.println(arr[i]);
			 }
		 }
	 }
	 
	 public void practice5() {
//		 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		 Scanner sc = new Scanner(System.in);
		 System.out.print("문자열 : ");
		 String st = sc.nextLine();
		 char[] arr = new char[st.length()];
		 for (int i=0;i<st.length();i++) {
			 arr[i] = st.charAt(i);
		 }
		 
		 System.out.print("문자 : ");
		 char ch = sc.next().charAt(0);
		 sc.nextLine();
		 
		 String index = "";
		 int cnt = 0;
		 
		 for (int i=0;i<arr.length;i++) {
			 if(arr[i]==ch) {
				 index += i+ " ";
				 cnt++;
			 }
		 }
		 
		 System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s\n",st,ch,index);
		 System.out.printf("%c 개수 : %d\n", ch,cnt);	 
	 }
	 
	 public void practice6() {
//		 "월" ~ "일"까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다"를 출력하세요
		 String[] arr = {"월","화","수","목","금","토","일"};
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("0 ~ 6사이 숫자 입력: ");
		 int date = sc.nextInt();
		 if (date>=0 || date <=6) {
			 System.out.println(arr[date]);
		 }else {
			 System.out.println("잘못 입력하셨습니다.");
		 }
		 
	 }
	 
	 public void practice7() {
//		 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수: ");
		 int num = sc.nextInt();
		 sc.nextLine();
		 int[] arr = new int[num];
		 int count=0;
		 
		 for (int i = 0; i<num; i++) {
			 System.out.printf("배열 %d번째 인덱스에 넣을 값: ",i);
			 int j = sc.nextInt();
			 sc.nextLine();
			 arr[i]=j;
			 count += j;
		 }
		 for (int i = 0; i<arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
		 System.out.println();
		 System.out.println("총 합 : "+count);
	 }
	 
	 public void practice8() {
//		 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		 다시 정수를 받도록 하세요.
		 Scanner sc = new Scanner(System.in);
		 int num;
		 
		 while(true){
			 System.out.print("3이상인 홀수 (정수): ");
			 num = sc.nextInt();
			 sc.nextLine();
			 int[] arr = new int[num];
			 int a=1;
			 
			 if(num<3 || num%2==0) {
				 System.out.println("다시 입력하세요.");
			 }else {
				 int i=0;
				 for (i = 0; i < arr.length; i++) {
						if (i < arr.length / 2) {
							arr[i] = a++;
						}else {
							arr[i] = a--;
						}
						if (i < arr.length - 1) {
							System.out.print(arr[i] + ", ");
						}else {
							System.out.println(arr[i]);
						}
					}
				 break;
			 }
		 }
	 }
	 
	 public void practice9() {
//		 사용자가 입력한 값이 배열에 있는지 검색하여
//		 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
//		 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		 
		 String[] arr = {"후라이드","양념","파닭","간장","반반"};
		 Scanner sc = new Scanner(System.in);
		 System.out.print("치킨 이름을 입력하세요 : ");
		 String ch = sc.nextLine();
		 String result="";
		 
		 for (int i=0;i<arr.length;i++) {
			 if(arr[i].equals(ch)) {
				result=" 치킨배달 가능";
				break;
			 }else {
				result=" 치킨은 없는 메뉴입니다.";
			 }
		 }
		 System.out.println(ch+result);
	 }
	 
	 public void practice10() {
//		 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//		 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		 Scanner sc = new Scanner(System.in);
		 System.out.print("주민등록번호(-포함) : ");
		 String ssn = sc.nextLine();
		 char[] arr = new char[ssn.length()];
		 
		 for (int i=0;i<ssn.length();i++) {
			 arr[i] = ssn.charAt(i);
		 }
		 
		 //char[] copy = org;  //얉은 복사, 원본이 훼손됨.
		 char[] copy = arr.clone();//깊은 복사
		 for(int i=8; i<copy.length; i++) {
			 copy[i] = '*';
		 }
//		 copy.toString(); => 주소값
//		 String = char[] => 문자가 여러개 모이면 문자열
//		 charAt(i)
		 System.out.println(copy);
	 }
	 
	 public void practice11() {
//		 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		 int[] arr = new int[10];
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i] = (int)((Math.random()*10)+1);
			 System.out.print(arr[i] + " ");
		 }
	 }
	 
	 public void practice12() {
//		 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		 1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		 int[] arr = new int[10];
		 int max = 1;
		 int min = 10;
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i] = (int)((Math.random()*10)+1);
			 System.out.print(arr[i] + " ");
			 if (arr[i]>max) {
				 max = arr[i];
			 } else if (arr[i]<min) {
				 min = arr[i];
			 }
		 }
		 System.out.println();
		 System.out.println("최대값 : "+max);
		 System.out.println("최소값 : "+min);
	 }
	 
	 public void practice13() {
//		 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		 int[] arr = new int[10];
		 
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = (int)((Math.random()*10)+1);
			 for(int j=0; j<i; j++) { //랜덤값 중복 안되게 이전값 j를 선언하여
				 if(arr[i]==arr[j]) { //랜덤값이 같으면 i를 다시 선언
					 i--;
					 break;
				 }
			 }
		 }
		 for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
	 }
	 
	 public void practice14() {
//		 로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
//		 1~45 6개의 숫자
		 int[] lotto = new int[7];
		 
		 for(int i=0;i<lotto.length;i++) {
			 lotto[i] = (int)((Math.random()*45)+1);//1~45
			 for(int j=0;j<i;j++) {
				 if(lotto[i]==lotto[j]) {
					 i--;
					 break;
				 }
			 }
		 }
		 
		 Arrays.sort(lotto);//오름차순
//		 Arrays.sort(lotto, Collections.reverseOrder());//내림차순
		 
		 for(int i=0;i<lotto.length;i++) {
			 if (i == lotto.length-1) {
				 System.out.print("보너스 번호 :"+lotto[i]);
			 } else {
				 System.out.print(lotto[i]+" ");
			 }
		 }
	 }
	 
	 public void practice14_1() {
		 // 로또 6자리 숫자를 보관하기 위한 배열 선언
	      int[] lotto = new int[6];
	      
	      //lotto라는 배열에 값을 대입하기 위해 반복
	      for(int i=0; i < lotto.length; i++) {
	            // 랜덤 값 : 1 ~ 45
	            int random = (int)(Math.random() * 45 + 1);
	            // i=0) 첫번째 위치는 랜덤값 대입하고 반복문 진행
	            lotto[i] = random;
	            
	            // i > 0
	            // i = 1) lotto[0] == random
	            // i = 2) lotto[0] == random
	            //        lotto[1] == random // i-1
	            // i = 3) lotto[0] == random
	            //        lotto[1] == random
	            //        lotto[2] == random // i-1
	            for(int j=0; j < i; j++) {
	               // 중복을 체크
	               if(lotto[j] == random) {
	                  i--; // i=1이라면 i=0
	                  break;
	               }
	           }
	      }
	      
	      // 정렬
	     //오름차순 정렬 방법2(버블 정렬)
	      for(int i=0; i < lotto.length; i++) {
	    	  for(int j=i+1; j<lotto.length; j++) {
	    		  //i:현재위치
	    		  //j:현재위치+1 => 비교할 대상
	    		  if(lotto[i]>lotto[j]) { 
	    			  int temp = lotto[i]; //변수에 먼저 기존 j배열 값을 대입
	    			  lotto[i] = lotto[j];
	    			  lotto[j] = temp;
	    		  }
	    	  }
	      }
	      
	      for(int i=0; i < lotto.length; i++) {
	         System.out.print(lotto[i] + " ");
	      }
		 
	 }
	 
	 public void practice15() {
//		 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		 문자의 개수와 함께 출력하세요.
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("문자열 : ");
		 String str = sc.nextLine();
		 char[] ch = new char[str.length()];
		 int count = 0;
		 
		 System.out.print("문자열에 있는 문자 : ");
		 for(int i=0;i<ch.length;i++) {
			 ch[i] = str.charAt(i);
			 count++;
			 if(i==ch.length-1) {
				 System.out.print(ch[i]+"\n");
			 }else {
				 System.out.print(ch[i]+", ");
			 }
		 }
		 System.out.println("문자개수 : "+count);
	 }
	 
	 public void practice16() {
//		 사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		 Scanner sc = new Scanner(System.in);
		 int num = 0;
		 char an = 'y';
				 
		 System.out.print("배열의 크기를 입력하세요 : ");
		 num = sc.nextInt();
		 sc.nextLine();
		 String[] arr = new String[num]; //선언
		 String[] arr2 = null;
		 int cnt =0;
		 
		 for(int i=0;i<arr.length; i++) {
			 System.out.print((i+1)+"번째 문자열 : ");
			 String str = sc.nextLine();
			 arr[i] = str;
		 }
			 
		 do {
			 System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			 an = sc.next().charAt(0);
			 if (an == 'y' || an == 'Y') {
				 System.out.print("더 입력하고싶은 개수 : ");
				 int pl = sc.nextInt();
				 sc.nextLine(); 
				 cnt++;
				 
				 arr2 = new String[arr.length + pl];
				 System.arraycopy(arr, 0, arr2, 0, arr.length);
				 for(int i=arr.length;i<arr2.length; i++) {
					 System.out.print((i+1)+"번째 문자열 : ");
					 String str = sc.nextLine();
					 arr2[i] = str;
				 }
				 arr=arr2;
			 }
			 if (cnt==0) {
				 arr2=arr;
			 }
		  }while(an != 'n' || an != 'n');
		 
		 System.out.println(Arrays.toString(arr2)); //문자열 배열 출력
			 
	 	}
	
}
