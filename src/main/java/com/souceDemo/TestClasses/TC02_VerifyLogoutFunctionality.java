package com.souceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.souceDemo.POMClasses.HomePomClass;

public class TC02_VerifyLogoutFunctionality extends TestBaseClass
{  
	
   @Test
   public void VerifyLogoutFunctionality() 
   {
	   
       // after login then homepage to logout
        
       HomePomClass y = new HomePomClass(driver);
       y.menubutton();
       y.LogoutClick();
            
//     -------------------
       
       //validation	
       log.info("apply the validation");
		
	   String expectedTitle = "Swag Labs";    //dev/BA
		
	   String actualTitle = driver.getTitle();
	   
	   Assert.assertEquals(actualTitle, expectedTitle);
	
	       	
     }	
}
//------------------------------------------------



//       if(expectedTitle.equals(actualTitle))
//      {
//	   System.out.println("logOut functionality test case is passed");
//       }
//       else
//      {
//	   System.out.println("logOut functionality test case is failed");
//      }