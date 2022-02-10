
public class Example2 {

	public static void main(String[] args) throws ComipleTimeCustomException {

		String s = "hello";

		if (s.length() > 5) {
			throw new ComipleTimeCustomException("Length is greater than 5");
		}
	}
}
