import java.util.HashMap;
import java.util.Map;


public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "ABC");
		map.put(2, "XYZ");
		map.put(3, "PQR");
		map.put(3, "TYU");
		map.put(null, "rty");
		map.put(4, null);

		System.out.println(map);

		System.out.println(map.get(3));

		map.remove(3);
		System.out.println(map);

		System.out.println(map.keySet());

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}

	}
}
