package studentmanagement;

public class StudentTester {
	public static void main(String[] args) {
		Student s=new Student("Siva",101,6);
		StudentView sv=new StudentView();
		StudentController sc=new StudentController(s, sv);
		sc.setStudentName("Sridhar");
//		sc.updateView();
		sc.setStudentGrade(10);
		sc.setStudentId(6);
		sc.updateView();
	}
	
}
