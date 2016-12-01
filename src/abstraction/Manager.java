package abstraction;

public abstract class Manager implements Department{

	
	public void iTDept(){
		System.out.println("IT Department has 30 employees");

	}
	
	public void acctDept(){
		System.out.println("Account Department has 5 employees");
	}
	
	public abstract void iTManager();
	public abstract void acctManager();
	
}
