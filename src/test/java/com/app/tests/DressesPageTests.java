package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.DressesPageObject;
import com.app.pages.HomeProjectObjects;

public class DressesPageTests {
	DressesPageObject dressPage;
    HomeProjectObjects homePage;
	public DressesPageTests(){
		dressPage=new DressesPageObject();
		homePage=new HomeProjectObjects();
	}
	
	@Test
	public void verifySizeSTabDisplayed(){
		Assert.assertTrue(dressPage.getSizeSTab().isDisplayed());
		Assert.assertTrue(dressPage.getSizeMTab().isDisplayed());
	    Assert.assertTrue(dressPage.getSizeLTab().isDisplayed());


	}
	
	@Test
	public void verifyProductCount(){
		homePage.clickDressesTab();
		int actual=dressPage.getProductCount();
		int expected=dressPage.getProductCountFromPage();
		Assert.assertTrue(actual==expected,"failed,count not matched");
	}
	
	@Test
	public void verifyAddToCart(){
		Assert.assertTrue(dressPage.getAddToCart().equals(1));
	}
}
