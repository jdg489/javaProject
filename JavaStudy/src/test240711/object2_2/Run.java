package test240711.object2_2;

import java.util.Scanner;

public class Run {
	/*
	 	우리는 도서관에서 책을 관리하는 프로그램을 만들려고한다.
	 	해당 클래스는 도서관에 책을 등록할 때 사용하는 book 객체를 생성 할 Book 클래스이다.
	 	필요하다고 생각하는 데이터와 기능을 구현해보자
	 */
	
	// 사용자로부터 제목, 장르, 저자, 책번호를 입력받아
	// b1이라는 객체를 생성하고 생성된 객체의 toString 메소드를 호출하여 모든 정보를 리턴받아 확인
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String title, genre, writer;
		int number;
		
		System.out.print("도서 제목 :");
		title = sc.next();
		
		System.out.println("장르 :");
		genre = sc.next();
		
		System.out.print("저자 :");
		writer = sc.next();
		
		System.out.print("책번호 :");
		number = sc.nextInt();
		
		Book b1 = new Book(title,genre,writer,number);
		System.out.println("책을 등록하였습니다.");
		System.out.println(b1.toString());
	}
}
