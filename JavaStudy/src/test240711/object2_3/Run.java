package test240711.object2_3;

import java.util.Scanner;

import test240711.object2_2.Book;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		Book b1=null , b2=null ,b3=null;
		int menu = 0;
		System.out.println(b1);
		
		while(menu != 9) { 
		System.out.println("=====도서관 프로그램=====");
		System.out.println("1. 도서등록");
		System.out.println("2. 도서목록 출력");
		System.out.println("3. 도서검색");
		System.out.println("9. 종료");
		System.out.println("메뉴 선택 :");
		menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1:
			String title, genre, writer;
			int number;
			
			System.out.print("도서 제목 :");
			title = sc.nextLine();
			
			System.out.println(" 장르 :");
			genre = sc.next();
			
			System.out.print(" 저자 :");
			writer = sc.next();
			
			System.out.print(" 책번호 :");
			number = sc.nextInt();
			
			Book tmpBook = new Book(title,genre,writer,number);
			
			if (b1 == null) {
				b1 = tmpBook;
			}else if(b2 == null) {
				b2 = tmpBook;
			}else if(b3 == null) {
				b3 = tmpBook;
			}else {
				System.out.println("이미 등록할 수 있는 책이 가득 찼습니다.");
				break;
			}
			
			System.out.println("책을 등록하였습니다.");
			System.out.println(b1.toString());
			break;
		case 2:
			System.out.println("=====등록 도서목록=====");
			if(b1 != null) {
				System.out.println(b1.toString());
			}
			if(b2 != null) {
				System.out.println(b2.toString());
			}
			if(b3 != null) {
				System.out.println(b3.toString());
			}
			break;
		case 3:
			// 제목: 아프니까 청춘이다. 장르 : 에세이 저자 : 조동근 책번호 : 150
			// 입력하신 제목의 책은 등록되어있지 않습니다.
			
			System.out.println("=====도서 검색=====");
			System.out.println("검색할 책 이름을 입력 :");
			String target = sc.nextLine();
			
			if(b1 != null && target.equals(b1.getTitre())) {
				System.out.println(b1.toString());
			}else if(b2 != null && target.equals(b2.getTitre())) {
				System.out.println(b2.toString());
			}else if(b3 != null && target.equals(b3.getTitre())) {
				System.out.println(b3.toString());
			}else {
				System.out.println("입력하신 제목의 책은 등록되어있지 않습니다.");
			}
			break;
		case 9:
			break;
		default:
				
			}
		}
	}
}
