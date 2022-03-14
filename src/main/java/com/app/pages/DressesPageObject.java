package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
public class DressesPageObject extends BasePage {
	@FindBy(xpath="//*[@class='layered_filter'][2]/ul/li[1]")
	private WebElement sizeSTab;
	
	@FindBy(xpath="//*[@class='layered_filter'][2]/ul/li[2]")
	private WebElement sizeMTab;
	
	@FindBy(xpath="//*[@class='layered_filter'][2]/ul/li[3]")
	private WebElement sizeLTab;
	
	@FindBy(xpath="//*[@class='heading-counter']")
	private WebElement textHeaderProductCount;
	
	@FindBys(@FindBy(xpath="//*[@class='product_list grid row']/li"))
	private List<WebElement> lstProducts;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[1]")
	private WebElement firstproduct;
	
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/span")
	private WebElement closeButton;
	@FindBy(xpath="//*[@class='product_list grid row']/li[1]//*[@class='button-container']/a[1]")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//*[@id='header']/div[3]/div/div/div[3]/div/a/span[1]")
	private WebElement noOfSelectedProduct;
	
	public DressesPageObject(){
		PageFactory.initElements(driver, this);
	}
	
	public int getProductCount(){
		return Integer.parseInt(textHeaderProductCount.getText().split(" ")[2]);
	}
	public int getProductCountFromPage(){
		return lstProducts.size();
	}
	
	public WebElement getSizeSTab(){
		return sizeSTab;
	}

	public WebElement getSizeMTab(){
		return sizeMTab;
	}
	
	public WebElement getSizeLTab(){
		return sizeLTab;
	}
	
	
	
	public  String getAddToCart(){
		
		Mouseover(firstproduct);
		addToCartButton.click();
		Mouseover(closeButton);
		//closeButton.click();
		return noOfSelectedProduct.getText();
	}
}
