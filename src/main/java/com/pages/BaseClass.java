package com.pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	public String channel;
	static Properties properities;
	
	public static void loadData() throws IOException
	{
		properities =new Properties();
		File f=new File(System.getProperty("user.dir")+("./src/main/resources/ConfigProperities/EnvironmentSetUp.properities"));
		FileReader obj=new FileReader(f);
		properities.load(obj);
	}
	
	public static String getObject(String Data) throws IOException{
		loadData();
		String data=properities.getProperty(Data);
		return data;
	}
	
	@Parameters({ "browser", "env" })
	@BeforeMethod
	public void launchbrowser(String browser, String env) throws IOException{

		System.out.println(browser);
		
		if(browser.equalsIgnoreCase("firefox"))
		{
	 
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");
	    driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			
		System.setProperty("webdriver.edge.driver", "./src/main/resources/drivers/msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			
			System.setProperty("webdriver.ie.driver","./src/main/resources/drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		
		}
		
		driver.manage().window().maximize();
	    System.out.println("URL IS :"+env);
	    System.out.println("URL IS :"+getObject(env));
	    
		driver.get(getObject(env));      
		
	 
	}
	
	

}
