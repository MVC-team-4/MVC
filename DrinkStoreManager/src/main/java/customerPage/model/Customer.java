package customerPage.model;

public class Customer {

	private String id;
	private String name;
	private String address;
	private String phone_num;
	
	public Customer() {}
	
	public Customer(String id, String name, String address, String phone_num) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone_num = phone_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	
	@Override
	public String toString() {
		return " 고객정보 [id : " + id + " name : " + " address : " + address + " phone number : " + phone_num + " ] ";
	}
	
}
