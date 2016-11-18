package cap22;

import java.util.LinkedList;

public class ListConcatenate<T> {
	
	private List<T> list;

	public ListConcatenate() {
		super();
		list = new List<>();
	}

	public ListConcatenate(String listName) {
		// TODO Auto-generated constructor stub
	}
	
	public void concatenate(LinkedList<T> l1, LinkedList<T> l2){
		l1.addAll(l2);
	}
	
	public void print(){
		list.print();
	}
	
	public static void main(String[] args){
		LinkedList<String> list1 = new LinkedList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		String n1 = "Glailton";
		list1.add(n1);
		String n2 = " Costa";
		list2.add(n2);
		
		ListConcatenate<String> l = new ListConcatenate<>();
		l.concatenate(list1, list2);
		
		System.out.println(list1);
		
		
		
	}
}
	
