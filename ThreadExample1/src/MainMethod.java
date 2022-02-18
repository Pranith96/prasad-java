
public class MainMethod {

	public static void main(String[] args) throws InterruptedException {
		ThreadExample ex = new ThreadExample();
		ThreadExample ex1 = new ThreadExample();
		ThreadExample ex2 = new ThreadExample();
		ex.start();
		ex.join();
		ex1.start();
		ex1.join();
		ex2.start();
	}
}
