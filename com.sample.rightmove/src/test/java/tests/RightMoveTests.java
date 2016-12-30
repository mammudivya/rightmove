package tests;

import org.junit.Assert;
import org.junit.Ignore;
import org.testng.annotations.Test;

import pages.RightMoveAdvertDetailsPage;



public class RightMoveTests extends RightMoveAdvertDetailsPage {
	
	@Test(description="Verify RightMove Home Page is accessible")
	public void verifyRightMoveHomePage(){
		getRightMoveHomePage();
		Assert.assertEquals(HomeTitle,getTitle());
	}
    
	@Test(description="Verify RightMove Search Continue Page is accessible to advanced search")
	public void verifyInitialSearch(){
		getRightMoveHomePage();
		search("Hounslow,Middlesex");
		Assert.assertEquals(searchContinueTitle,getTitle()); 
	}
	
	@Test(description="Verify RightMove advanced search")
	public void verifyAdvanceSearch(){
		getRightMoveHomePage();
		search("Hounslow,Middlesex");
		Assert.assertEquals( searchContinueTitle,getTitle());
		setSearchRadius("Within 3 miles");
		setMinPrice("200,000");
		setMaxPrice("400,000");
		setMinBedRooms("2");
		setMaxBedRooms("3");
		setPropertyType("Houses");
		setAdded("Last 14 days");
		findProperties();	
		Assert.assertEquals(searchResultTitle,getTitle());
	}
	
	@Test(description="Verify RightMove advanced search results and each Advert title displayed and not empty")
	public void verifySearchResultsDisplayed(){
		getRightMoveHomePage();
		search("Hounslow,Middlesex");
		setSearchRadius("Within 3 miles");
		setMinPrice("200,000");
		setMaxPrice("400,000");
		setMinBedRooms("2");
		setMaxBedRooms("3");
		setPropertyType("Houses");
		setAdded("Last 14 days");
		findProperties();
		Assert.assertEquals(searchResultTitle , getTitle());
		Assert.assertEquals(true, searchResultsDisplayed());
		Assert.assertEquals(true, verifyTitleDisplayed());
	}
	
	@Test(description="Verify RightMove Advert Details")
	public void verifyPropertyDetails(){
		getRightMoveHomePage();
		search("Hounslow,Middlesex");
		setSearchRadius("Within 3 miles");
		setMinPrice("200,000");
		setMaxPrice("400,000");
		setMinBedRooms("2");
		setMaxBedRooms("3");
		setPropertyType("Houses");
		setAdded("Last 14 days");
		findProperties();	
		clickFirstAdvert();
		Assert.assertEquals(true, adTitleDisplayed());
		Assert.assertEquals(true, adPriceDisplayed());	
	}
}
