import java.util.Optional;

public class Example {

	public static void main(String[] args) {
		String[] s = new String[5];
		// String str = s[3].toUpperCase();
		// System.out.println(str);

		s[3] = "Hello Hi";
		Optional<String> checkNull = Optional.ofNullable(s[3]);
		System.out.println(checkNull);
		System.out.println(checkNull.get());
		if (checkNull.isPresent()) {
			String str = s[3].toUpperCase();
			System.out.println(str);
		} else {
			System.out.println("Data is empty");
		}

		checkNull.ifPresent(x -> System.out.println(x));
		//checkNull.filter(null);
	}
}
