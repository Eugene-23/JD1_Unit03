package htp.home.task06.main;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		if ((0 <= hour) && (hour < 24)) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}

		if ((0 <= minute) && (minute < 60)) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}

		if ((0 <= second) && (second < 60)) {
			this.second = second;
		} else {
			this.second = 0;
		}

	}

	public void setHour(int hour) {
		if ((0 <= hour) && (hour < 24)) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setMinute(int minute) {
		if ((0 <= minute) && (minute < 60)) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setSecond(int second) {
		if ((0 <= second) && (second < 60)) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	public void printTime() {
		System.out.println(hour + ":" + minute + ":" + second);		
	}

}
