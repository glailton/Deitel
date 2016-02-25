package cap8;

public class SavingAccount {
	
	static double annualInterestRate;
	private double savingBalance;
	
	public SavingAccount(double savingBalance) {
		// TODO Auto-generated constructor stub
		this.savingBalance = savingBalance;
	}
	
	public void calculateMonthlyInterest(){
		double sb = getSavingBalance()*(getAnnualInterestRate()/12);
		setSavingBalance(sb);
		//savingBalance += savingBalance*(annualInterestRate/12);	
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	public static void modifyInterestRate(double interestRate){
		annualInterestRate = interestRate;
	}
	
	

}
