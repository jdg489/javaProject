package q.thread.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	public static void main(String[] args) {
		int port  = 3000;
		
		try {
		ServerSocket soc = new ServerSocket(port);
		System.out.println("서버 연결준비 완료....");
		
		Socket socket = soc.accept();
		System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결함...");
		
		ServerReveive receive = new ServerReveive(socket);
		 
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
