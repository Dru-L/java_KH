package com.kh.collection;

// * Set에서 사용하려면 Comparable(인터페이스)를 구현해야함
public class Member implements Comparable<Member>{
	private int memberId;	//회원 고유번호
	private String memberName;	//회원 이름
	
	//생성자, 회원 번호와 이름을 전달받아 저장
	public Member(int memberId, String memberName) {
		this.setMemberId(memberId);
		this.setMemberName(memberName);
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	//Object 클래스 내 toString()메소드를 오버라이딩
	@Override
	public String toString() {
		//부모 클래스(Object)의 toString() 메소드를 호출
//		return super.toString();
		
		// "[{회원번호}]{회원이름}"
		return "["+ memberId +"]" + memberName;
	}
	
	
	//정렬 관련 메소드 : compareTo
	@Override
	public int compareTo(Member o) {
		// 회원번호 기준으로 정렬(오름차순)
//		return this.memberId - o.memberId;
		// 회원번호 기준으로 정렬(내림차순)
		return (this.memberId - o.memberId) * (-1);
	}

	//Set 구조에서 중복 데이터 추가를 제어하는 부분
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// 클래스 인스턴스 타입 체크 : instanceof
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) { //기준을 정하고싶을때 =>중복 데이터로 판단하겠다.
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	
}
