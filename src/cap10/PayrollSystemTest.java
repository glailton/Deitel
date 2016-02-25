package cap10;

public class PayrollSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedEmployee salariedEmployee = new 
			SalariedEmployee("Jonh", "Smith", "111-111-111.11", 800);
		HourlyEmployee hourlyEmployee = new 
				HourlyEmployee("Karen", "Prince", "222-222.22", 16.75, 40);
		CommisionEmployee commisionEmployee = new 
				CommisionEmployee("Sue", "Jones", "233-333.33", 10000, 0.6);
		BasePlusCommisionEmployee basePlusCommisionEmployee = new 
				BasePlusCommisionEmployee("Bob", "Lewis", "444-744.44",
						500, 0.4, 300);
		
		System.out.println("Employees");
		System.out.printf("%s\n%s: %f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s\n%s: %f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s\n%s: %f\n\n", commisionEmployee, "earned", commisionEmployee.earnings());
		System.out.printf("%s\n%s: %f\n\n", basePlusCommisionEmployee, "earned", basePlusCommisionEmployee.earnings());
		
		Employee[] employees = new Employee[4];
		
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commisionEmployee;
		employees[3] = basePlusCommisionEmployee;
		
		System.out.println("Employees polimorfhycally");
		
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);
			
			if (currentEmployee instanceof BasePlusCommisionEmployee) {
				BasePlusCommisionEmployee employee = (BasePlusCommisionEmployee) currentEmployee;
				employee.setBaseSalary(1.10*employee.getBaseSalary());
				
				System.out.printf("new base salary is: %f\n", employee.getBaseSalary());
				
				System.out.printf("earned %f\n\n", currentEmployee.earnings());
				
				
			}
		}
		
		for (int i = 0; i < employees.length; i++) {
			System.out.printf("Employee %d is a %s\n", i, employees[i].getClass().getName());
		}
			
	}

}
