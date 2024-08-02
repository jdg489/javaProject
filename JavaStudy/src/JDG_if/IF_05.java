package JDG_if;

import java.util.Scanner;

public class IF_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age , income;
		
		System.out.print("입력 :");
		age = sc.nextInt();
		System.out.print("입력 :");
		income = sc.nextInt();
		
		if(age >= 18 && income >=50000) {
			System.out.print("Adult wiht high income");
		}else if(age >=18 && income < 50000) {
			System.out.print("Adultr with low income");			
		}else if(age <=17 && income >=30000) {
			System.out.print("Minor with high income");
		}else {
			System.out.print("Minor with low income");
		}
	}
}
