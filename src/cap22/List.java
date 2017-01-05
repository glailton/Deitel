package cap22;

public class List<T> {
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name;
	
	public List() {
		// TODO Auto-generated constructor stub
		this("list");
	}
	
	public List(String listName) {
		// TODO Auto-generated constructor stub
		name = listName;
		firstNode = lastNode = null;
	}
	
	public void insertAtFront(T insertItem){
		if(isEmpty()){
			firstNode = lastNode = new ListNode<T>(insertItem);
		}else{
			firstNode = new ListNode<T>(insertItem, firstNode); 
		}
	}
	
	

	public void insertAtBack(T insertItem){
		if(isEmpty()){
			firstNode = lastNode = new ListNode<T>(insertItem);
		}else{
			lastNode = lastNode.nextNode = new ListNode<T>(insertItem); 
		}
	}
	
	public T removeFromFront() throws EmptyListException{
		if (isEmpty()){
			throw new EmptyListException(name);
		}
		
		T removeItem = firstNode.getData();
		
		if(firstNode == lastNode){
			firstNode = lastNode = null;
		}else{
			firstNode = firstNode.getnext();
		}
		
		return removeItem;
	}
	
	public T removeFromBack() throws EmptyListException{
		if (isEmpty()){
			throw new EmptyListException(name);
		}
		
		T removeItem = lastNode.getData();
		
		if(firstNode == lastNode){
			firstNode = lastNode = null;
		}else{
			ListNode<T> current = firstNode;
			
			while (current.nextNode != lastNode){
				current = current.nextNode;
			}
			
			lastNode = current;
			current.nextNode = null;
		}
		
		return removeItem;
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return firstNode == null;
	}
	
	public void print(){
		if(isEmpty()){
			System.out.println("Empty " + name);
			return;
		}
		
		System.out.printf("The %s is: ", name);
		ListNode<T> current = firstNode;
		
		while(current != null){
			System.out.printf("%s ", current.data);
			current = current.nextNode;
		}
		
		System.out.println();
	}

	public ListNode<T> getFirstNode() {
		return firstNode;
	}

	public void setFirstNode(ListNode<T> firstNode) {
		this.firstNode = firstNode;
	}

	public ListNode<T> getLastNode() {
		return lastNode;
	}

	public void setLastNode(ListNode<T> lastNode) {
		this.lastNode = lastNode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
