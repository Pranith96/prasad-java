
public class MainMethod {

	public static void main(String[] args) {
		Example1 ex = new Example1();
		Thread thread = new Thread(ex);
		thread.start();
	}
}