package General;
public class Time
{
	int hours,min;
	String apm;
	public Time(int hours,int min,String apm)
	{
		this.hours=hours;
		this.min=min;
		this.apm=apm;
	}
	public Time(String tim) {
		// TODO Auto-generated constructor stub
		String s[]=tim.split(":");
		String s1[]=s[1].split(" ");
		this.hours=Integer.parseInt(s[0]);
		this.min=Integer.parseInt(s1[0]);
		this.apm=s1[1];
	}
	void setHours(int hours)
	{
		this.hours=hours;
	}
	void setMin(int min)
	{
		this.min=min;
	}
	void setDuration(String apm)
	{
		this.apm=apm;
	}
	int getHours() {
		return hours;
	}
	int getMin() {
		return min;
	}
	String getApm() {
		return apm;
	}
	public String toString() {
		if(min==0)
			return this.hours+":"+this.min+"0 "+this.apm;
		else
			return this.hours+":"+this.min+" "+this.apm;
	}
}
