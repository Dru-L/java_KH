package com.kh.collection;

import java.util.Iterator;
import java.util.TreeSet;


public class MemberTreeSet {
	//TreeSet을 Member 타입으로 사용할 변수
	private TreeSet<Member> treeSet;
	
	//생성자 : treeSet 인스턴스를 생성
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	//treeSet에 데이터를 추가 : add({데이터})
	//매개 변수 : Member타입의 데이터
	public void addMember(Member m) {
		treeSet.add(m);
	}
	
	//treeSet에 데이터 제거.
	// Interator를 사용해서 데이터를 조회
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();
		
		//hasNext() : set구조에서 다음 아이템이 있는지 확인
		while(ir.hasNext()) {
			Member m = ir.next();
			if(m.getMemberId() == memberId) {
				treeSet.remove(m); //remove({데이터})
				return true;
			}
		}
		System.out.println(memberId + "값이 없습니다.");
		return false;
	}
	
	//모든 데이터 출력
	// (메소드) 배열에 저장된 데이터 모두 출력
	public void printAll() {
		//for-each문({배열내아이템데이터타입} {변수명} : {배열명})
		for(Member m : treeSet) {
			System.out.println(m);
		}
	}
	
	public static void main(String[] args) {
		MemberTreeSet mts = new MemberTreeSet();
		
		mts.addMember(new Member(1000, "민트"));
		mts.addMember(new Member(2000, "레드"));
		mts.addMember(new Member(3000, "그린"));
		
		mts.printAll();
		
		System.out.println("----------------");
		
		mts.addMember(new Member(2000, "레드2222")); //중복 안됨.
		mts.addMember(new Member(2010, "레드")); //중복됨. => 중복의 기준 = 회원번호 기준
		mts.printAll();
	}
}
