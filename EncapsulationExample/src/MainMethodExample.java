
public class MainMethodExample {

	public static void main(String[] args) {

		Student student = new Student();

		student.setId(1);
		student.setMobileNumber("12345678900");
		student.setName("ABCD");

		System.out.println(student);
		
		String name  = student.getName();
		System.out.println(name);
	}
}
