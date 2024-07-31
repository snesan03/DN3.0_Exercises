package smarthome;

public class RemoteControl {
	Command cmd;
	
	
	public void setCmd(Command cmd) {
		this.cmd = cmd;
	}


	public void executeCommand() {
		cmd.execute();
	}
}
