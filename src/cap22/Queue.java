package cap22;

public class Queue<T> {
	private List<T> queueList;

	public Queue() {
		super();
		queueList = new List<>("queue");
	}
	
	public void enqueue(T object){
		queueList.insertAtBack(object);
	}
	
	public T dequeue() throws EmptyListException{
		return queueList.removeFromFront();
	}
	
	public boolean isEmpty(){
		return queueList.isEmpty();
	}
	
	public void print(){
		queueList.print();
	}

}
