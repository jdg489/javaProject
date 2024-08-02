package test240723.object1;

import java.util.Scanner;

public class CharacterMenu {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		
		CharacterController cc = new CharacterController();
		
		try {
			System.out.println("문자열 :");
			String str = sc.nextLine();
			int length = cc.countAlpha(str);
			System.out.println(str + "에 포함된 영문자 갯수 :" + length);
		}catch(CharCheckException e) {
			System.out.println("문자열에 공백이 포함되어있습니다.");
			e.printStackTrace();
			} finally {
				sc.close();
				System.out.println("잘 종료되었습니다.");
			}
	}
}
