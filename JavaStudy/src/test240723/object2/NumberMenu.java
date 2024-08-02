package test240723.object2;

import java.util.Scanner;

public class NumberMenu {
	
	public void menu() throws NumRangeException {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("정수 :");
		int num1 = sc.nextInt();
		System.out.println("정수 :");
		int num2 = sc.nextInt();
		
		NumberController nc = new NumberController();
		boolean isDouble = nc.checkDouble(num1, num2);
		System.out.printf("%d는 %d의 배수인가 ? %b \n",num1,num2,isDouble);
	}
}
