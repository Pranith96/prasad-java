
public class DaemonThread extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		} else {
			System.out.println("User Thread");
		}
		System.out.println(Thread.currentThread().getName());
	}
}
