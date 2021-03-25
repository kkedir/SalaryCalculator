package salaryCalculator;

public class InheritanceActivity {

	static Manager manager =new Manager();
	static Trainee trainee=new Trainee();
			
	public static void main(String[] args) {
		 
		testCase1(); // manager salary
		System.out.println(manager.calculateTransportAllowance());
		
		testCase2(); //trainee salary
		System.out.println(trainee.calculateTransportAllowance());

	}
	
	public static void testCase1() {
		manager.setEmployeeId(126534);
		manager.setEmployeeName("Peter");
		manager.setEmployeeAddress("Chennai India");
		manager.setEmployeePhone(237844);
		manager.setBasicSalary(65000);
		manager.calculateSalary();
	}
	
	public static void testCase2() {
		trainee.setEmployeeId(29846);
		trainee.setEmployeeName("Jack");
		trainee.setEmployeeAddress("Mumbai Indai");
		trainee.setEmployeePhone(442085);
		trainee.setBasicSalary(45000);
		trainee.calculateSalary();
	}

}
