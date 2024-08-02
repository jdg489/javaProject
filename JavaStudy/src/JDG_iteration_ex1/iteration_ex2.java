package JDG_iteration_ex1;

import java.util.Scanner;

public class iteration_ex2 {
	/*
	 1이상의 숫자를 입력하세요 : 4     / 1이상의 숫자를 입력하세요 : 0
	 4 3 2 1					/ 1이상의 숫자를 입력해주세요.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 1. Scanner 객체 생성 (사용자 입력을 받기 위해)
		
		System.out.print("입력 :"); // 2. 사용자에게 숫자 입력 요청
		int num = sc.nextInt(); // 3. 입력받은 정수를 num 변수에 저장
			
			if(num < 1) { // 4. num이 1보다 작은지 확인
				System.out.println("1 이상의 숫자를 입력해주세요."); // 5. 조건이 참이면 경고 메시지 출력
			}else { // 6. num이 1 이상인 경우
				for(int i = num; i >= 1; i--) { // 7. num부터 1까지 역순으로 반복
					System.out.print(i + " "); // 8. 현재 i 값을 출력 (공백 추가)
				}
			}
	}
}
		/* 
			1.사용자 입력 요청:			
			System.out.print("입력 :");
			사용자에게 숫자를 입력하라는 메시지를 출력합니다.
			
			2.정수 입력 받기:			
			int num = sc.nextInt();
			사용자가 입력한 정수를 num 변수에 저장합니다.
			
			3.조건 검사:			
			if(num < 1)
			num이 1보다 작은지 확인합니다.
			
			4.경고 메시지 출력:			
			System.out.println("1 이상의 숫자를 입력해주세요.");
			num이 1보다 작으면 경고 메시지를 출력합니다.
			
			5.정수 범위 확인:			
			else
			num이 1 이상인 경우 아래의 코드가 실행됩니다.
			
			6.for 루프 시작:			
			for(int i = num; i >= 1; i--)
			i를 num으로 초기화하고, i가 1 이상인 동안 1씩 감소시키며 반복합니다. 이 루프는 입력받은 숫자부터 1까지 역순으로 실행됩니다.
			
			7.숫자 출력:			
			System.out.print(i + " ");
			현재의 i 값을 출력합니다. 각 숫자 사이에 공백이 추가되어 출력됩니다.
		 */