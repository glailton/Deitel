package cap8;

public class TrafficLightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(TrafficLight tl: TrafficLight.values()){
			System.out.println("Traffic " + tl + " duration " + tl.getSeconds());
		}
	}

}
