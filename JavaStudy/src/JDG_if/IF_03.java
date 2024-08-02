package JDG_if;

import java.util.Scanner;

public class IF_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("입력 :");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Positive");
		}else if(num == 0) {
			System.out.println("Zero");
		}else {
			System.out.println("Negative");
		}
	}
}
