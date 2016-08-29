package cap21;

public class GenericmethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {1,2,3,4,5,6,7,8,9};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
		String[] stringArray = {"H", "E", "L", "L", "O"};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(stringArray);
		
	}
	
	public static <T> void printArray(T[] inputArray){
		for(T element:inputArray){
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

}
