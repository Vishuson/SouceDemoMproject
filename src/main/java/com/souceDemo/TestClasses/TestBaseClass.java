package com.souceDemo.TestClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;


import com.souceDemo.POMClasses.LoginPomClass;
import com.souceDemo.UtilityClass.ScreenshotClass;

public class TestBaseClass 
{
    public WebDriver driver;
    Logger log = Logger.getLogger("SouceDemoProject");
    
     
	@Parameters("browserName")
    @BeforeMethod
    public void setUp(String browserName) throws IOException 
	{  
       
		if(browserName.equals("chrome")) 
       {
    	  System.setProperty("webdriver.chrome.driver",
	            "./DriverFiles\\chromedriver.exe");
	         
	      driver = new ChromeDriver();
	      
       }
       else 
       {
    	   System.setProperty("webdriver.gecko.driver",
   				"./DriverFiles\\geckodriver.exe");
   		
   		   driver = new FirefoxDriver(); 
       }
		
	    PropertyConfigurator.configure("log4j.properties");
		
	
       log.info("browser is open");
	   driver.manage().window().maximize();
	   log.info("browser is maximize");
	   
	   driver.get("https://www.saucedemo.com/");
	   log.info("opening the soucedemo homepage");
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       //Takes Screenshot
        ScreenshotClass.takeScreenshot(driver);
	
	
       //loginpage
        LoginPomClass x = new LoginPomClass(driver);
		
		x.sendusername();
		log.info("username is entered");
		
		x.SendPassword();
		log.info("Password is entered");
		
		x.ClickOnLoginButton();
		log.info("Clicked on login button");
		
        
		 
		ScreenshotClass.takeScreenshot(driver);
		
   	}
//-----------------------------------------------------   
        
		@AfterMethod
        public void tearDown()
        {  driver.quit();
	       log.info("browser is closed");
	       
	       log.info("end of Program");	
	     }
//-----------------------------------------------------
	
	  
	
	    
	
	
	
	
	
	
	
}
