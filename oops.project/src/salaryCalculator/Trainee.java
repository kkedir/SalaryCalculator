package salaryCalculator;

public class Trainee extends Employee{
	
	public static double getBasicSalary() {
		return basicSalary;
	}
	public static void setBasicSalary(double basicSalary) {
		Trainee.basicSalary=basicSalary;
	}
	
	@Override
	public double calculateTransportAllowance() {
		double transportAllowance=10/100 * basicSalary;
		return transportAllowance;
	}

}
