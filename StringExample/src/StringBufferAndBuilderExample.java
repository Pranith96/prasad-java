
public class StringBufferAndBuilderExample {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Hello"); // Asynchronous 
		StringBuffer s1 = new StringBuffer("Hello"); // synchronous // less performance
		s.append("Wolrd").append("java").append("Hi");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}
}
