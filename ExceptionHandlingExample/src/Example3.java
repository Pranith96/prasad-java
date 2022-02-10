
public class Example3 {
	public static void main(String[] args) {

		String s = "Hello";

		if (s.length() > 5) {
			throw new CustomRunTimeException("length is greater than 5");
		}
	}

}
