package JDG_switch;

import java.util.Scanner;

public class Switch_02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		String operator;
		int num1 , num2;
		
		System.out.println("연산자(+ , - , * , / , %) : ");
		operator = sc.next();
		System.out.println("정수1 입력 :");
		num1 = sc.nextInt();
		System.out.println("정수2 입력 :");
		num2 = sc.nextInt();
		
		switch(operator.charAt(0)) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " +(num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " +(num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " +(num1 * num2));
			break;
		case '/':
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
				break;
			}
			System.out.println(num1 + " / " + num2 + " = " +(num1 / num2));
			break;
		case '%':
			System.out.println(num1 + " % " + num2 + " = " +(num1  % num2));
			break;
		default:
			System.out.println("없는 연산자입니다. 다시 입력해주세요.");
		}
	}
}
