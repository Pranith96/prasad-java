
public class MainMethod {

	public static void main(String[] args) {

		Address address = new Address();
		address.setAddressId(1);
		address.setFlatNo("10");
		address.setStreetNo("20");
		address.setPincode("1234567");
		address.setCity("ABC");
		address.setState("XYZ");

		Student student = new Student();
		student.setId(1);
		student.setName("QWERTY");
		student.setMobileNumber("1234567890");
		student.setAddress(address);
		
		System.out.println(student);
		String studentCity  = student.getAddress().getCity();
		System.out.println(studentCity);
		
		Address addressTeacher = new Address();
		addressTeacher.setAddressId(2);
		addressTeacher.setFlatNo("20");
		addressTeacher.setStreetNo("30");
		addressTeacher.setPincode("12345678");
		addressTeacher.setCity("ABCD");
		addressTeacher.setState("XYZT");
		
		Teachers teacher = new Teachers();
		teacher.setId(1);
		teacher.setName("YUP");
		teacher.setAddress(addressTeacher);
		
		System.out.println(teacher);
	}
}
