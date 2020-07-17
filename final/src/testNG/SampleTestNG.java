package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTestNG {
	 
	long starttime;
	long endtime;
	WebDriver driver;
	
 String a[][] ;	
 String[][] xl;
                    
      @DataProvider(name = "methodname")
      public String [][] logi() throws BiffException, IOException{
    	  
	      a = getExcelData();
	      return a;
	}
      private String[][] getExcelData() throws BiffException, IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\Dell\\Desktop\\book3.xls");
	    Workbook w = Workbook.getWorkbook(f);
	    Sheet s = w.getSheet(0);
	    int c = s.getColumns();
	    int r =s.getRows();
		String b[][] = new String[r-1][c];
	    
	    for (int i=1; i<r; i++) {                                             
	    	for(int j=0; j<c;j++) {
	    		
	    		 b[i-1][j] =  s.getCell(j,i).getContents();
	    	
	    	}
	    }
	   
		return b;
}

  @Test(dataProvider = "methodname")
   public void na(String name , String pass) {
		
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver","D:\\test\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.id("txtUsername")).sendKeys(name);
	    driver.findElement(By.id("txtPassword")).sendKeys(pass);
	    driver.findElement(By.name("Submit")).click();
}
	}
	
	
	/*username_locators = "txtUsername"
password_locators = "txtPassword"
submit_locators = "Submit"*/
	
	