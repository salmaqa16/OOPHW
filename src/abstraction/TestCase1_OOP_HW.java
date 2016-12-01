package abstraction;

public class TestCase1_OOP_HW {

	public static void main(String[] args) {
		
		Department department = new Employee();
		department.acctDept();
		department.hRDept();
		department.iTDept();
		
		Manager manager = new Employee();
		manager.acctManager();
		manager.iTManager();
		
		
		
		Employee employee = new Employee();
		employee.acctManager();
		employee.hRDept();
		employee.iTManager();
		

	}

}
