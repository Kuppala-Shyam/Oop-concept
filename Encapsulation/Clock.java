package InternPack;

public class Clock {
	private int hr;
	private int min;
	private int sec;
	public Clock(int hr,int min,int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getHr() {
		return this.hr;
	}
	public void setMin(int min) {
		 this.min=min;
	}
	public int getMin() {
		return this.min;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getSec() {
		return this.sec;
	}
	public void showTime() {
		System.out.println("hr:"+"min:"+"sec"+"-"+hr+":"+min+":"+sec);
	}
	@Override
	public String toString() {
		return "Clock [hr=" + hr + ", min=" + min + ", sec=" + sec + "]";
	}
}
