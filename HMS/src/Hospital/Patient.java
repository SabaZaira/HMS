package Hospital;
import General.Date;
import General.Time;
public abstract class Patient 
{
	String name, cnic, address, phone, gender,age;
	public Patient(String name,String address,String cnic,String phone,String age,String gender){
		this.name=name;
		this.address=address;
		this.cnic=cnic;
		this.phone=phone;
		this.age=age;
		this.gender=gender;
	}
	void setAddress(String address) {
		this.address=address;
	}
	void setPhone(String phone) {
		this.phone=phone;
	}
	String getName() {
		return name;
	}
	String getAddress() {
		return address;
	}
	String getcnic() {
		return cnic;
	}
	String getPhone() {
		return phone;
	}
	String getAge() {
		return age;
	}
	String getGender() {
		return gender;
	}
	public String toString() 
	{
		return "Patient: "+name+" ( "+gender+" ) "+age+" years old";
	}
	abstract Date getDate(); 
	abstract Doctor getDoctor();
	abstract void setDate(Date date);
	abstract void setTime(Time time);
}
