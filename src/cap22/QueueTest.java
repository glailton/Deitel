package cap22;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		
		queue.enqueue(-1);
		queue.enqueue(2);
		queue.enqueue(0);
		queue.enqueue(3);
		queue.enqueue(8);
		
		queue.print();
		
		try {
			int removedItem;
			
			while(true){
				removedItem = queue.dequeue();
				System.out.println("dequeued, " + removedItem);
				queue.print();
			}
			
			
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
