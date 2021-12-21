
public class Address {

	private int addressId;
	private String flatNo;
	private String streetNo;
	private String city;
	private String state;
	private String pincode;
	
	public Address(int addressId, String flatNo, String streetNo, String city, String state, String pincode) {
		this.addressId = addressId;
		this.flatNo = flatNo;
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public Address() {
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", flatNo=" + flatNo + ", streetNo=" + streetNo + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}

}
