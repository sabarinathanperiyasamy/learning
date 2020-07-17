package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pomclass {
	WebDriver driver;

@Test
public void mainfunc() {
		
		System.setProperty("webdriver.gecko.driver","D:\\test\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    PageFactory.initElements(driver,Pomtest.class );
	    
		Pomtest.login.sendKeys("admin");
		Pomtest.pass.sendKeys("admin123");
		Pomtest.sub.click();
}
	
	
}
/* driver.findElement(By.id("txtUsername")).sendKeys(name);
driver.findElement(By.id("txtPassword")).sendKeys(pass);
driver.findElement(By.name("Submit")).click();*/