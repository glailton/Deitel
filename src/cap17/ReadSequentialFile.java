package cap17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadSequentialFile {
	private ObjectInputStream input;
	
	public void openFile(){
		try {
			input = new ObjectInputStream(new FileInputStream("clients.ser"));
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("Error Opening File");
			System.exit(1);
		}
	}

	public void readRecords() {
		AccountRecordSerializable accountRecord = new AccountRecordSerializable();

		System.out.printf("%-10s%-12s%-12s%10s\n",
				"Account", "First Name", "Last Name", "Balance");

		try{
			while(true){

				accountRecord = (AccountRecordSerializable) input.readObject();
				
				System.out.printf("%-10d%-12s%-12s%10.2f\n", accountRecord.getAccount(),
						accountRecord.getFirstName(), accountRecord.getLastName(),
						accountRecord.getBalance());

			}
		}catch(NoSuchElementException e){
			System.err.println("File Improperly formed");
			System.exit(1);
		}catch (IllegalStateException e) {
			// TODO: handle exception
			System.err.println("Error reading from file");
			System.exit(1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Unable to create object");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error reading from file");		}
	}

	public void closeFile(){
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
