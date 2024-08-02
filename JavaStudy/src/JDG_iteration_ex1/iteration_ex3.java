package JDG_iteration_ex1;

import java.util.Scanner;

public class iteration_ex3 {
	/*
	 정수를 하나 입력하세요 : 8
	 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 1. Scanner 객체 생성하여 사용자 입력을 받기 위해 준비
		
		System.out.print("정수 입력:"); // 2. 사용자에게 정수 입력을 요청
		int num = sc.nextInt(); // 3. 입력받은 정수를 num 변수에 저장
		int sum = 0; // 4. 합계를 저장할 sum 변수를 0으로 초기화
		
		for(int i = 1; i <=num; i++) { // 5. 1부터 num까지 반복하는 for 루프
			sum += i; // 6. 현재 i 값을 sum에 더함
			System.out.print(i); // 7. 현재 i 값을 출력
			if(num == i) { // 8. i가 num과 같으면
				System.out.print(" = "); // 9. 등호 출력
			}else { // 10. i가 num과 다르면
				System.out.print(" + "); // 11. 더하기 기호 출력
			}
		}
		System.out.println(sum); // 12. 최종 합계를 출력
	}
}
	/* 
		1.입력 준비: Scanner sc = new Scanner(System.in);		
			Scanner 객체를 생성하여 사용자로부터 입력을 받을 준비를 합니다.
			
		2.사용자 입력 요청: System.out.print("정수 입력:");		
			사용자에게 정수를 입력하라는 메시지를 출력합니다.
			
		3.정수 입력 받기: int num = sc.nextInt();		
			사용자가 입력한 정수를 num 변수에 저장합니다.
			
		4.합계 초기화: int sum = 0;		
			sum 변수를 0으로 초기화하여 나중에 합계를 저장할 준비를 합니다.
			
		5.for 루프: for(int i = 1; i <= num; i++)		
			1부터 num까지의 숫자를 반복합니다.
			
		6.합계 계산: sum += i;		
			현재의 i 값을 sum에 더하여 누적 합계를 계산합니다.
			
		7.숫자 출력: System.out.print(i);		
			현재의 i 값을 출력합니다.
			
		8.조건 검사: if(num == i)		
			i가 num과 같을 때의 조건을 검사합니다.
			
		9.등호 출력: System.out.print(" = ");		
			i가 num과 같을 경우 등호를 출력합니다.
			
		10.다른 경우: else		
			i가 num과 다를 경우 실행되는 코드입니다.
			
		11.더하기 기호 출력: System.out.print(" + ");		
			i가 num과 다르면 더하기 기호를 출력합니다.
			
		12.최종 합계 출력: System.out.println(sum);		
			반복이 끝난 후, 계산된 총 합계를 출력합니다.
    */