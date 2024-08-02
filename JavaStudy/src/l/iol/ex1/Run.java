package l.iol.ex1;

import java.io.File;
import java.io.IOException;

public class Run {
	
	public static void main(String[] args) {
		/*
		 * 간단하게 파일을 만들어보자
		 * java.io.File클래스를 가지고
		 */
		
		// 1. 경로지정을 딱히 하지않고 파일 생성하기
		
		try {
			
			File f1 = new File("test.txt");  // 파일객체를 하나 만든상태(실제파일x)
			File f2 = new File("D:\\test2.txt");
//			File f3 = new File("D:\\tmp\\test.txt");
			
			
			f1.createNewFile(); // creagteNewFile 메소드가 실행할 때 실제 파일이 만들어짐
			
			f2.createNewFile();
			
			File tmpFolder = new File("D:\\tmp");
			tmpFolder.mkdir();
			
			// 폴더 먼저 만들고 파일만 만들어지게 하는 방법
			File f3 = new File("D:\\tmp\\test.txt");
			f3.createNewFile();
			
			File f4 = new File("ttt.txt");
			// 파일의 존재유무를 코드로 확인할 수 있다.
			System.out.println(f4.exists());
			System.out.println(f1.exists());
			
			// 파일인지 확인하는 메소드
			System.out.println(f1.isFile());
			System.out.println(tmpFolder.isFile());
			
			// 
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			
			System.out.println("파일명 :" + file.getName());
			System.out.println("파일경로 :" + file.getAbsolutePath());
			System.out.println("파일용량 :" + file.length());
			System.out.println("파일상위폴더 :" + file.getParent());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
