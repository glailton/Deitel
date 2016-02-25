package cap11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static int quotient(int num, int den) throws ArithmeticException{
		{
			return num/den;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;

		do{
			try {
				System.out.println("Please enter a numerator");
				int num = scanner.nextInt();
				System.out.println("Please enter a denominator");
				int den = scanner.nextInt();

				int result = quotient(num, den);
				System.out.printf("\nResult: %d / %d = %d", num, den, result);
				continueLoop = false;
			} catch (InputMismatchException inputMismatchException) {
				// TODO: handle exception
				System.err.printf("\nException: %s\n", inputMismatchException);
				scanner.nextLine();
				System.out.println("You must enter intergers! Bitch!!!\n");
			} catch (ArithmeticException arithmeticException) {
				// TODO: handle exception
				System.err.printf("\nException: %s\n", arithmeticException);
				scanner.nextLine();
				System.out.println("Zero is a invalid denominator, Bitch\n");
			}

			
		} while(continueLoop);

}
}
