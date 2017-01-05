package cap18;

public class exec_9 {
	
	public static int power(int base, int exponent){
		if(exponent == 1){
			return base;
		} else if (exponent == 0){
			return 1;
		} else{
			return base*power(base, exponent-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(4, 3));
	}

}
