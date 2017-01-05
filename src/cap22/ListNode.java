package cap22;

public class ListNode<T> {
	T data;
	ListNode<T> nextNode;
	
	public ListNode(T object) {
		// TODO Auto-generated constructor stub
		this(object, null);
	}
	
	public ListNode(T object, ListNode<T> node) {
		// TODO Auto-generated constructor stub
		data = object;
		nextNode = node;
	}
	
	T getData(){
		return data;
	}
	
	ListNode<T> getnext(){
		return nextNode;
	}
}
