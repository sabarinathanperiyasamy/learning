package pageobjectmodel;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pomtest {
	
	@FindBy(id = "txtUsername")
	public static WebElement login;
	
	

	@FindBy(id = "txtPassword")
	public static WebElement pass;
	
	
	
	

	@FindBy(name = "Submit")
	public static WebElement sub;
	
	}