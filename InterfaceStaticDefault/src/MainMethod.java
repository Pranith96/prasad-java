
public class MainMethod {

	public static void main(String[] args) {

		Addition ad = () -> {
			System.out.println("Hello welcome");
		};
		ad.hello();
		ad.display("Java");
		Addition.add(10, 10);
	}
}
