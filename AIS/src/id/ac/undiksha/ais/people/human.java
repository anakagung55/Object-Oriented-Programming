package id.ac.undiksha.ais.people;

public abstract class human {
	
	private String name;
	private boolean gender;
	private String address;
	private String birthDate;
	
	public human() {
		this.name = "<please insert name>";
		this.gender = true;
		this.address = "<please insert address>";
		this.birthDate = "<please insert birth date>";
	}
	
	public human(String name, 
			boolean gender, 
			String address, 
			String birthDate) {
		super();
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public void printAll() {
		System.out.println(this.name);	
		System.out.println(this.gender);
		System.out.println(this.address);
		System.out.println(this.birthDate);	
	}

	
}


