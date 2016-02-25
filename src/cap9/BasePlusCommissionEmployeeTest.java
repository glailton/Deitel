package cap9;

import java.util.EmptyStackException;

public class BasePlusCommissionEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePlusCommissionEmployee commissionEmployer = new BasePlusCommissionEmployee("Glailton", "Costa", "022.112.332-01", 10000, .6, 300);
		
		System.out.printf("%s %s\n", "First name is: ", commissionEmployer.getFirstName());
		System.out.printf("%s %s\n", "Last name is: ", commissionEmployer.getLastName());
		System.out.printf("%s %s\n", "SSN is: ", commissionEmployer.getSocialSecurityName());
		System.out.printf("%s %.2f\n", "Gross sales is: ", commissionEmployer.getGrossSales());
		System.out.printf("%s %.2f\n", "Commission Rate is: ", commissionEmployer.getCommissionRate());
		System.out.printf("%s %.2f\n", "Base Salary is: ", commissionEmployer.getBaseSalary());
		
		commissionEmployer.setBaseSalary(1000);
	//	commissionEmployer.setGrossSales(500);
	//	commissionEmployer.setCommissionRate(.1);
		
		System.out.printf("\n%s:\n\n%s\n", 
				"Update employee information obtained by toString", commissionEmployer);
	}

}
