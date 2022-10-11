package com.souceDemo.TestClasses;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{   
		
	   @Test
	   public void VerifyLoginFunctionality()throws IOException 
	   {

//	       Validation
	
		  //--homePage--
		   log.info("apply the validation");
			
		   String expectedTitle = "Swag Labs";    
			
		   String actualTitle = driver.getTitle();
		   
		   Assert.assertEquals(actualTitle, expectedTitle);
		   
		
	   }
   }	
	
//           if(expectedTitle.equals(actualTitle))
//         {
//	        System.out.println("login functionality test case is passed");
//          }
//           else
//         {
//	       System.out.println("login functionality test case is failed");
//         }
           
           
           