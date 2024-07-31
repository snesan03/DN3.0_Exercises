package studentmanagement;

public class StudentController {
	Student model;
	StudentView view;
	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	 public void setStudentName(String name) {
	        model.setName(name);
	    }

	    public String getStudentName() {
	        return model.getName();
	    }

	    public void setStudentId(int id) {
	        model.setId(id);
	    }

	    public int getStudentId() {
	        return model.getId();
	    }

	    public void setStudentGrade(double grade) {
	        model.setGrade(grade);
	    }

	    public double getStudentGrade() {
	        return model.getGrade();
	    }

	    public void updateView() {
	        view.displayStudentDetails(model.getName(), model.getId(), model.getGrade());
	    }
}
