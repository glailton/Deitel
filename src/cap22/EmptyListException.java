package cap22;

public class EmptyListException extends Exception {

	public EmptyListException() {
		this("list");
	}
	
	public EmptyListException(String name) {
		super(name + " is empty");
	}

}
