
public class MainMethodExample {

	public static void main(String[] args) {

		int i = 30;
		int num = 20;

		try {
			validate(i);
		} catch (CustomRunTimeException ex) {
			ex.printStackTrace();
		}

		try {
			validateNum(num);
		} catch (CustomCompileTimeException e) {
			e.printStackTrace();
		}

		System.out.println("Hii");
		System.out.println("Hello");
	}

	private static void validate(int i) {
		if (i < 25) {
			throw new CustomRunTimeException("Entered number is less than 25");
		}
	}

	private static void validateNum(int num) throws CustomCompileTimeException  {
		if (num < 25) {
			throw new CustomCompileTimeException("Entered number is less than 25");
		}
	}
}