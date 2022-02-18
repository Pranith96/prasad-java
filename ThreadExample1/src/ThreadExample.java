
public class ThreadExample extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
