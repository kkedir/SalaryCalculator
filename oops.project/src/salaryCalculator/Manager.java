package salaryCalculator;

public class Manager extends Employee{
	
	public static double getBasicSalary() {
		return basicSalary;
	}
	public static void setBasicSalary(double basicSalary) {
		Manager.basicSalary=basicSalary;
	}
	
	@Override
	public double calculateTransportAllowance() {
		double transportAllowance=15*basicSalary/100;
		return transportAllowance;
	}
}
