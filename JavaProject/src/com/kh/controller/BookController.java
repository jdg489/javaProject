package com.kh.controller;

import com.kh.vo.Book;

public class BookController {
	
	private Book[] bookList = new Book[100];
	
	public BookController() {
		super();
		bookList[0] = new Book("아프니까 청춘이다.", "조동근", "인문", 15000);
		bookList[1] = new Book("아프니까 청춘이다.", "조동근", "기타", 25000);
		bookList[2] = new Book("아프니까 청춘이다.", "조동근", "학문", 35000);
		bookList[3] = new Book("아프니까 청춘이다.", "조동근", "체육", 45000);
		
	}
	
	public void inertBook(Book bk) {
		// bookList에 bk 저장
		// 가장 앞쪽에 비어있는 공간(null)을 찾아서 bk 저장
		
		for(int i = 0; i< bookList.length; i++) {
			if(bookList[i] == null) {
				bookList[i] = bk;
				break;
			}
		}
	}
	
	public Book[] getBookList() {
		return this.bookList;
	}
	
	// keyword 가 제목에 포함되어 있는 도서 목록 반환
	public Book[] searchBook(String keyword) {
		Book[] searchBook = new Book[this.bookList.length];
		int index = 0;
		
		for(int i = 0; i<this.bookList.length; i++) {
			if(bookList[i] == null) {
			}else if(bookList[i].getTitle().contains(keyword)) {
				searchBook[index] = bookList[i];
				index++;
				}
			}
		return searchBook;
		}
	
	public boolean isBook(int index) {
		
		
		if(index >= 0 && index < bookList.length && bookList[index] != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void updateBook(int index, Book b) {
		this.bookList[index] = b;
	}

}
