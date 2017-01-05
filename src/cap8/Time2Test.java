package cap8;

import java.sql.Time;

public class Time2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(21, 34);
		Time2 t4 = new Time2(12, 25, 42);
		Time2 t5 = new Time2(27, 74, 99);
		Time2 t6 = new Time2(t4);
		
		System.out.println("Constructed with");
		System.out.println("t1:");
		System.out.printf(" %s\n", t1.toUniversalString());
		System.out.printf(" %s\n", t1.toString());
		
		System.out.println("t2:");
		System.out.printf(" %s\n", t2.toUniversalString());
		System.out.printf(" %s\n", t2.toString());
		
		System.out.println("t3:");
		System.out.printf(" %s\n", t3.toUniversalString());
		System.out.printf(" %s\n", t3.toString());
		
		System.out.println("t4:");
		System.out.printf(" %s\n", t4.toUniversalString());
		System.out.printf(" %s\n", t4.toString());
		
		System.out.println("t5:");
		System.out.printf(" %s\n", t5.toUniversalString());
		System.out.printf(" %s\n", t5.toString());
		
		System.out.println("t6:");
		System.out.printf(" %s\n", t6.toUniversalString());
		System.out.printf(" %s\n", t6.toString());
		
		Time2 time = new Time2();
		
		for(int i=1; i<8466; i++){
			System.out.println(time.toUniversalString());
			time.tick();
		}
		
		Time2 t7 = new Time2();
		boolean verifyHour = t7.setHour(10);
		boolean verifyMinute = t7.setMinute(60);
		boolean verifySecond = t7.setSecond(54);
		
		if(!verifyHour || !verifyMinute || !verifySecond){
			System.out.println("Wrong time setted");
			System.out.printf(" %s\n", t7.toString());
		}
		
			
	} 
}
