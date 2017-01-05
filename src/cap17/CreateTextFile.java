package cap17;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

	private Formatter formatter;

	public void openFile(){
		try {
			formatter = new Formatter("clients.txt");
		} catch (SecurityException e) {
			// TODO: handle exception
			System.err.println("You do not have write access to this file!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Error Opening or Creating file!");
			System.exit(1);
		}
	}

	public void addRecords() {
		AccountRecord accountRecord = new AccountRecord();
		Scanner input = new Scanner(System.in);

		System.out.printf("%s\n%s\n%s\n%s\n\n",
				"To terminate input, type the end-of-file indicator",
				"When you are prompted to enter input.",
				"On UNIX/LINUX/MAC OS X type <ctrl> d then press enter",
				"On Windons type <ctrl> z then press enter");

		System.out.printf("%s\n%s",
				"Enter Accont Number (>0), first name, last name and balance",
				"?");

		while(input.hasNext()){
			try{
				accountRecord.setAccount(input.nextInt());
				accountRecord.setFirstName(input.next());
				accountRecord.setLastName(input.next());
				accountRecord.setBalance(input.nextDouble());

				if (accountRecord.getAccount() > 0) {
					formatter.format("%d %s %s %.2f\n", accountRecord.getAccount(),
							accountRecord.getFirstName(), accountRecord.getLastName(),
							accountRecord.getBalance());
				}else{
					System.out.println("Account Number must be greater than 0");
				}
			}catch (FormatterClosedException e){
				System.err.println("Error write to file");
				return;
			}catch (NoSuchElementException e) {
				// TODO: handle exception
				System.err.println("Invalide input. Try again");
				input.nextLine();
			}

			System.out.printf("%s\n%s",
					"Enter Accont Number (>0), first name, last name and balance",
					"?");
		}
	}
	
	public void closeFile(){
		if (formatter != null) {
			formatter.close();
			
		}
	}
}
