
public class ExceptionsExample1 {

	public static void main(String[] args) {

		int i = 10;
		int j = 2;
		try {
			int k = i / j;
			System.out.println(k);
			try {
				String s = "hello";
				System.out.println(s.toLowerCase());
			} catch (NullPointerException ex) {
				ex.printStackTrace();
			}
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Welcome");
		}
		System.out.println("Hello");
		System.out.println("world");
	}
}
