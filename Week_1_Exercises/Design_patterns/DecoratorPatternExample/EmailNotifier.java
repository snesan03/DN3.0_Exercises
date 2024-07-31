package notifier;

public class EmailNotifier implements Notifier{

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Notification of "+msg+" is sent to email");
	}

}
