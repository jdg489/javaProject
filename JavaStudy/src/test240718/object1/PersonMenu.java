package test240718.object1;

import java.util.Scanner;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		int[] countArr = pc.personCount();
		
		while(true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("학생은 저장된 학생은" + countArr[0] + "명입니다.");
			System.out.println("사임은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은" + countArr[1] + "명입니다.\n");
			
			System.out.println("1.학생 메뉴");
			System.out.println("2.사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 :");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				this.studentMenu();
				break;
			case 2:
				this.employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
	}
	public void studentMenu() {
		System.out.println();
		System.out.println("1.학생 추가");
		System.out.println("2.학생 보기");
		System.out.println("9. 메인으로");
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			this.insertStudent();
			break;
		case 2:
			this.printStudent();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		
		System.out.println("studentMenu");
		
	}
	public void employeeMenu() {
	
	}
	public void insertStudent() {
	
	}
	public void printStudent() {
		
	}
	public void insertEmployee() {
	
	}	
	public void printEmployee() {
	
	}
}
