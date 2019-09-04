package htp.home.task10.main;

public class Airport {

	private Airline[] port;
	private int countOfAirlines;
	
	public Airport(int number) {
		port = new Airline[number];
		countOfAirlines = 0;
	}
	
	public void add(Airline newPort) {		
		port[countOfAirlines] = newPort;
		countOfAirlines++;		
	}	
			
	public Airline[] getPort() {
		return port;
	}
	
	public void setPort(Airline[] port) {
		this.port = port;
	}
	
}
