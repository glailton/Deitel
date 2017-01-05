package cap9;

public class CommissionEmployee {
	private String firstName;
	private String lastName;
	private String socialSecurityName;
	private double grossSales; //vendas brutas semanais
	private double commissionRate; //porcentagem da comissao
	
	public CommissionEmployee(String first, String last, String ssn, double sales, double rate) {
		firstName = first;
		lastName = last;
		socialSecurityName = ssn;
		setGrossSales(sales);
		setCommissionRate(rate);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityName() {
		return socialSecurityName;
	}

	public void setSocialSecurityName(String socialSecurityName) {
		this.socialSecurityName = socialSecurityName;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double sales) {
		grossSales = (sales < 0) ? 0 : sales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double rate) {
		commissionRate = (rate > 0 && rate < 1) ? rate : 0;
	}
	
	//calcula os lucros
	public double earnigs() {
		return commissionRate*grossSales;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s: %s %s\n%s: %s\n%s: %f\n%s: %f", 
				"commission employer", firstName, lastName,
				"social security name", socialSecurityName,
				"gross sales", grossSales,
				"commission rate", commissionRate);
	}
	
}
