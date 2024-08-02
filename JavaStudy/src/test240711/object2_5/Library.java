package test240711.object2_5;

import java.util.Scanner;

// 사용자와의 소통
// 입력을 받고 응답을 출력하는 것
public class Library {
	private Scanner sc = new Scanner(System.in);
	
	public void menu() {
		int menu = 0;
		while(menu != 9) {
			
			System.out.println("=====도서관 프로그램=====");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록 출력");
			System.out.println("3. 도서검색");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택 :");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
			System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}
