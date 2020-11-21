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
