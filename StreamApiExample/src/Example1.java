import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 11, 21, 18, 2, 3, 4, 13, 5, 12, 15, 17, 6, 7, 8, 19, 9, 10);
		List<Integer> result = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(result);

		List<Integer> result1 = list.stream().map(x -> x * 5).collect(Collectors.toList());
		System.out.println(result1);

		List<Integer> result2 = list.stream().filter(x -> x % 2 == 0).map(x -> x * 5).collect(Collectors.toList());
		System.out.println(result2);

		List<Integer> result3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(result3);

		List<Integer> result4 = list.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
		System.out.println(result4);

		list.stream().map(x -> x * 5).forEach(x -> System.out.println(x));
		System.out.println(".....................................");

		Integer value = list.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println(value);
		
		Integer value1 = list.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println(value1);
		
		long value2 = list.stream().count();
		System.out.println(value2);
	}
}
