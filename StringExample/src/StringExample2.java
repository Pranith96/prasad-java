
public class StringExample2 {

	public static void main(String[] args) {

		int i = 10;
		String s = "hEllo woRlD";
		String s1 = new String("hEllo weRlD");
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf("o"));
		System.out.println(s.isEmpty());
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.contains("hE"));
		System.out.println(s.substring(1));
		System.out.println(s.substring(s.length() - 5, s.length() - 2));
		System.out.println(s.replace("o", "z"));
		System.out.println(String.valueOf(i));
	}
}