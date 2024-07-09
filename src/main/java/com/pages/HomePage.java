package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	
    
	@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']")
	private WebElement signin;
	
	
	@FindBy(css="a[id='nav-cart']")
	private WebElement cart;
	
	public HomePage(WebDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
}
	
	public void clicksignin()
	{
		signin.click();
	}

	public void clickcart()
	{
		cart.click();
	}

	
}
