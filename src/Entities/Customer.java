package Entities;

public class Customer {

	public int Id;
	public String FirtName;
	public String Lastname;
	public int DateOfBirth;
	public Long nationalityId;

	public Customer(int id, String firtName, String lastname, int dateOfBirth, long nationalityId) {

		this.Id = id;
		this.FirtName = firtName;
		this.Lastname = lastname;
		this.DateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirtName() {
		return FirtName;
	}

	public void setFirtName(String firtName) {
		FirtName = firtName;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}

}
