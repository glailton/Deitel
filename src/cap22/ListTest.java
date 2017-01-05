package cap22;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =  new List<Integer>();
		
		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(1);
		list.print();
		list.insertAtBack(3);
		list.print();
		list.insertAtBack(5);
		list.print();
		
		try {
			int removedItem = list.removeFromFront();
			System.out.println("removed " + removedItem);
			list.print();
			
			removedItem = list.removeFromFront();
			System.out.println("removed " + removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.println("removed " + removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.println("removed " + removedItem);
			list.print();
			
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
