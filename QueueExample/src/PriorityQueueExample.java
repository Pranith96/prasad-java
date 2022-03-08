import java.util.PriorityQueue;
import java.util.Stack;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(6);
		queue.add(2);
		queue.add(3);
		queue.add(5);
		queue.add(1);
		queue.add(4);
		
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue.peek());

		queue.remove();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);

		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(1);
		stack.add(9);
		stack.pop();
		stack.pop();

		System.out.println(stack);
	}
}
