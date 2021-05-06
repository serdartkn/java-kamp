package nLayeredDemo.core.concretes;

import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.jLogger.jLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		jLoggerManager jLoggerManager = new jLoggerManager();
		jLoggerManager.log("J Logger Ýle Loglandý");
		
	}
	

}
