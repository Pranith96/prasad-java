
public interface Addition {

	public void hello();

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	default void display(String message) {
		System.out.println(message);
	}
}
