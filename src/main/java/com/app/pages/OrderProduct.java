package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderProduct extends BasePage{
	@FindBy(id="short_description_content")
	private WebElement textProductPage;
    
	public OrderProduct() {
		PageFactory.initElements(driver, this);
		
	}

	
	public int CountTextDescription(){
		
		return textProductPage.getText().length();
		
	}
}
