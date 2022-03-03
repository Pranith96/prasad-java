import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStudentExample {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("ABC");
		student1.setCollegeName("XYZ");

		Student student2 = new Student(2, "GHJ", "yu");

		Map<Integer, Student> map = new HashMap<>();
		map.put(1, student1);
		map.put(2, student2);
		System.out.println(map);

		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);

		Map<Integer, List<Student>> map1 = new HashMap<>();
		map1.put(1, list);

		System.out.println(map1);
	}
}
