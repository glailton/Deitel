package cap17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
	private Scanner input;

	public void openFile(){
		try {
			input = new Scanner(new File("clients.txt"));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("Error Opening File");
			System.exit(1);
		}
	}

	public void readRecords() {
		AccountRecord accountRecord = new AccountRecord();
		Scanner input = new Scanner(System.in);

		System.out.printf("%-10s%-12s%-12s%10s\n",
				"Account", "First Name", "Last Name", "Balance");

		try{
			while(input.hasNext()){

				accountRecord.setAccount(input.nextInt());
				accountRecord.setFirstName(input.next());
				accountRecord.setLastName(input.next());
				accountRecord.setBalance(input.nextDouble());


				System.out.printf("%-10d%-12s%-12s%10.2f\n", accountRecord.getAccount(),
						accountRecord.getFirstName(), accountRecord.getLastName(),
						accountRecord.getBalance());

			}
		}catch(NoSuchElementException e){
			System.err.println("File Improperly formed");
			input.close();
			System.exit(1);
		}catch (IllegalStateException e) {
			// TODO: handle exception
			System.err.println("Error reading from file");
			System.exit(1);
		}
	}

	public void closeFile(){
		if (input != null) {
			input.close();

		}
	}
}