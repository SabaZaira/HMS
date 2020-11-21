package Hospital;
import General.Date;
import General.Time;
public class OutdoorPatient extends Patient 
{
	Date d;
	Time t;
	String n,c,p,g,dep,s;
	Doctor doc;
	double fee;
	public OutdoorPatient(String name, String address, String cnic, String phone, String age, String gender,String dat,String tim, Doctor doc, double fee) 
	{
		super(name, address, cnic, phone, age, gender);
		d =new Date(dat);
		t=new Time(tim);
		this.doc = doc;
		this.fee = fee;
	}
	public void setFee(int fee) {
		this.fee=fee;
	}
	public double getFee() {
		return fee;
	}
	public Date getDate() {
		return d;
	}
	Doctor getDoctor() {
		return doc;
	}
	void setDate(Date date) {
		d=date;
	}
	void setTime(Time time) {
		t=time;
	}
	public String toString()
	{
		return "outdoor patient name : "+name+" cnic : "+cnic+" phone : "+phone+" gender : "+" age : "+age+" doctor "+d+" appointment date : "+d+" appointment time : "+t+"fee : "+fee+"DOCTOR : "+doc;
	}
}
