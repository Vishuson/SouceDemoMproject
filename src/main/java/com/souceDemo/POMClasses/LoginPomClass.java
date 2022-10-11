package com.souceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomClass 
{
	
//	    1.WebDriver declared
		WebDriver driver;
		
		
//		2.FindElement
		@FindBy(xpath="//input[@id='user-name']")
		WebElement username;
		
		
//		3.create a method as per action on element 
		//and add action in that method

		public void sendusername() 
		{
			username.sendKeys("standard_user");
		}
	   
//		-------------
		
//	    2.find element password
	    
		@FindBy(xpath="//input[@id='password']")
		WebElement Password;
		
		
		public void SendPassword() 
		{
			Password.sendKeys("secret_sauce");
		}
	
//	    ----------------
	
//	    3.FindElement loginButton
	    
	    @FindBy(xpath = "//input[@id='login-button']")
	    WebElement LoginButton;
	    
	    public void ClickOnLoginButton() 
	    {
	    	LoginButton.click();
	    }
	
//	      ---------------------
	
//	    4.CreateConstructor
	    
	    public LoginPomClass(WebDriver driver) 
	    {
	    	this.driver = driver;
	    	
	    	// Global      local variables
	    	
	    	PageFactory.initElements(driver, this);
	    	// selenium Class
	    }
	
	
	    //POM Class steps
		//1.WebDriver driver declare
		//2.element  find by @FindBy Annotation
		//3.created a method to perform a action on element
		//4.Constructor create
	  
	
	
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	 

}
  