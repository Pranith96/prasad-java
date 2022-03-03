import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		// Hash set removes duplicates and print in random order
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(5);
		set.add(4);
		
		System.out.println(set);
		
		set.remove(0);
		System.out.println(set);

		// LinkedHash set removes duplicates and print in insertion order
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(5);
		set1.add(2);
		set1.add(9);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(5);
		set1.add(4);
		set1.add(1);
		
		System.out.println(set1);

		// Tree set removes duplicates and print in ascending order
		Set<Integer> set2 = new TreeSet<>();
		set2.add(5);
		set2.add(2);
		set2.add(9);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(5);
		set2.add(4);
		set2.add(1);
		
		System.out.println(set2);
		
		
		validate(set2);
	}

	private static void validate(Set<Integer> set2) {
		for(Integer i : set2) {
			System.out.println(i);
		}
	}

}
