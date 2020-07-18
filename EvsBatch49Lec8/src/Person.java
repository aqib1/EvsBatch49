
/// access modifiers 

//public (anywhere)
//private (within class)
//protected (same package + (outside)child class)
//default (same package)

public class Person {

	private int id;
	private String name;
	private String cnic;
	private String contactNo;

	public Person() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnic() {
		return cnic;
	}

	public void setCnic(String cnic) {
		this.cnic = cnic;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", cnic=" + cnic + ", contactNo=" + contactNo + "]";
	}
	
	
	
	
	// -> job fulfill 
	// -> job return 

}
