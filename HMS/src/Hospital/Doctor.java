package Hospital;
public class Doctor 
{
	String name,department,specialization,gender,cnic,phone;
	public Doctor(String name,String department,String specialization,String cnic,String phone,String gender)
	{
		this.name=name;
		this.department=department;
		this.specialization=specialization;
		this.cnic=cnic;
		this.phone=phone;
		this.gender=gender;
	}
	void setDepartment(String department) {
		this.department=department;
	}
	void setSpecialization(String specialization) {
		this.specialization=specialization;
	}
	void setPhone(String phone) {
		this.phone=phone;
	}
	String getName() {
		return name;
	}
	String getDepartment() {
		return department;
	}
	String getSpecialization() {
		return specialization;
	}
	String getCNIC() {
		return cnic;
	}
	String getPhone() {
		return phone;
	}
	String getGender() {
		return gender;
	}
}
