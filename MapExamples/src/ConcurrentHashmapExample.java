import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "ABC");
		map.put(2, "XYZ");
		map.put(3, "PQR");
		map.put(4, "TYU");
		
		for(Entry<Integer, String> ss : map.entrySet()) {
			System.out.println(ss.getKey());
			map.remove(3);
		}
		
		System.out.println(map);
	}
}
