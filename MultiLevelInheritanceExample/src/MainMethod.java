
public class MainMethod {

	public static void main(String[] args) {

		Summation summation = new Summation();
		int result = summation.add(5, 5);
		System.out.println(result);
		summation.display();
		String result1 = summation.message("ABC");
		System.out.println(result1);
		summation.print();
		summation.sum(10, 5);
	}

}
