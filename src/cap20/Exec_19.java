package cap20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exec_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = leitor.nextInt();
		verificaPrimo(num);
	}

	public static void verificaPrimo(int num){
		int primo = 0;
		for(int i = 2; i < num;i++){
			if(num%i==0){
				primo = 1;
				break;
			}
		}
		if(primo==0){
			System.out.println("primo");
		}
		else{
			System.out.println("Nao primo");
			System.out.println("Seus fatores são: ");
			mostraFatores(num);
		}
	}

	public static void mostraFatores(int num){
		int i = 2;
		Set<Integer> set = new HashSet<>();
		while(num!=1){
			if(num%i==0){
				set.add(i);
				System.out.println(i);
				num = num/i;
			}else{
				i++;
			}
		}
		System.out.println(set);
	}
}
