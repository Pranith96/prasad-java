import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(10);

//		Future<Integer> future = service.submit(new Task());
//		Integer i = future.get();
//		System.out.println(i);
		Future<Integer> future = null;
		Integer j = null;
		for (int i = 0; i < 5; i++) {
			future = service.submit(new Task());
			j = future.get();
			System.out.println(j);
		}
	}

	public static class Task implements Callable<Integer> {

		@Override
		public Integer call() {
			System.out.println("Hello::" +System.currentTimeMillis());
			return new Random().nextInt();
		}
	}
}
