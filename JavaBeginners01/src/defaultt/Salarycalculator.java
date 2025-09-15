/*Salary Calculator with bonuse and allowance*/

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
		double FSalarywithbonuses = TaxedSalary + EmployeeBonus + TransportationAllowance + FeedingAllowance;
		System.out.println("Default Salary = " + DefaultSalary);
		System.out.println("Tax on salary = " + TaxFee);
		System.out.println("Salary after tax = " + TaxedSalary);
		System.out.println("Bonuses for the month");
		System.out.println("Employee Bonus = "+ EmployeeBonus);
		System.out.println("Transportation Allowance = " + TransportationAllowance);
		System.out.println("Feeding Allowance = " + FeedingAllowance);
		System.out.println("Total salary plus bonuses and allowance = " + FSalarywithbonuses);
		
		
		

	}

}
