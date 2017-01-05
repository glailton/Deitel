package cap18;

public class ReverseString {
	
	private static String aux = "";
	
	public static String stringReverse(String arrayString){
		int size = arrayString.length();
		
			if(size==0){
				return aux;
			}else{
				String lastChar = arrayString.substring(size-1, size);
				arrayString = arrayString.substring(0, size -1);
				aux = aux.concat(lastChar);
				return stringReverse(arrayString);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringReverse("o carro da vizinha"));
	}

}
