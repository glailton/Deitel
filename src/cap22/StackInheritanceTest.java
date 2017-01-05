package cap22;

public class StackInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInheritance<Integer> stack = new StackInheritance<>();
		
		stack.push(-1);
		stack.push(2);
		stack.push(0);
		stack.push(3);
		stack.push(8);
		
		stack.print();
		
		try {
			int removedItem;
			
			while(true){
				removedItem = stack.pop();
				System.out.println("popped, " + removedItem);
				stack.print();
			}
			
			
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
