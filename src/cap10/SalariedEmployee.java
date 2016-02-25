package cap10;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName,
			String socialSecurityNumber, double salary) {
		super(firstName, lastName, socialSecurityNumber);
		setWeeklySalary(salary);
	}

	
	
	public double getWeeklySalary() {
		return weeklySalary;
	}



	public void setWeeklySalary(double salary) {
		weeklySalary = salary < 0 ? 0 : salary;
	}



	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
	}



	@Override
	public String toString() {
		return "" + super.toString() + "SalariedEmployee [weeklySalary=" + weeklySalary + "]";
	}
	
	

}
