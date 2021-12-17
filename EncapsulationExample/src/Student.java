
public class Student {

	private int id;
	private String name;
	private String mobileNumber;
	
	public Student(int id, String name, String mobileNumber) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}

	public Student() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + "]";
//	}

}
