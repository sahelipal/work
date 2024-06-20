package timeZone;

public class TimeConverter {
	private int hours;
	private int minutes;
	private int seconds;
	private String meridiem;
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public String getMeridiem() {
		return meridiem;
	}
	public void setMeridiem(String meridiem) {
		this.meridiem = meridiem;
	}
	public TimeConverter(int hours, int minutes, int seconds, String meridiem) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.meridiem = meridiem;
	}
	
	public String convertToGMT() {
		if(hours<=0|| minutes<=0||seconds<=0) {
			return "Eror";
		}
		else if(!(meridiem.equalsIgnoreCase("AM")||meridiem.equalsIgnoreCase("PM"))) {
			return "Eror";
		}else {
			this.hours=this.hours-5;
			this.minutes=this.minutes-30;
		}
		
		String hours=Integer.toString(this.hours);
		if(hours.length()==1) {
			hours="0"+hours;
		}
		String minutes=Integer.toString(this.minutes);
		if(minutes.length()==1) {
			minutes="0"+minutes;
		}
		String seconds=Integer.toString(this.seconds);
		String meridiem=this.meridiem;
		String result=hours+":"+minutes+":"+seconds+":"+meridiem;
		return result;
	}
}
