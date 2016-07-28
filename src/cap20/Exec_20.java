package cap20;

import java.util.TreeSet;

public class Exec_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Essa é uma frase que sera um texto para ser testado";
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		String[] vector = text.split(" ");
		
		for(int i=0; i< vector.length; i++){
		//	System.out.println(vector[i]);
			treeSet.add(vector[i]);
		}
		
		System.out.println(treeSet);
	}

}
