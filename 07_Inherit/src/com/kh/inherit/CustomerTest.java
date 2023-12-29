package com.kh.inherit;

import java.util.ArrayList;


//ArrayList를 이용한 출력
public class CustomerTest {
	public static void main(String[] args) {
		//ArrayList : Customer 클래스 배열 생성
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		//클래스 생성
		//일반 고객(Customer) : 2명(ID,이름) : ("10010","이순신")
		//								  ("10020","신사임당")
		Customer c1 = new Customer("10010","이순신");
		Customer c2 = new Customer("10020","신사임당");
		
		//GOLD 고객(GoldCustomer) : 2명(ID,이름) : ("10030","홍길동")
		//								  	    ("10040","김유신")
		Customer c3 = new GoldCustomer("10030","홍길동");  //자식클래스와 부모클래스의 클래스간 형변환
		Customer c4 = new GoldCustomer("10040","김유신");
		
		//생성한 인스턴스를 Customer 클래스 배열에 추가
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		
		System.out.println("========== 고객 정보 출력 ===========");
		//showCustomerInfo()활용하여 출력
		for (Customer customer : customerList) { //foreach 전체 출력			  
		    System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("========== 할인율과 적립금 계산 ===========");
		int price = 10000;
		//할인율과 적립금 계산 후
		//"{고객이름} 님이 {price}을 지불했습니다." 출력
		//"{고객이름} 님의 현재 적립금은 {...}입니다."
		for (Customer customer : customerList) { //foreach 전체 출력			  
		    System.out.printf("%s 님이 %d원을 지불했습니다.\n%s 님의 현재 적립금은 %d 입니다.\n", customer.getName(), customer.calcPrice(price), customer.getName(), customer.point);
		}
	}
}
