package JDG_if;

import java.util.Scanner;

public class IF_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 , num2;
		int sum;
		
		System.out.print("정수입력1 :");
		num1 = sc.nextInt();
		System.out.print("정수입력2 :");
		num2 = sc.nextInt();
		
		if(num1 + num2 >= 80) {
			System.out.println("A입니다.");
		}else if(num1 +num2 >= 60) {
			System.out.println("B입니다.");
		}else {
			System.out.println("C입니다.");
		}
	}
}
