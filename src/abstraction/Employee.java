package abstraction;

public class Employee extends Manager implements Department{

	@Override
	public void hRDept() {
		System.out.println("HR Department has 6 employees");
		
	}

	@Override
	public void iTManager() {
		System.out.println("IT manager manages 30 employees");
		
		
	}

	@Override
	public void acctManager() {
		System.out.println("Account Manager manages 5 employees");
		
		
	}

	
}
