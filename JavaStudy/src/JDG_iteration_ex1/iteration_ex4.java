package JDG_iteration_ex1;

public class iteration_ex4 {
	public static void main(String[] args) throws InterruptedException {
		
		int num = 0; // 1. num 변수를 0으로 초기화
		boolean run = true; // 2. run 변수를 true로 설정 (루프의 실행 여부 결정)
		
		while(run) { // 3. run이 true인 동안 반복
			System.out.println(num); // 4. 현재 num 값을 출력
			num += 1; // 5. num을 1 증가
		
			if(num == 101) { // 6. num이 101인지 검사
				run = false; // 7. 101이면 run을 false로 설정하여 루프 종료
			}
		}
	}
}

		/* 
		  1. 변수 초기화 :
		  int num = 0;: num 변수를 0으로 초기화합니다. 이 변수는 반복할 때마다 출력되는 숫자를 나타냅니다.
		  boolean run = true;: run 변수를 true로 설정합니다. 이는 while 루프가 계속 실행될지를 결정하는 플래그 역할을 합니다.
		  
		  2.while 루프 :
		  while(run): run이 true인 동안 루프를 계속 실행합니다. 루프가 시작되면 run은 계속 true 상태이므로 반복이 시작됩니다.
		  
		  3.출력 :
		  System.out.println(num);: 현재 num의 값을 콘솔에 출력합니다. 처음에는 0이 출력됩니다.
		  
		  4.증가 :
		  num += 1;: num에 1을 더하여 값을 증가시킵니다. 이 과정으로 num의 값이 매 반복마다 1씩 증가합니다.
		  
		  5.조건 검사 :
		  if(num == 101): num이 101인지 확인합니다.이 조건이 참일 경우, run을 false로 설정하여 루프를 종료합니다.
		  
		  6.루프 종료 :
		  while 조건이 false가 되면 루프가 종료되고, 프로그램은 main 메서드를 마칩니다.
		 */