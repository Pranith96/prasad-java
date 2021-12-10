
public class Calculator {

	/*
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(5, 5);
		calculator.sub(5, 2);
		calculator.mul(5, 6);
	}
	*/
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("addition: " + c);
	}

	public void sub(int a, int b) {
		int c = a - b;
		System.out.println("subtraction: " + c);
	}

	public void mul(int a, int b) {
		int c = a * b;
		System.out.println("multiplication " + c);
	}

}
