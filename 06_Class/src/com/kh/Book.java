package com.kh;

public class Book {
	/*
	 * 추상황
	 * [1] 제목, 지은지(저자),번호, 가격, 표지색상, 대출여부, 카테고리
	 * 페이지 수 알려주기, 대출여부 조회, 책 정보 조회...
	 * [2] (x) => 표지 색상
	 * [3]
	 * // 변수정의
	 * String title;
	 * String author;
	 * int number;
	 * int price;
	 * String borrow;
	 * String category;
	 * //메소드 정의
	 * public int getPageNumber() {};
	 * public String getBorrow() {};
	 * public void getBookInfo() {};
	 */
	
	//멤버 변수(데이터)
	private String title;	//책 제목
	private String author;	// 저자명
	private static int number = 1;		// 고유 번호(static으로 데이터 공유 중)
	private int price;		// 책 가격
	String borrow;	 		// 대출 여부 : 대출중, 보관중
	String category;		// 카테고리
	int pageNumber;			// 페이지 수
	int currNumber;			//고유 번호
	
	//메소드(기능)
	//title getter
	//제공 기능 : title변수가 저장한 값을 결과로 전달
	public String getTitle() { //반환할 변수와 동일한 자료형
		return title;
	}
	//title setter
	// 제공기능 : 전달받은 값을 title 변수에 대입
	public void setTitle(String title) {
		this.title = title; //매개변수와 인스턴스변수를 구분해주기 위해 this를 씀
	}
	//author getter
	public String getAuthor() {
		return author;
	}
	//author setter
	public void setAuthor(String author) {
		this.author = author;
	}

	//number getter
	public int getCurrNumber() {
		return currNumber;
	}
	/*
	//number setter
	public void setNumber(int number) {
		this.number = number;
	}
	*/

	//price getter
	public int getPrice() {
		return price;
	}
	//price setter
	public void setPrice(int price) {
		this.price = price;
	}
		
	//페이지 수 알려주는 메소드
	public int getPageNumber() {
		System.out.println("페이지 수 : " + pageNumber);
		return pageNumber;
	}
	
	//대출 여부를 알려주는 메소드
	public String getBorrow() {
		return borrow; //void 가 아닌 다른 자료형을 쓸 경우 무조건 return
	}
	
	//책 정보를 출력해주는 메소드
	public void getBookInfo() {
		println("============");
		println("책 제목 :" + title );
		println("저자 :" + author );
		println("고유번호 :" + number );
		println("책 가격 :" + price );
		println("페이지 수 :" + pageNumber);
		println("카테고리 :" + category);
		println("대출 여부 :" + borrow);
		println("============");
	}
	
	//클래스 내부에서 출력함수 사용
	//System.out.println을 대신할 함수 입력
	private void println(String msg) {
		System.out.println(msg);
	}
	
}
