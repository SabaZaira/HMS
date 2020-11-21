package Hospital;
import General.Date;
public abstract class IndoorPatient extends Patient
{
	String wardno,roomno,bedno;
	double fee;
	Doctor doc;
	String n,c,p,g,dep,s;
	Date d;
	public IndoorPatient(String name, String address, String cnic, String phone, String age, String gender, String wardno,String roomno, String bedno, double fee, Doctor doc, Date d) 
	{
		super(name, address, cnic, phone, age, gender);
		this.wardno = wardno;
		this.roomno = roomno;
		this.bedno = bedno;
		this.fee = fee;
		this.doc = doc;
		this.d = d;
	}
	public void setFee(int fee) {
		this.fee=fee;
	}
	public double getFee() {
		return fee;
	}
	public void setWardNo(String wardNo) {
		this.wardno=wardNo;
	}
	public String getWardNo() {
		return wardno;
	}
	public void setRoomNo(String roomNo) {
		this.roomno=roomNo;
	}
	public String getRoomNo() {
		return roomno;
	}
	public void setBedmNo(String bedNo) {
		this.bedno=bedNo;
	}
	public String getBedNo() {
		return bedno;
	}
	Date getDate()
	{
		return d;
	}
	Doctor getDoctor() {
		return doc;
	}
	void setDate(Date date)
	{
		d=date;
	}
	public String toString()
	{
		 return "indoor patient name : "+name+" cnic : "+cnic+" phone : "+phone+" gender : "+gender+" age : "+age+" ward no : "+wardno+" room no : "+roomno+"bed no : "+bedno+"fee : "+fee+"DOCTOR : "+doc;
	}
}
