package cap18;

public class PrintArray {
	static String result = "";
	
	public static String printArray(int position, int array[]){
		int size = array.length;
		
		for(int i=0;i<=size;i++){
			if(position == size){
				return result;
			}else{
				result = result.concat(String.valueOf(array[position])+" ");
				return printArray(position+1,array);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int array[] = {1,2,4,5,6,7,4,5,7,3};
		System.out.println(printArray(0,array));
	}

}
