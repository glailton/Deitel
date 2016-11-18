package cap22;

public class SortedList{
	private ListNode<Integer> firstNode;
	private ListNode<Integer> lastNode;
	private List<Integer> list = new List<>();
	
	public SortedList() {
		super();
		this.firstNode = null;
		this.lastNode = null;
	}
	
	public void insert(Integer insertItem){
		list.insertAtFront(insertItem);
	}
	
	public void print(){
		list.print();
	}
	
	public void orderList(){
		
		ListNode<Integer> current = list.getFirstNode();
		
		while(current != null){
			if((current != null) && (current.nextNode != null) && ((int) current.data > (int) current.nextNode.data)){
				Integer aux = current.nextNode.data;
				current.nextNode.data = current.data;
				current.data = aux;
			}else{
				if(current.nextNode != null)
					current = current.nextNode;
				else{
					return;//current = list.getFirstNode();
				}
			}
		}
	}

	
}
