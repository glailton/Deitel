package cap10;

public class CommisionEmployee extends Employee{
	
	private double grossSales;
	private double commisionRate;

	public CommisionEmployee(String firstName, String lastName,
			String socialSecurityNumber, double sales, double rate) {
		super(firstName, lastName, socialSecurityNumber);
		setGrossSales(sales);
		setCommisionRate(rate);
		// TODO Auto-generated constructor stub
	}
	
	public double getGrossSales() {
		return grossSales;
	}



	public void setGrossSales(double sales) {
		grossSales = (sales < 0) ? 0 : sales;
	}



	public double getCommisionRate() {
		return commisionRate;
	}



	public void setCommisionRate(double rate) {
		commisionRate = (rate > 0 && rate < 1) ? rate : 0;
	}



	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getCommisionRate() * getGrossSales();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s: %s\n%s: %f: %s: %f",
				"commision employee", super.toString(),
				"gross sales", getGrossSales(),
				"commision rate", getCommisionRate());
	}

}
