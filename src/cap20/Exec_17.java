package cap20;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Exec_17 {
	
	

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(); 
		
		System.out.println(fillList(list));
		//System.out.println(sum(fillList()));
		average(list);
	}
	
	public static int randomNumber(){
		Random random = new Random();
		
		return random.nextInt(100);
	}
	
	public static LinkedList<Integer> fillList(LinkedList<Integer> list){
		
		for(int i = 0; i < 25; i++){
			list.add(randomNumber());
		}
		Collections.sort(list);
		return list;
	}
	
	public static double sum(LinkedList<Integer> list){
		int sum = 0;
		for(int i : list){
			sum+=i;
		}
		return sum;		
	}
	
	public static double average(LinkedList<Integer> list){
		double average = sum(list)/list.size();
		
		System.out.println("Soma: " +sum(list));
		System.out.println("Média: "+ average);
		return average;
	}

}
