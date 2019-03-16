package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base2 {
	
	public WebDriver driver;
	@BeforeTest(alwaysRun=true)
	public void beforeTest() 
	{
		driver=BrowserSetup.browserStart("chrome");
		//driver.get("https://www.google.com/");
	}

	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}
}
