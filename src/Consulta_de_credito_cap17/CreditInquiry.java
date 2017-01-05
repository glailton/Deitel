package Consulta_de_credito_cap17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import cap17.AccountRecord;

public class CreditInquiry {
	private MenuOption accountType;
	private Scanner input;
	private final static MenuOption[] choices = {MenuOption.ZERO_BALANCE,
		MenuOption.CREDIT_BALANCE, MenuOption.DEBIT_BALANCE, MenuOption.END};

	public void readRecords() {
		AccountRecord accountRecord = new AccountRecord();

		try{
			input = new Scanner(new File("clients.txt"));

			while(input.hasNext()){

				accountRecord.setAccount(input.nextInt());
				accountRecord.setFirstName(input.next());
				accountRecord.setLastName(input.next());
				accountRecord.setBalance(input.nextDouble());

				if (shouldDisplay(accountRecord.getBalance()))
					System.out.printf("%-10d%-12s%-12s%10.2f\n", 
							accountRecord.getAccount(),
							accountRecord.getFirstName(), 
							accountRecord.getLastName(),
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("File cannot be found.");
			System.exit(1);
		}finally{
			if(input!=null)
				input.close();
		}
	}

	private boolean shouldDisplay(double balance) {
		// TODO Auto-generated method stub
		if((accountType==MenuOption.CREDIT_BALANCE) && (balance<0))
			return true;
		else if ((accountType==MenuOption.DEBIT_BALANCE) && (balance>0))
			return true;
		else if ((accountType==MenuOption.ZERO_BALANCE) && (balance==0))
			return true;
		return false;
	}
	
	private MenuOption getRequest(){
		Scanner textIn = new Scanner(System.in);
		int request = 1;
		
		System.out.printf("\n%s\n%s\n%s\n%s\n%s\n", "Enter request",
				"1 - List Accounts with zero balances",
				"2 - List Accounts with credit balances",
				"3 - List Accounts with debit balances",
				"4 - End of run");
		
		try {
			do{
				System.out.print("\n?");
				request = textIn.nextInt();
			}while((request < 1)||(request>4));
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("Invalid input");
			System.exit(1);
		}
		return choices[request-1];
	}
	
	public void processRequests() {
		accountType = getRequest();
		
		while (accountType!=MenuOption.END) {
			switch (accountType) {
			case ZERO_BALANCE:
				System.out.println("\nAccounts with zero balances:\n");
				break;
			case CREDIT_BALANCE:
				System.out.println("\nAccounts with credit balances:\n");
				break;
			case DEBIT_BALANCE:
				System.out.println("\nAccounts with debit balances:\n");
				break;
				

			default:
				break;
			}
			readRecords();
			accountType = getRequest();
		}
	}
}
