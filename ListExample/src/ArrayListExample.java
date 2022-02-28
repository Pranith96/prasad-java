import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);
		System.out.println("................");
		System.out.println(list.size());
		System.out.println("................");
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("................");
		list.remove(4);
		System.out.println(list);
		
		System.out.println(list.get(2));
		
	}

}
