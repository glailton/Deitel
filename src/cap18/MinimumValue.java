package cap18;

public class MinimumValue {
	
	 public static int recursiveMinimum(int valores[], int index, int menorSugerido) {  
	        index++;  
	        if(index < valores.length){  
	            int valorTemp = recursiveMinimum(valores, index, valores[index]);  
	            if(valorTemp < menorSugerido) {  
	                menorSugerido = valorTemp;  
	            }  
	        }  
	        return menorSugerido;  
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1,2,5};
		System.out.println(recursiveMinimum(array, 0, array[0]));
	}

}
