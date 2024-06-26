package com.kh.collection;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		//데이터 추가 : add({데이터})
		treeSet.add("핫식스");
		treeSet.add("아메리카노");
		treeSet.add("몬스터");
		
		for(String item: treeSet) {
			System.out.println(item); //순서 상관없이 나옴
		}
		
		System.out.println("----------------------------------");
		treeSet.add("핫식스");
		System.out.println(treeSet); //중복이 안됨.
	}
}
