package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AmazonHomePageObject extends BasePage{
	
	@FindBy(xpath="//*[@id='nav-link-accountList']")
	private WebElement GoToLoginPage;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement HomePageSearchTextBox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement HomePageSearchButton;
	
	@FindBy(xpath="//*[@id='ap_email']")
	private WebElement EmailTextBox;
	
	@FindBy(xpath="//*[@id='continue']")
	private WebElement ContinueButton;
	
	@FindBy(xpath="//*[@id='ap_password']")
	private WebElement PasswordTxtBox;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement ButtonSignIn;
	
	@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']")
	private WebElement AmazonHomePageTxt;
	
	
	public AmazonHomePageObject(){
		PageFactory.initElements(driver, this);
	}
	public String login(String Mail,String password){
		GoToLoginPage.click();
		EmailTextBox.sendKeys(Mail);
		ContinueButton.click();
		PasswordTxtBox.sendKeys(password);
		ButtonSignIn.click();
		return getTxtAttribute(AmazonHomePageTxt);
	}
	public String SetSearchHomePage(){
		HomePageSearchTextBox.sendKeys("iphone 13");
		HomePageSearchButton.click();
		return getTitlte();
	}

}
