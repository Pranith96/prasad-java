
public class MainMethod {

	public static void main(String[] args) {
		DaemonThread thread = new DaemonThread();
		thread.setDaemon(true);
		thread.start();
		DaemonThread thread1 = new DaemonThread();
		DaemonThread thread2 = new DaemonThread();
		thread1.start();
		thread2.start();

	}
}
