package cap8;

public enum TrafficLight {
	RED (40),YELLOW (5), GREEN (30);
	
	private int seconds;
	
	TrafficLight(int sec) {
		// TODO Auto-generated constructor stub
		this.seconds = sec;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
}
