package l.iol.ex3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileChar {
	
	/*
	 * "문자기반 스트림"을 활용하여 입출력
	 * 
	 * - 문자기반스트림: 데이터를 2바이트 단위로 전송하는 통로
	 * 
	 * xxxReader : 입력용 스트림
	 * xxxWriter : 출력용 스트림
	 * 
	 */
	
	public void fileSave() {
		try (FileWriter fw = new FileWriter("char_test.txt");){
			// 2.Writer 메소드를 활용하여 데이터 출력
			fw.write("IO가 재밌다.");
			fw.write(" ");
			
			char[] arr = {'저', '는',' '};
			fw.write(arr);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		
		try (FileReader fr = new FileReader("char_test.txt");) {
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
