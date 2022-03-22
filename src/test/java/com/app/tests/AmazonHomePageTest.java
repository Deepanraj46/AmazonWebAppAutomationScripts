package com.app.tests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.AmazonHomePageObject;

public class AmazonHomePageTest {
	AmazonHomePageObject AmazonHomePage;
	int value=new Random().nextInt(500000);
	public AmazonHomePageTest(){
		AmazonHomePage=new AmazonHomePageObject();
	}
	@Test
	public void verifyAmazonLogin(){
		String Mail="deepansdrvr46@gmail.com";
		String password="deepan7780@";
		Assert.assertTrue(AmazonHomePage.login(Mail,password).contains("Deepan"));
	}
	@Test
	public void verifyProductPage(){
		Assert.assertTrue(AmazonHomePage.SetSearchHomePage().contains("iphone 13"));
	}

}
