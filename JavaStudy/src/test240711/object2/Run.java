package test240711.object2;

public class Run {
	
	public static void main(String[] args) {
		// 다음과 같은 코드를 실행했을 때 예시와 같은 결과가 출력되도록 TV클래스를 작성하세요.
		/*
		  TV myTV = new TV("삼성" , 2020, 65, 100000);
		  myTV.show();
		  TV myTV = new TV("LG" , 2024, 85, 100000);
		  myTV2.show(); 
		  
		  삼성에서 만든 2020년형 65인치 TV 가격 : 100000
		  LG에서 만든 2024년형 85인치 TV 가격 : 500000
		 */
		
		TV myTV  = new TV("삼성" , 2020 , 65 , 100000);
		myTV.show();
		TV myTV2 = new TV("LG" , 2024 , 85 , 500000);
		myTV2.show();
		
				
		
	}
}
