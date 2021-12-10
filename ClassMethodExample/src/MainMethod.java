
public class MainMethod {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(5, 5);
		calculator.sub(5, 2);
		calculator.mul(5, 6);

		Calculator2 calculator2 = new Calculator2();
		calculator2.div(10, 2);
		calculator2.hello();
		calculator2.add(5, 5);
	}
}
