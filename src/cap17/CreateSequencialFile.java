package cap17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequencialFile {
	
	private ObjectOutputStream output;
	
	public void openFile(){
		try {
			output = new ObjectOutputStream(new FileOutputStream("clients.ser"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error Opening or Creating file");
		}
	}

	public void addRecords() {
		AccountRecordSerializable accountRecord = new AccountRecordSerializable();
		Scanner input = new Scanner(System.in);
		int accountNumber = 0;
		String firstName;
		String lastName;
		double balance;

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
				accountNumber = input.nextInt();
				firstName = input.next();
				lastName = input.next();
				balance = input.nextDouble();

				if (accountNumber > 0) {
					accountRecord = new AccountRecordSerializable(accountNumber, 
							firstName, lastName, balance);
					output.writeObject(accountRecord);
				}else{
					System.out.println("Account Number must be greater than 0");
				}
			}catch (NoSuchElementException e) {
				// TODO: handle exception
				System.err.println("Invalide input. Try again");
				input.nextLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.printf("%s\n%s",
					"Enter Accont Number (>0), first name, last name and balance",
					"?");
		}
	}
	
	public void closeFile(){
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("Error closing file");
				System.exit(1);
			}
			
		}
	}
}
