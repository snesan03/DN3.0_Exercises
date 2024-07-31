package employeemanagement;

public class Employee {
	int employeeId;
	public Employee(int employeeId, String name, String position, double salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", position=" + position + ", salary=" + salary
				+ "]";
	}
	String name;
	String position;
	double salary;
}
