import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentListExample {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("ABC");
		student1.setCollegeName("XYZ");

		Student student2 = new Student(2, "GHJ", "yu");

		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(new Student(3, "GHJ", "yu"));

		System.out.println(list);

		for (Student st : list) {
			System.out.println(st);
		}

		List<Student> lists = Arrays.asList(new Student(1, "GHJ", "yu"), new Student(2, "GHJ", "yu"),
				new Student(3, "GHJ", "yu"));
		System.out.println(lists);
	}
}
