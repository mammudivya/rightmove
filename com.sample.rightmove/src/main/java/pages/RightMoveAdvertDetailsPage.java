package pages;

import org.openqa.selenium.WebElement;

public class RightMoveAdvertDetailsPage extends RightMoveSearchResultsPage {
	
	public String price= "p#propertyHeaderPrice";
	public String title = "h1.fs-22";
	

	public Boolean adPriceDisplayed(){
		WebElement priceoffer = driver.findElementByCssSelector(price);
		return  priceoffer.isDisplayed();
	}
	
	public Boolean adTitleDisplayed(){
		WebElement advertitle = driver.findElementByCssSelector(title);
		return advertitle.isDisplayed();	
	}

}
