package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeProjectObjects extends BasePage{
       @FindBy(xpath="//li/*[@title='Women']")
       private WebElement homePageTitleWomen;
       
       @FindBy(xpath="//*[@id='block_top_menu']/ul/li/*[@title='Dresses']")
       private WebElement homePageTitleDresses;
       
       
       @FindBy(xpath="//*[@id='block_top_menu']/ul/li/*[@title='T-shirts']")
       private WebElement homePageTitleTshirt;
       
       

       @FindBy(xpath="//*[@id='newsletter-input']")
       private WebElement homePageEnterMail;
       
       @FindBy(xpath="//*[@name='submitNewsletter']")
       private WebElement mailButton;
       
       @FindBy(xpath="//*[@class='alert alert-danger']")
       private WebElement alertMsg;
       
       public HomeProjectObjects(){
    	   PageFactory.initElements(driver, this);
       }
       
       public WebElement getHomepageTitles(){
    	   return homePageTitleWomen;
    	   
       }
       
       public WebElement getHomepageTitleDresses(){
    	   return homePageTitleDresses;
    	   
       }
       public WebElement getHomepageTitlesTshirt(){
    	   return homePageTitleTshirt;
    	   
       }
       public String selectTabWomen(){
    	   homePageTitleWomen.click();
    	   return getTitlte();
    	   
       }
       public String selectTabDresses(){
    	  homePageTitleDresses.click();
    	   return getTitlte();
       }
       public String selectTabTshirt(){
    	   homePageTitleTshirt.click();
    	   return getTitlte();
       }
       public void selectMail(String mailId){
    	   setText(homePageEnterMail,mailId);
    	   mailButton.click();
    	   
    	   
       }
       public String getInvalidMsg(){
    	   return alertMsg.getText();
       }
       public void clickDressesTab(){
    	   homePageTitleDresses.click();
       }
}
