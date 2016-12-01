package encapsulation;

public class Employee_Info {
	
	private int employeeID;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeDepartment;
	
	public int getEmployeeId(){
		return employeeID;
	}
	
	public void setEmployeeId(int employeeID){
		this.employeeID = employeeID;
	}
	
	public String getEmployeeFirstName(){
		return employeeFirstName;
	}
	
	public void setEmployeeFirstName(String employeeFirstName){
		this.employeeFirstName = employeeFirstName;
	}
	
	public String getEmployeeLastName(){
		return employeeLastName;
	}
	
	public void setEmployeeLastName(String employeeLastName){
		this.employeeLastName= employeeLastName;
	}
	
	public String getEmployeeDepartment(){
		return employeeDepartment;
	}
	
	public void setEmployeeDepartment(String employeeDepartment){
		this.employeeDepartment = employeeDepartment;
	}
	
	
	
	

}
