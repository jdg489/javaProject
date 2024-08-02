package JDG_while;

import java.util.Scanner;

	// 사용자로부터 두 개의 숫자와 연산자 (+, -, *, /)를 입력받아 계산 결과를 출력하는 프로그램을 작성하세요. 
	// 사용자가 "exit"를 입력하면 프로그램이 종료됩니다.

	/*
	 사용자로부터 두 개의 숫자를 입력받습니다.
	연산자를 입력받습니다.
	결과를 계산하여 출력합니다.
	사용자가 "exit"를 입력하면 프로그램이 종료됩니다.
	잘못된 연산자 입력 시 "잘못된 연산자입니다."라는 메시지를 출력하세요.
	  
	 */
	
public class while_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String op;
		int num1, num2;
		
		while(true) {
			System.out.println("연산자(+, -, *, /, %");
			op = sc.next();
			
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("정수1 :");
			num1 = sc.nextInt();
			System.out.println("정수2 :");
			num2 = sc.nextInt();
			
			switch(op.charAt(0)) {
			case'+':
				
			}
		}
	}
}
