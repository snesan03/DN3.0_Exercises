package taskmanager;

public class TaskManagementTester {
	public static void main(String[] args) {
		TaskManagementSystem tms = new TaskManagementSystem();

        tms.addTask(new Task(1, "Design Database", "Pending"));
        tms.addTask(new Task(2, "Implement API", "In Progress"));
        tms.addTask(new Task(3, "Test Application", "Completed"));

        System.out.println();
        tms.traverseTasks();

        System.out.println();
        Task t = tms.searchTask(2);
        System.out.println(t != null ? t : "Task not found");

        System.out.println();
        tms.deleteTask(2);

        System.out.println();
        tms.traverseTasks();
	}
}
