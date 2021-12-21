
public class Student {

	private int id;
	private String name;
	private String mobileNumber;
	private Address address;

	public Student(int id, String mobileNumber) {
		this.id = id;
		this.mobileNumber = mobileNumber;
	}
	
	public Student(int id, String name, String mobileNumber) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	
	public Student(int id, String name, String mobileNumber, Address address) {
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	public Student() {

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", address=" + address + "]";
	}

}
