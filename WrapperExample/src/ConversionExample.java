
public class ConversionExample {

	public static void main(String[] args) {

		int i = 10;

		String s = String.valueOf(i);
		System.out.println(s + "abc");

		String s1 = "100";
		Integer j = Integer.parseInt(s1);
		System.out.println(j+100);
		System.out.println(s1+100);
		
		Long ll = Long.parseLong(s1);
		
	}

}
