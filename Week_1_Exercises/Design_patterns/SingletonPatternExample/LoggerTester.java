package logging;

public class LoggerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Logger logger=Logger.getInstance();
			
			logger.addLog("Initializing the application");
			logger.addLog("Fetching data....");
			logger.addLog("Data Fetching Failed");
			
			System.out.println(logger.getLastLog());
			
			logger.addLog("Attempting to reconnect.....");
			
			System.out.println(logger.getLastLog());
	}

}
