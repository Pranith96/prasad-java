
public class StringExample1 {

	public static void main(String[] args) {
		String s = "Hello";
		String s4 = s.concat("Welcome").concat("to").concat("Java");
		System.out.println(s4);
		System.out.println(s);
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = new String("Hello");

		if(s == s1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		if(s==s2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		if(s3==s2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		if(s.equals(s1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		if(s1.equals(s3)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
