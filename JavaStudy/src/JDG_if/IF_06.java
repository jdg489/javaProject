package JDG_if;

import java.util.Scanner;

public class IF_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 주민번호를 입력하세요 :");
		String str = sc.nextLine();
		
		char gender = str.charAt(7);
		
		String gender1;
		char year = str.charAt(0);
		String year1;
		
		if(gender == '1') {
			gender1 = "유효한 주민등록번호입니다.";
		}else if(gender == '2') {
			gender1 = "유효한 주민등록번호입니다.";
		}else {
			gender1 = "유효하지 않은 주민등록번호입니다.";
		}
		
		if(year >= '3') {
			year1 = "2000년 이전";
		}else {
			year1 = "2000년 이후";
		}
		System.out.println("당신은" + year1 + "에 출생한 " + gender1);
				
	}
}
