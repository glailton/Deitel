package cap22;

public class StackInheritance<T> extends List<T>{

	public StackInheritance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackInheritance(String listName) {
		super(listName);
		// TODO Auto-generated constructor stub
	}
	
	public void push(T object){
		insertAtFront(object);
	}
	
	public T pop() throws EmptyListException{
		return removeFromFront();
	}
}
