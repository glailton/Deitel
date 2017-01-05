package cap18;

public class exec_11 {
	
	public static int gcd(int x, int y){
		
		
		if(y==0){
			return x;
		} else{
			return gcd(y, x%y);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(69,33));
	}

}
