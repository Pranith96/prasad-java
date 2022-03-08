import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.add("ABC");
		deque.add("XYZ");
		deque.add("PQR");
		deque.add("ABC");
		for(String str : deque) {
			System.out.println(str);
		}
		
		deque.poll();
		deque.pollLast();
		System.out.println(deque);
	}
}
