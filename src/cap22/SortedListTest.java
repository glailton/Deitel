package cap22;

public class SortedListTest {

	public static void main(String[] args) {
		SortedList sorterList = new SortedList();
		
		sorterList.insert(20);
		sorterList.insert(30);
		sorterList.insert(10);
		sorterList.insert(50);
		
		
		sorterList.orderList();
		sorterList.print();
	}
}
