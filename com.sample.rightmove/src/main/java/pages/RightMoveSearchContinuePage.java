package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RightMoveSearchContinuePage extends RightMoveHomePage {
	
	//Selectors in SearchContinue Page
	public static String radius = "select#radius";
	public static String price = "select#minPrice";
	public static String mprice = "select#maxPrice";
	public static String minbed = "select#minBedrooms";
	public static String maxbed = "select#maxBedrooms";
	public static String property = "select#displayPropertyType";
	public static String site = "select#maxDaysSinceAdded";
	public static String button = "button#submit";
	public static String searchContinueTitle = "Find property for sale in Hounslow, Middlesex";
	
	public RightMoveSearchResultsPage findProperties(){
		WebElement findbutton = driver.findElementByCssSelector(button);
		findbutton.submit();
		waitForPageToLoad();
		return new RightMoveSearchResultsPage();
	}
	
	public void setSearchRadius(String radiusInMiles){
		Select searchradius = new Select(driver.findElementByCssSelector(radius));
			searchradius.selectByVisibleText(radiusInMiles);
	}
	
	public void setMinPrice(String minimumprice){
		Select minprice = new Select(driver.findElementByCssSelector(price));
		minprice.selectByVisibleText(minimumprice);	
	}
	
	 public void setMaxPrice(String maximumprice){
		 Select maxprice = new Select(driver.findElementByCssSelector(mprice));
			maxprice.selectByVisibleText(maximumprice);
	 }
	 
	 public void setMinBedRooms(String minimumbedrooms){
		 Select minbedrooms = new Select(driver.findElementByCssSelector(minbed));
			minbedrooms.selectByVisibleText(minimumbedrooms); 
	 }
	 
	 public void setMaxBedRooms(String maximumbedrooms){
		 Select maxbedrooms = new Select(driver.findElementByCssSelector(maxbed));
			maxbedrooms.selectByVisibleText(maximumbedrooms);	 
	 }
	 
	 public void setPropertyType(String propertyTypes){
		 Select propertytype = new Select(driver.findElementByCssSelector(property));
			propertytype.selectByVisibleText(propertyTypes);	 
	 }
	 
	 public void setAdded(String addedtotype){
		 Select addedtosite= new Select(driver.findElementByCssSelector(site));
			addedtosite.selectByVisibleText(addedtotype);	 
	 }

}
