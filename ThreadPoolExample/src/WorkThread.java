
public class WorkThread implements Runnable {

	private String message;

	public WorkThread(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " End");
	}

}
