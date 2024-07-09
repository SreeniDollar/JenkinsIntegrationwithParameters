package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
    
	@FindBy(xpath="//*[@class='a-button-input']")
	private WebElement btncontinue;
	
	
	@FindBy(xpath="//*[@class='a-input-text' and @type='email']")
	private WebElement txtemail;
	
	
	@FindBy(css="a[id='createAccountSubmit']")
	private WebElement btncreateaccount;
	
	@FindBy(css="input[id='ap_password']")
	private WebElement txtpassword;
	
	
	@FindBy(css="input[id='signInSubmit']")
	private WebElement btnlogin;
	
	@FindBy(css="input[id='continue']")
	private WebElement btnloginwithotp;
	
	
	
	public LoginPage(WebDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
}
	
	public void enteremail(String emailid)
	{
		txtemail.clear();
		txtemail.sendKeys(emailid);
	}

	public void clickcontinue()
	{
		btncontinue.click();
	}

	public void clickcreateaccount()
	{
		btncreateaccount.click();
	}

	public void enterpassword(String password)
	{
		txtpassword.clear();
		txtpassword.sendKeys(password);
	}

	public void clicklogin()
	{
		btnlogin.click();
	}
	
	public void clickloginwithotp()
	{
		btnloginwithotp.click();
	}
}
