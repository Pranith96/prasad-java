import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainMethod {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable r = new WorkThread(" " + i);
			executor.execute(r);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		System.out.println("Completed all the tasks");
	}

}
