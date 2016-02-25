package cap8;

public class SavingAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount saver1 = new SavingAccount(2000);
		SavingAccount saver2 = new SavingAccount(3000);
		
		saver1.setAnnualInterestRate(1.04);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println(saver1.getSavingBalance());
		System.out.println(saver2.getSavingBalance());
		
	}

}
