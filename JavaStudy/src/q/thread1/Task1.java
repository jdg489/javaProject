package q.thread1;

public class Task1 extends Thread {
	// 20 미만 짝수

	@Override
	public void run() {
		try {
			for (int i = 1; i < 20; i++) {
				if (i % 2 == 0) {
					System.out.println(i + " ");
					Thread.sleep(100); // 0.1초동안 지금 쓰레드를 멈춘다.
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
