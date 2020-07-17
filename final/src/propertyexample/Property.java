package propertyexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Property {
	
	

	public static void main(String[] args) throws IOException {
		
		WebDriver driver ;
		FileInputStream fs = new FileInputStream("config.properties");
		Properties p = new Properties();
	    p.load(fs);
				
		String location = p.getProperty("driverlocation");
		
				
		
		System.setProperty("webdriver.gecko.driver",location);
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
		

	}

}
