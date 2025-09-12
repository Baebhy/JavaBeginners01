package defaultt;

public class Salarycalculator {

	public static void main(String[] args) {
		int DefaultSalary = 570000;
		double EmployeeBonus = 128560.55;
		int TransportationAllowance = 40000;
		int FeedingAllowance = 50000;
		double TaxFee = 5.43;
		double TaxImpact = 5.43/100;
		double TaxedSalary = DefaultSalary - (DefaultSalary * TaxImpact);
		System.out.println("Default Salary is " + DefaultSalary);
		System.out.println("Tax on salary is " + TaxFee);
		System.out.println("Salary after tax is " + TaxedSalary);
		
		
		

	}

}
