package cap16;

import java.util.Scanner;

public class PigLatin {
	public void printLatinWord(String word){
		String[] pigLatinWord = word.split(" ");
		for(int i = 0; i<=pigLatinWord.length-1; i++){
			String firstLetter = pigLatinWord[i].substring(0, 1).toLowerCase();
			String latinWord = pigLatinWord[i].substring(1)+firstLetter+"ay";
			System.out.print(latinWord+" ");
			//	System.out.print(pigLatinWord[i]+" ");
		}
	}

	public static void main(String[] args) {
		//String user = "My car have dors";
		boolean isExit = false;
		Scanner scanner = new Scanner(System.in);
		PigLatin latin = new PigLatin();

		while(!isExit){
			System.out.println("Type a sentece or type '-1' to exit:");
			String userWord = scanner.nextLine();
			if(userWord.equals("-1")){
				isExit = true;
				System.out.println("The program was finished! Bye!");
			}else{
				latin.printLatinWord(userWord);
				System.out.println();
			}
		}
	}
}
