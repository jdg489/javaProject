package test240711.object2_4;

import java.util.Scanner;

import test240711.object2_2.Book;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		Book[] bArr = new Book[3];
		int menu = 0;
		System.out.println(bArr);
		
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
			
			for(int i =0; i < bArr.length; i++) {
				if(bArr[i] == null) {
					bArr[i] =  new Book(title,genre,writer,number);
					System.out.println("책을 등록하였습니다.");
					System.out.println(bArr[i].toString());
					break;
				}else if(i == (bArr.length - 1)) { // 마지막 인덱스까지 전부 확인한 후
					System.out.println("이미 등록할 수 있는 책이 가득 찼습니다.");
				}
			}
			break;
		case 2:
			System.out.println("=====등록 도서목록=====");
			for(int i = 0; i<bArr.length; i++) {
				if(bArr[i] == null) {
					break;
				}
				System.out.println(bArr[i].toString());
			}
			break;
		case 3:
			// 제목: 아프니까 청춘이다. 장르 : 에세이 저자 : 조동근 책번호 : 150
			// 입력하신 제목의 책은 등록되어있지 않습니다.
			System.out.println("=====도서 검색=====");
			System.out.println("검색할 책 이름을 입력 :");
			String target = sc.nextLine();
			
			for(int i =0; i < bArr.length; i++) { 
				if(bArr[0] != null) {
					break;
				}else if (target.equals(bArr[i].getTitre())) {
					System.out.println(bArr[i].toString());
					break;
				}
			}
			break;
		case 4:
			// 배열에서 해당 책 삭제
			// 배열에서 Book 객체 찾기
			
			System.out.println("=====등록 도서목록=====");
			for(int i = 0; i<bArr.length; i++) {
				if(bArr[i] == null) {
					break;
				}
				System.out.println(bArr[i].toString());
			}
			System.out.println("삭제할 도서의 번호 입력 :");
			int num = sc.nextInt();
			
			for(int i = 0; i< bArr.length; i++) {
				if(bArr[i] == null) {
					System.out.println("삭제할 도서의 번호를 찾지 못하였습니다.");
					break;
				}else if(num == bArr[i].getNumber()) {
					System.out.println("삭제 데이터 :" + bArr[i].toString());
					// 삭제할 위치부터 마지막위치까지 모든 값을 한칸씩 앞으로 당김
					for(int j = i; j <= (bArr.length - 1); j++) {
						bArr[j] = bArr[j+1];
					}
					// 마지막 값에 null대입
					bArr[bArr.length - 1] = null;
					
					break;
				}
			}
			break;
		case 9:
			break;
		default:
				
			}
		}
	}
}
