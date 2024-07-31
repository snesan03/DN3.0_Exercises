package stockEvent;

public class MobileApp implements Observer{
	String userName;
	public MobileApp(String userName) {
		super();
		this.userName = userName;
	}
	@Override
	public void update(double stockPrice) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello "+userName+" the stock price is changed to "+stockPrice);
	}
	
}
