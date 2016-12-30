package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Driver {
	
	protected FirefoxDriver driver;
	
	@BeforeMethod
	public void start(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public void waitForPageToLoad(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	
	@AfterMethod
	public void quit(){
		driver.quit();
	}

}
