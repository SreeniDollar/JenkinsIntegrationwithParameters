package com.tests;

import com.utilities.*;
import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginTest extends BaseClass {
	@Test(dataProvider="getData")
	public void loginuser(String method, String emailid,String password) throws IOException, InterruptedException {
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		System.out.println(method);
		
		homepage.clicksignin();
		Reporter.log("clicked signin", true);
		loginpage.enteremail(emailid);
		loginpage.clickcontinue();
		Thread.sleep(5000);
		loginpage.enterpassword(password);
		loginpage.clicklogin();
		Thread.sleep(5000);
	}

	@DataProvider
	public Object[][] getData() throws IOException {

		Object data[][] = ExcelData.getData("amazon_credentials");
		return data;
	}
}
