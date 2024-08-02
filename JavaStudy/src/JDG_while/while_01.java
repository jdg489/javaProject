package JDG_while;

import java.util.Scanner;

public class while_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		while(true) {
			System.out.print("정수입력 :");
			int num = sc.nextInt();
			
			if(num >=1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
				}
			break;
			}else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		}
	}
}
