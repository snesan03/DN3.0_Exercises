package logging;

import java.util.*;

public class Logger {
	private static Logger logger=new Logger();
	
	List<String> messages=new ArrayList<>();
	
	private Logger() {
//		 System.out.println("private constructor executed");
	}
	
	public static Logger getInstance() {
		return logger;
	}
	
	 void addLog(String message) {
		messages.add(message);
	}
	
	 String getLastLog(){
		return messages.getLast();
	}
}
