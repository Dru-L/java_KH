package com.kh.example;
import java.util.*;

public class Example01 {
//1) programmers 홀수 vs 짝수
//	문제 설명
//	정수 리스트 num_list가 주어집니다. 
//	가장 첫 번째 원소를 1번 원소라고 할 때, 
//	홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 
//	큰 값을 return 하도록 solution 함수를 완성해주세요. 두 값이 같을 경우 그 값을 return합니다.
//
//	제한사항
//	5 ≤ num_list의 길이 ≤ 50
//	-9 ≤ num_list의 원소 ≤ 9
//
//	입출력 예
//	num_list	result
//	[4, 2, 6, 1, 7, 6]	17
//	[-1, 2, 5, 6, 3]	8
//
//	입출력 예 설명
//	입출력 예 #1
//	홀수 번째 원소들의 합은 4 + 6 + 7 = 17, 짝수 번째 원소들의 합은 2 + 1 + 6 = 9 이므로 17을 return합니다.
//
//	입출력 예 #2
//	홀수 번째 원소들의 합은 -1 + 5 + 3 = 7, 짝수 번째 원소들의 합은 2 + 6 = 8 이므로 8을 return합니다.
	ArrayList<Integer> num_list;
	int even = 0; //짝수
	int odd  = 0; //홀수
	
	public Example01(){
		num_list = new ArrayList<>();
	}
	
	public int addNumList(int num) {
		num_list.add(num);
		return num;
	}
	
	public int solution() {
		int last = 0;
		if(num_list.size()>=5 && num_list.size()<=50) {
			for(int i=0;i<num_list.size();i++) {
				if (num_list.get(i)>9 || num_list.get(i)<-9){
					System.out.println("잘못 입력되었습니다.");
				}else if(i % 2 ==0) {
					even += num_list.get(i);
				}else {
					odd += num_list.get(i);
				}
			}
			if (even>=odd) {
				last = even;
			}else {
				last = odd;
			}
		}else {
			System.out.println("잘못 입력되었습니다.");
		}
		System.out.println(last);
		return last;
	}
	

}
