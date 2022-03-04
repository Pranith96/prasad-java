import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ABC");
		list.add("PQR");
		list.add("qwer");
		list.add("fghjk");
		list.add("fghjk");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
		System.out.println();
	}
}
