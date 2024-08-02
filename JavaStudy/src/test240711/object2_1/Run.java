package test240711.object2_1;

public class Run {
	public static void main(String[] args) {
		/*
		 one이라는 Human객체를 생성하고 해당 객체를 이용해서 myTV와 myTV2를 구매 가능한지 확인하는
		 코드를 작성하고자 한다.
		 
		 Human one = new Human("조동근" , 10000000);
		 one.buy(myTV);
		 
		 "조동근님 구매내역"
		 "삼성에서 만든 2020년형 65인치 TV가격 : 10000000" -> (돈 차감)
		 남은 잔액 : xxx
		 or
		 "조동근님 잔액이 부족하여 구매하실 수 없습니다."
		 */
		TV myTV = new TV("삼성" , 2020 , 65 , 100000);
		myTV.show();
		TV myTV2 = new TV("LG" , 2024 , 85 , 500000);
		myTV2.show();
		
		Human one = new Human("조동근" , 10000000);
		one.buy(myTV);
		
	}
	
}
