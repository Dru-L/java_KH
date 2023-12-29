package com.kh.collection;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	//Map : key-value. 한쌍으로 데이터를 관리하는 구조
	//	HashMap<Key로 사용할 데이터타입, Value로 사용할 데이터타입>
	
	//멤버변수 : HashMap 컬렉션 클래스. 변수명 : hashMap
	//			key : 정수형, value : Member 타입
	HashMap<Integer, Member>hashMap;
	//생성자
	//선언한 변수 hashMap에 HashMap 컬렉션 클래스의 인스턴스 생성 후 초기화
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	//[1]데이터 추가. +addMember
	//		매개변수 : Member 타입의 데이터
	//		key: 고객번호를 사용, value: 멤버객체
	//		* Map 컬렉션에서 데이터 추가 : put()사용
	public void addMember(Member m) {
		hashMap.put(m.getMemberId(),m);
	}
	
	//[2]데이터 제거. +removeMember
	//		매개변수 : 고객번호
	//		Map에 데이터가 있는 경우 제거. 결과 true/false 반환.
	//		 - key로 데이터를 관리할 수 있음
	//			* containsKey(key값) : 해당 key값이 Map에 있는지 조회(T/F)
	//		 - Map 컬렉션에서 데이터 삭제 : remove(key 값) 사용
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 없습니다.");
		return false;
	}
	
	//[3]전체 데이터 출력. (+)
	//		* Iterator 사용 시 key를 기준으로 사용.
	//			- keySet() : 키 목록을 조회하는 메소드
	//			- get()    : 키 값을 기준으로 데이터를 조회
	public void printAll() {
		Iterator<Integer> itr = hashMap.keySet().iterator();
		
		while(itr.hasNext()) { //다음 데이터가 있는지 확인
			int key = itr.next(); // 데이터를 꺼내오는 부분(key 값)
			//hashMap 에서 key를 기준으로 value를 조회
			Member member = hashMap.get(key);
			System.out.println(member); //member.toString()호출
		}
	}
	
	public static void main(String[] args) {
		MemberHashMap mhm = new MemberHashMap();
		
		//객체 매개변수 정의 -> 호출 시 인스턴스 전달
		//addMember(Member m) -> addMember(new Member(1, "민지"));
		mhm.addMember(new Member(1,"민지"));
		mhm.addMember(new Member(2,"수정"));
		
		Member m = new Member(3, "정민");
		mhm.addMember(m);
		
		mhm.printAll();
		
		mhm.removeMember(0);
		mhm.removeMember(2);
		
		mhm.printAll();
	}
	
}
