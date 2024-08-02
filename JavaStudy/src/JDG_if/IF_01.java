package JDG_if;

import java.util.Scanner;

public class IF_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("입력 :");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("0보다 큽니다");
		}else if(num == 0) {
			System.out.println("0이랑 같습니다.");			
		}else {
			System.out.println("0보다 작습니다.");
		}
	}
}
