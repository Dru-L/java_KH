package com.kh.collection;

import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		//데이터 추가 :add({데이터})
		list.add("apple"); //0
		list.add("banana");	//1
		list.add("melon");//2

		System.out.println(list); //[apple, banana, melon]
		
		//데이터 추가2 : add({위치}, {데이터})
		list.add(1, "kiwi");
		System.out.println(list); //[apple, kiwi, banana, melon]
		
		//데이터 추가3 : addFirst({데이터}) <= 첫번째위치에 데이터 추가
		list.addFirst("cherry");
		System.out.println(list); //[cherry, apple, kiwi, banana, melon]
		
		//데이터 삭제 : removeLast()
		// 마지막 위치의 데이터를 제거 후 반환
		System.out.println(list.removeLast()); // melon
		
		list.add("kiwi");	//중복 가능함.
		System.out.println(list); //[cherry, apple, kiwi, banana, kiwi]
	}
}
