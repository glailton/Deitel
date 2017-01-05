package cap8;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date(10, 26, 1986);
		System.out.println(date.toString());
		
		for (int i=1;i<365;i++){
			date.nextDay();
			System.out.println(date.toString());
		}
		
		for (int i=1;i<30;i++){
			date.nextDay();
			System.out.println(date.toString());
		}
	}

}
