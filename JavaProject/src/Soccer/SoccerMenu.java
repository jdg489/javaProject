package Soccer;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class SoccerMenu {
	Scanner sc = new Scanner(System.in);
	SoccerController cc = new SoccerController();
	
	public void mainMenu() {
		System.out.println("사커게임에 오신걸 환영합니다.");
		
		while(true) {
			System.out.println("메인메뉴");
			System.out.println("1. 회원가입 ");
			System.out.println("2. 계정생성");
			System.out.println("3. 계정삭제");
			System.out.println("9. 종료");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
				switch(choice) {
				case 1:
					Membership();
					break;
				case 2:
					break;
				case 3:
					break;
				case 9:
					return;
				default:
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				}
		}
	}

	private void Membership() {
		System.out.println("아이디 :");
		String id = sc.nextLine();
		System.out.println("비밀번호 :");
		String pw = sc.nextLine();
		System.out.println("이메일 :");
		String em = sc.nextLine();
		System.out.println("이름 :");
		String name = sc.nextLine();
		
		Member m = new Member(name, pw, em);
		if(cc.Membership(id, m)) {
			System.out.println("성공적으로 회원가입을 완료하였습니다.");
		}else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		
	}
}
