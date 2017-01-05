package cap20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exec_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nomes = {"glailton", "deisianne", "jose", "aldair", "glailton", "deisianne"};
		Set<String> setNomes = new HashSet<>();
		for(int i = 0; i < nomes.length; i++){
			setNomes.add(nomes[i]);
		}
		
		/*for(String n: setNomes ){
			System.out.println(setNomes);
		}*/
		Iterator<String> i = setNomes.iterator();
		System.out.println(i.next());
	/*	while(i.hasNext()){
			System.out.println((String)i.next());
		}*/
		System.out.println(setNomes);
	}

}
