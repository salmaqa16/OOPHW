package encapsulation;

public class TestCase1_Employee_Info_Encapsulation {

	public static void main(String[] args) {
		
		Employee_Info employee_info = new Employee_Info();
		employee_info.setEmployeeId(101);
		employee_info.setEmployeeFirstName("John");
		employee_info.setEmployeeLastName("Doe");
		employee_info.setEmployeeDepartment("IT");
		
		System.out.println("Employee's Id:" + employee_info.getEmployeeId()+ " " + "Employee's First Name:"+ employee_info.getEmployeeFirstName()
		+ " "+ "Employee's Last Name" + employee_info.getEmployeeLastName()+" "+ "And Employee's Department Name" + employee_info.getEmployeeDepartment());
		
		
		}

}
