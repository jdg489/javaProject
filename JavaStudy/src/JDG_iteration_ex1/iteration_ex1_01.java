package JDG_iteration_ex1;

import java.util.Scanner;

public class iteration_ex1_01 {
	
	/*
	 1이상의 숫자를 입력하세요 : 4  / 1이상의 숫자를 입력하세요 : 0
	 1234                     / 1 이상의 숫자를 입력해주세요.
	 						/1이상의 숫자를 입력하세요 : 8
	 						/ 1 2 3 4 5 6 7 8 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 1. 무한 루프 시작
			System.out.print("입력 :"); // 2. 사용자에게 숫자 입력 요청
			int num = sc.nextInt(); // 3. 입력받은 정수를 num에 저장
			
				if(num < 1) { // 4. num이 1보다 작은지 확인
					System.out.print("1 이상의 숫자를 입력해주세요."); // 5. 경고 메시지 출력
				}else { // 6. num이 1 이상인 경우
					for(int i = 1; i <=num; i++) { // 7. 1부터 num까지 반복
						System.out.print(i + " "); // 8. 현재 i 값을 출력 (공백 추가)
				}
				break; // 9. 루프 종료
			}
		}
	}
}
		/*
			1.무한 루프 시작:			
			while(true) {
			사용자로부터 입력을 계속 받기 위해 무한 루프를 시작합니다.
			
			2.사용자에게 숫자 입력 요청:
			System.out.print("입력 :");
			사용자에게 숫자를 입력하라는 메시지를 출력합니다.
			
			3.입력받은 정수를 num에 저장:
			int num = sc.nextInt();
			사용자가 입력한 숫자를 num 변수에 저장합니다.
			
			4.num이 1보다 작은지 확인:
			if(num < 1) {
			입력된 숫자가 1보다 작은지 검사합니다.
			
			5.경고 메시지 출력:
			System.out.print("1 이상의 숫자를 입력해주세요.");
			num이 1보다 작으면 사용자에게 경고 메시지를 출력합니다.
			
			6.num이 1 이상인 경우:
			else {
			num이 1 이상일 때 아래의 코드를 실행합니다.
			
			7.1부터 num까지 반복:
			for(int i = 1; i <= num; i++) {
			i를 1로 초기화하고, num까지 반복합니다.
			
			8.현재 i 값을 출력 (공백 추가):
			System.out.print(i + " ");
			각 반복에서 i 값을 출력하며, 숫자 사이에 공백을 추가합니다.
			
			9.루프 종료:
			break;
			숫자 출력이 완료되면 break 문을 사용하여 무한 루프를 종료합니다.
 		 */