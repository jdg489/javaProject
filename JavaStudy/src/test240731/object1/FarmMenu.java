package test240731.object1;

import java.util.Scanner;

public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();
	
	public void mainMenu() {
		System.out.println("====== KH 마트 ======");
		System.out.println("1. 직원 메뉴");
		System.out.println("2. 손님 메뉴");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호 선택 : ");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:
			adminMenu();
			break;
		case 2:
			customerMenu();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
	}
	
	public void adminMenu() {
		System.out.println("****** 직원 메뉴 ******");
		System.out.println("1. 새 농산물 추가 :");
		System.out.println("2. 종류 삭제 :");
		System.out.println("3. 수량 수정 :");
		System.out.println("4. 농산물 목록 :");
		System.out.println("9. 메인으로 돌아가기 :");
		
		
	}
	
	public void customerMenu() {
		
	}
	
	public void addNewKind() {
		
	}
	
	public void changeAmount() {
		
	}
	
	public void printFarm() {
		
	}
	
	public void buyFarm() {
		
	}
	
	public void removerFarm() {
			
	}
	
	public void printBuyFarm() {
		
	}
}
