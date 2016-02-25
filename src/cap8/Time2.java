package cap8;

public class Time2 {
	private int hour;
	private int minute;
	private int second;
	private int time;

	public Time2(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public Time2(int h){
		this.hour = h;
		this.minute = 0;
		this.second = 0;
	}

	public Time2(int h, int m){
		this.hour = h;
		this.minute = m;
		this.second = 0;
	}

	public Time2(int h, int m, int s){
		this.hour = h;
		this.minute = m;
		this.second = s;
	}

	public Time2 (Time2 time){
		this(time.getHour(), time.getMinute(), time.getSecond());
	}

	public void setTime(int h, int m, int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}

	public int getHour() {
		return hour;
	}

	public boolean setHour(int h) {
	//	hour = ((h >=0 && h < 24)? h : 0);
		if(h>=0 && h<24){
			hour = h;
			return true;
		}else{
			hour = 0;
			return false;
		}
	}

	public int getMinute() {
		return minute;
	}

	public boolean setMinute(int m) {
	//	minute = ((m >=0 && m < 60)? m : 0);
		if(m >=0 && m < 60){
			minute = m;
			return true;
		}else{
			minute = 0;
			return false;
		}
	}

	public int getSecond() {
		return second;
	}

	public boolean setSecond(int s) {
	//	second = ((s >=0 && s < 60)? s : 0);
		if(s >=0 && s < 60){
			second = s;
			return true;
		}else{
			second = 0;
			return false;
		}
	}
	
	public void tick(){
		if (second == 59)
			incrementMinute();
		second = (second+1)%60;
	}
	
	public void incrementMinute(){
		if (minute == 59)
			incrementHour();
		minute = (minute+1)%60;
	}
	
	public void incrementHour(){
		hour = (hour+1)%24;
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", 
				getHour(), getMinute(), getSecond());
	}
	
	public String toString()
	   {
	      return String.format( "%d:%02d:%02d %s", 
	         ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
	         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
	   }

}
