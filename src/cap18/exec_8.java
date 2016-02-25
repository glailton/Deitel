package cap18;

public class exec_8 {
	
	public static int sum(int n){
		if(n == 0){
			return 0;
		}else{
			return n + sum(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3));
	}

}
