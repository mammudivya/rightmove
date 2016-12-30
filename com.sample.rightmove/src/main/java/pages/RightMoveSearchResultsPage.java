package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.Element;



public class RightMoveSearchResultsPage extends RightMoveSearchContinuePage {
	
	public String searchResults = "div#l-searchResults";
	public String advertTitlesList = "div#l-searchResults h2";
	public String advert = "div.propertyCard-section";
	public String searchResultTitle = "Houses For Sale in Hounslow, Middlesex - Rightmove";
	
	public Boolean searchResultsDisplayed(){
		WebElement searchRes = driver.findElementByCssSelector(searchResults);
		return searchRes.isDisplayed();
	}
	
	public List<WebElement> getAllAdverts(){
		List<WebElement> ads = driver.findElementsByCssSelector(advertTitlesList);
		return ads;
	}
	
	public RightMoveAdvertDetailsPage clickFirstAdvert(){
		WebElement firstAd = driver.findElementByCssSelector(advert);
		firstAd.click();
		waitForPageToLoad();
		return new RightMoveAdvertDetailsPage();
	}
	
	public Boolean verifyTitleDisplayed(){
		List<WebElement> ads = getAllAdverts();
		try {for(WebElement element : ads){
			return true;}
				 }
		catch (Exception e){
		e.getMessage();
			}
			return false;
		}
}
