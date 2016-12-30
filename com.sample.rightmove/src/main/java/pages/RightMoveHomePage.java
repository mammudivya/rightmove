package pages;

import org.openqa.selenium.WebElement;

import core.Driver;

abstract class RightMoveHomePage extends Driver{
	
	public static String url = "http://www.rightmove.co.uk/";
	public static String fsearch = "input#searchLocation";
	public static String fsale = "button#buy";
	public static String HomeTitle = "UK's number one property website for properties for sale and to rent";
	
	public  void getRightMoveHomePage(){
		driver.get(url);
		waitForPageToLoad();
	}
	
	public RightMoveSearchContinuePage search(String location){
		WebElement findsearch = driver.findElementByCssSelector(fsearch);
		findsearch.sendKeys(location);
		WebElement forsale = driver.findElementByCssSelector(fsale);
		forsale.click();
		waitForPageToLoad();
		return new RightMoveSearchContinuePage();
	}

}
