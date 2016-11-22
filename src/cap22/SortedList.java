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
	
	public int size(){
		ListNode<Integer> current = list.getFirstNode();
		int n = 0;
		while(current != null){
			current = current.nextNode;
			n++;
		}
		return n;
	}
	
	public void orderList(){
		
		
		
		for(int i = 0; i <= size(); i++){
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
						//current = list.getFirstNode();
						break;
					}
				}
			}
		}
		
	}

	
}
