package cap9;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String first, String last, String ssn, 
			double sales, double rate, double salary) {
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double salary) {
		baseSalary = (salary < 0) ? 0 : salary;
	}
	
	//calcula os lucros
	@Override
	public double earnigs() {
		return baseSalary + (getCommissionRate()*getGrossSales());
	}
	
/*	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s: %s %s\n%s: %s\n%s: %f\n%s: %f\n%s: %f", 
				"commission employer", , lastName,
				"social security name", socialSecurityName,
				"gross sales", grossSales,
				"commission rate", commissionRate,
				"Base Salary", baseSalary);
	}*/
	
}
