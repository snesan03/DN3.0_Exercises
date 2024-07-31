package taskmanager;

public class Task {
	private int taskId;
    private String taskName;
    private String status;
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", status=" + status + "]";
	}
	public Task(int taskId, String taskName, String status) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.status = status;
	}
    
}
