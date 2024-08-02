package JDG_switch;

import java.util.Scanner;

public class Switch_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		System.out.println("입력 :");
		score = sc.nextInt();
		if(0<=score && score<=100) {
		switch(score/10) {
		case 9:
			System.out.println("우수");
			break;
		case 8: 
			System.out.println("좋음");
			break;
		case 7:
			System.out.println("보통");
			break;
		case 6: 
			System.out.println("미흡");
			break;
		default:
			System.out.println("낙제");
			}
		}else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
