package q.thread1;

public class Task2 extends Thread{

	@Override
	public void run() {
		for(int i=1; i < 20; i++) {
			if(i % 2 == 1) {
				System.out.println(i + " ");
			}
		}
	}
}