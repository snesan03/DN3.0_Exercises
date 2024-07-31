package employeemanagement;

public class EmployeeManagementTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        ems.addEmployee(new Employee(1, "Alice", "Engineer", 70000));
        ems.addEmployee(new Employee(2, "Bob", "Manager", 80000));
        ems.addEmployee(new Employee(3, "Charlie", "Technician", 60000));

        
        ems.traverseEmployees();

        System.out.println();
        Employee e = ems.searchEmployee(2);
        System.out.println(e != null ? e : "Employee not found");

        System.out.println();
        ems.deleteEmployee(2);
        
        System.out.println();
        ems.traverseEmployees();
	}

}
