package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.app.pages.HomeProjectObjects;

public class HomePageTest {
	HomeProjectObjects homeProject;
	int a=1;
	public HomePageTest(){
		homeProject =new HomeProjectObjects();
	}
	
	@Test
	public void verifyTitles(){
		Assert.assertTrue(homeProject.getHomepageTitles().isDisplayed());
	
		Assert.assertTrue(homeProject.getHomepageTitleDresses().isDisplayed());
	
		Assert.assertTrue(homeProject.getHomepageTitlesTshirt().isDisplayed());
	}
	
	@Test
	public void verifyTabNavigated(){
		Assert.assertTrue(homeProject.selectTabWomen().contains("Women"), "not navigated to Women tab");
		Assert.assertTrue(homeProject.selectTabDresses().contains("Dresses"), "not navigated to Women tab");
	    Assert.assertTrue(homeProject.selectTabTshirt().contains("T-shirt"), "not navigated to Women tab");

	}
    @Test
    public void verifyMailAddress(){
    	homeProject.selectMail("deepansdrvr46@gmail.com");
    	String invalidMsg=homeProject.getInvalidMsg();
    	Assert.assertTrue(invalidMsg.contains("Newsletter"));
    	
    }
}
