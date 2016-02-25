package cap18;

public class exec_14 {

	public static boolean palindrome(String sentence){
		if(sentence.length() == 1){
			return true;
		}else if (sentence.equals("")){
			return true;
		} else{
			sentence = sentence.toLowerCase();
			sentence = sentence.replaceAll(" ", "");
			int size = sentence.length();

			String firstChar = sentence.substring(0,1);
			String lastChar = sentence.substring(size-1, size);
			if(firstChar.equals(lastChar)){
				String aux = sentence.substring(1);
				sentence = aux.substring(0, aux.length()-1);
				return palindrome(sentence);
			}else{
				return false;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(palindrome("ROMA ME TEM AMOR")){
			System.out.println("Palindrome");
		} else{
			System.out.println("Não é Palindrome");
		}
	}

}
