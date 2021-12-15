
public class MainMethod {

	public static void main(String[] args) {

		Addition addition = new Addition();
		int result = addition.add(5, 5);
		System.out.println(result);
		String response = addition.hello("Hello ");
		System.out.println(response);
	}
}
