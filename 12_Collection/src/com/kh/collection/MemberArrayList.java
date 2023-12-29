package com.kh.collection;

import java.util.ArrayList;

public class MemberArrayList{

	//ArrayList를 사용해서 Member타입의 배열 변수 선언
	private ArrayList<Member> memberList;
	
	//생성자, memberList 배열의 인스턴스 생성
	public MemberArrayList() {
		memberList = new ArrayList<Member>();
	}
	
	//(메소드)Member 객체를 매개변수로 받아서,
	//memberList 배열에 데이터를 추가(add())
	public void addMemberList(Member m) {//memberList의 add메소드 사용하여
		memberList.add(m);	//전달받은 m을 memberList에 추가
	}
	//(메소드) 회원 번호를 매개변수로 받아서,
	// memberList배열에 있는 데이터인 경우 해당 데이터 제거
	// 데이터를 제거한 경우 true 반환, 그렇지 않은 경우 false 반환
	// 제거된 항목이 없는 경우"{memberId}가 존재하지 않습니다." 출력
	//		*ArrayLsit 데이터 제거 : remove()
	//		*ArrayLsit 데이터 조회 : get()
	//		*ArrayLsit 데이터 길이 : size()
	public boolean removeMemberList(int memberId) {
		for(int i = 0;i<memberList.size(); i++) {
			Member m = memberList.get(i);
			if(m.getMemberId() == memberId) {
				memberList.remove(i);
				return true;
			}
		}
		//memberList안에서 값을 찾지 못한경우
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	// (메소드) 배열에 저장된 데이터 모두 출력
	public void printAll() {
		//for-each문({배열내아이템데이터타입} {변수명} : {배열명})
		for(Member m : memberList) {
			System.out.println(m);
		}
	}
	
	public static void main(String[] args) {
		MemberArrayList members = new MemberArrayList();
		//메소드의 매개변수가 클래스타입이면, 메소드를 호출할 때 인자 값으로 인스턴스를 전달
		members.addMemberList(new Member(10,"장나라"));
		members.addMemberList(new Member(20,"홍길동"));
		members.addMemberList(new Member(30,"임꺽정"));
		
		members.printAll(); //기존에는 객체의 주소값이 표시되었으나, Member 클래스에서 toString() 메소드를 오버라이딩하여 원하는 정보를 출력하도록 재정의.
		
		System.out.println(members.removeMemberList(0));
		System.out.println(members.removeMemberList(10));
		
		members.printAll();
	}
}
