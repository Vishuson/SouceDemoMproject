package com.souceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.souceDemo.POMClasses.HomePomClass;

public class TC03_VerifyBagAddToCartFunctionality extends TestBaseClass  
{
    @Test
	public void VerifyBagAddToCartFunctionality() 
	{
	   
	
//	   homepage
       HomePomClass y = new HomePomClass(driver);
       
       y.clickBagButton();
       log.info("bag product will selected");
       
    	  
       //--validation--//
     		
       String exceptedProduct = "1";
     		
       String actualProduct = y.getTextFromAddToCart();
      
       System.out.println("actual product->"+actualProduct);
     		
       System.out.println("apply validation");
   
	   Assert.assertEquals(actualProduct, exceptedProduct); 
	
	}	
}

//-----------------------------------------------------


//   if(exceptedProduct.equals(actualProduct))
//	{
//	  System.out.println("Bag product add to cart case is passed");
//	}
//	else
//	{
//	 System.out.println("Bag product add to cart case is failed");
//	}








