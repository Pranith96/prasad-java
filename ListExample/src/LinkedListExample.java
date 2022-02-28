import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("ABC");
		list.add("XYZ");
		list.add("PQr");
		list.add("FGH");
		list.add("dfgh");

		System.out.println(list);
		System.out.println("................");
		System.out.println(list.size());
		System.out.println("................");
		for (String i : list) {
			System.out.println(i);
		}
		System.out.println("................");
		list.remove(4);
		System.out.println(list);
		
		System.out.println(list.get(2));
		
	}

}
