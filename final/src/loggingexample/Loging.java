package loggingexample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Loging {
	
	static Logger logi = Logger.getLogger(Loging.class);

	public static void main(String[] args) {
	
		PropertyConfigurator.configure("log4j.properties");
		logi.debug("hai");
		logi.fatal("hello");
		
		
		

	}

}
