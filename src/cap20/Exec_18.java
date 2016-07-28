package cap20;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Exec_18 {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("Azul");
		list1.add("Amarelo");
		list1.add("Beje");
		list1.add("Cinza");
		list1.add("Dourado");
		list1.add("Escuro");
		list1.add("Laranja");
		list1.add("Louro");
		list1.add("Marrom");
		list1.add("Vermelho");
		
		System.out.println(list1);
		
		LinkedList<String> list2 = new LinkedList<>();
		Comparator<String> cmp = Collections.reverseOrder();
		list2 = list1;
		Collections.sort(list2, cmp);
		
		System.out.println(list2);
		
	}

}
