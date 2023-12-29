package com.kh.inherit;

public class Run {
	public static void main(String[] args) {
		System.out.println("--------------------");
		
		Customer c2 = new Customer("ID1", "아무개");
		System.out.println(c2.showCustomerInfo());
		
		System.out.println("--------------------");
		GoldCustomer gc = new GoldCustomer("Go1", "골드인");
		System.out.println(gc.showCustomerInfo());
	}
}
