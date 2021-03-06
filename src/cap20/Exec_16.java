package cap20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Exec_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		createMap(myMap);
		displayMap(myMap);
		
	}
	
	private static void createMap(Map<String, Integer> map){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		
		String[] tokens = input.split(" ");
		
		for(String token: tokens){
			String word = token.toLowerCase();
			
			if(map.containsKey(word)){
				int count = map.get(word);
				map.put(word, count+1);
			}else{
				map.put(word, 1);
			}
		}
		
		/*for(int i = 0; i<input.length();i++){
			char letter = input.toLowerCase().charAt(i);
			if(map.containsKey(Character.toString(letter))){
				int count = map.get(Character.toString(letter));
				map.put(Character.toString(letter), count+1);
			}else{
				map.put(Character.toString(letter), 1);
			}
			//System.out.println(map.toString());
		}*/
	}
	
	private static void displayMap(Map<String, Integer> map){
		Set<String> keys = map.keySet();
		
		TreeSet<String> sortedKeys = new TreeSet<String>(keys);
		System.out.println("\nMap contains:\nKey\t\tValue");
		
		for(String key: sortedKeys){
			if(map.get(key)>1)
				System.out.printf("%-10s%10s\n", key, map.get(key));
		}
		
		System.out.printf("\nSize: %d\nisEmpty: %b\n", map.size(), map.isEmpty());
	}

}
