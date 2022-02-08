
public class MainMethod {

	public static void main(String[] args) {

		AxisBank bank = new AxisBank();
		int result = bank.getInterestRate();
		System.out.println(result);

		ICICIBank iciciBank = new ICICIBank();
		System.out.println(iciciBank.getInterestRate());

		HDFCBank bank1 = new HDFCBank();
		System.out.println(bank1.getInterestRate());

		Bank b = new ICICIBank(); // runtime polymorphism
		Bank b1 = new HDFCBank();
		Bank b2 = new AxisBank();

		System.out.println(b.getInterestRate());
		System.out.println(b1.getInterestRate());
		System.out.println(b2.getInterestRate());

	}

}
