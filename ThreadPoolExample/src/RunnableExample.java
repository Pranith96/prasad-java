import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExample {

	public static void main(String[] args) {

		Task task = new Task();
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			service.execute(task);
		}
	}

	public static class Task implements Runnable {

		@Override
		public void run() {
			System.out.println("Hello: " + Thread.currentThread().getName() + "::" + System.currentTimeMillis());
		}
	}
}
