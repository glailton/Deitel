package cap10;

public class BasePlusCommisionEmployee extends CommisionEmployee{
	
	private double baseSalary;
	
	public BasePlusCommisionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double sales, 
			double rate, double salary) {
		super(firstName, lastName, socialSecurityNumber, sales, rate);
		setBaseSalary(salary);
		// TODO Auto-generated constructor stub
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double salary) {
		baseSalary = (salary > 0) ? salary: 0;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return super.earnings() + getBaseSalary();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s: %s: %f", 
				"base salaried", super.toString(),
				"base salary", getBaseSalary());
	}

	

	

}
