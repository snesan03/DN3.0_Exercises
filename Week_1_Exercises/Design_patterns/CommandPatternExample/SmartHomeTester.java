package smarthome;

public class SmartHomeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light lt=new Light();
		RemoteControl rc=new RemoteControl();
		
		rc.setCmd(new LightOnCommand(lt));
		rc.executeCommand();
		
		rc.setCmd(new LightOffCommand(lt));
		rc.executeCommand();
		
	}

}
