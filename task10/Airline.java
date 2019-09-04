package htp.home.task10.main;

public class Airline {

	private String destination;
	private int flyghtNum;
	private String planesType;
	private Time time;
	private String daysOfWeek;
	
	
	public Airline(String destination, int flyghtNum, String planesType, Time time, String daysOfWeek) {
		
		this.destination = destination;
		this.flyghtNum = flyghtNum;
		this.planesType = planesType;
		this.time = time;
		this.daysOfWeek = daysOfWeek;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public int getFlyghtNum() {
		return flyghtNum;
	}


	public void setFlyghtNum(int flyghtNum) {
		this.flyghtNum = flyghtNum;
	}


	public String getPlanesType() {
		return planesType;
	}


	public void setPlanesType(String planesType) {
		this.planesType = planesType;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}


	public String getDaysOfWeek() {
		return daysOfWeek;
	}


	public void setDaysOfWeek(String daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}


	@Override
	public String toString() {
		return "[destination=" + destination + ", flyghtNum=" + flyghtNum + ", planesType=" + planesType
				+ ", time=" + time + ", daysOfWeek=" + daysOfWeek + "]";
	}
	
	
	
	
}
