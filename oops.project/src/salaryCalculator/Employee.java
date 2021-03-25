package salaryCalculator;

public class Employee {
	
	static long employeeId;
	static String employeeName;
	static String employeeAddress;
	static long employeePhone;
	static double basicSalary;
	static double specialAllowance=250.80;
	static double hra=1000.50;
	
	public static long getEmployeeId() {
		return employeeId;
	}
	public static void setEmployeeId(long Id) {
		Employee.employeeId=Id;
	}
	
	public static String getEmployeeName() {
		return employeeName;
	}
	public static void setEmployeeName(String Name) {
		Employee.employeeName= Name;
	}
	
	public static String getEmployeeAddress() {
		return employeeAddress;
	}
	public static void setEmployeeAddress(String Address) {
		Employee.employeeAddress=Address;
	}
	
	public static long getEmployeePhone(long Phone) {
		return employeePhone;
	}
	public static void setEmployeePhone(long Phone) {
		Employee.employeePhone=Phone;
	}
	
	public static void calculateSalary() {
		double salary= basicSalary +(basicSalary*specialAllowance/100)+basicSalary*hra/100;
		System.out.println(salary);
	}
	
	public double calculateTransportAllowance() {
		double transportAllowance=10/100*basicSalary;
		return transportAllowance;
	}
}
