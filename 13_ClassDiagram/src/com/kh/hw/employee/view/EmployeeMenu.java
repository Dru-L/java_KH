package com.kh.hw.employee.view;

import java.util.Scanner;
import com.kh.hw.employee.controller.EmployeeController;

public class EmployeeMenu {
	// 멤버 필드
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
	// 메뉴 안내가 되고 메뉴 번호에 따라 같은 클래스에 있는 메소드 실행
	// 번호를 잘못 입력했으면 잘못 입력했다는 안내가 뜸
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				switch(num) {
				case 1:
					insertEmp();
					break;
				case 2:
					updateEmp();
					break;
				case 3:
					deleteEmp();
					break;
				case 4:
					printEmp();
					break;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
		}
	}
	
	public void insertEmp(){
	// 사원 번호, 사원 이름, 사원 성별, 전화 번호는 기본적으로 받고
	// 추가적인 정보를 더 입력할 것인지 물어본 후
	// 입력하겠다고 하면 사원부서, 사원 연봉, 보너스 율을 추가로 더 받고
	// 모든 데이터를 EmployeeController의 add메소드 인자로 보냄
	// 추가정보를 입력하지 않겠다고 하면 기본정보만 add메소드 인자로 보냄
		System.out.print("사원 번호 : ");
		int empNo = sc.nextInt();
		sc.nextLine();
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 성별 : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("전화 번호 : ");
		String phone = sc.nextLine();
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
		char answer = sc.next().charAt(0);
		sc.nextLine();
		if(answer == 'n') {
			ec.add(empNo, name, gender, phone);
		}else if(answer == 'y') {
			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			System.out.print("사원 연봉 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();
			sc.nextLine();
			ec.add(empNo, name, gender, phone, dept, salary, bonus);
		}else {
			System.out.println("잘못 입력하셨습니다. 기본 정보만 저장합니다.");
			ec.add(empNo, name, gender, phone);
		}
	}
	
	public void updateEmp(){
	// 사원 정보 수정에 대한 메뉴 안내가 출력되고
	// 사용자가 수정하고 싶은 내용에 대한 번호를 입력
	// 입력한 메뉴에 맞는 해당 데이터를 EmployeeController에서 수정
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		if (ec.inform() == null) {
			System.out.println("사원 데이터가 없습니다.");
		}else {
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:
			System.out.print("수정할 전화 번호 : ");
			String phone = sc.nextLine();
			ec.modify(phone);
			break;
		case 2:
			System.out.print("수정할 사원 연봉 : ");
			int salary = sc.nextInt();
			ec.modify(salary);
			sc.nextLine();
			break;
		case 3:
			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();
			ec.modify(bonus);
			sc.nextLine();
			break;
		case 9:
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
			break;
			}
		}
	}
	
	public void deleteEmp(){
	// 정말 삭제할 것인지 물어본 후 삭제하겠다고 하면
	// EmployeeController의 remove()메소드를 호출하여 반환 값에 따라
	// 데이터 삭제에 실패하였는지 성공하였는지 출력
		ec.remove();
		if (ec.inform() == null) {
			System.out.println("성공적으로 데이터가 삭제되었습니다.");
		}else {
			System.out.println("데이터가 삭제되지 않았습니다.");
		}
	}
	
	public void printEmp(){
	// 사원정보가 있다면 사원정보 출력, 없다면 “사원 데이터가 없습니다”출력
		if (ec.inform() == null) {
			System.out.println("사원 데이터가 없습니다.");
		}else {
			System.out.println(ec.inform());
		}
	}
}
