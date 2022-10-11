package com.souceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.souceDemo.POMClasses.HomePomClass;

public class TC04_VerifyAllProductFunctionality extends TestBaseClass 
{
    @Test
	public void VerifyAllProductFunctionality()  
  {
	
	  
	 HomePomClass hp = new HomePomClass(driver);
	 hp.clickAllProducts();
	 log.info("All products will get selected");
//--------------------------------------------------------------		
		//--validation--//
		String exceptedProduct = "6";
		
		String actualProduct = hp.getTextFromAddToCart();
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		
		Assert.assertEquals(actualProduct, exceptedProduct);
	
  }	
}
//--------------------------------------------------

//   if(exceptedProduct.equals(actualProduct))
//  {
//	System.out.println("All products add to cart case is passed");
//  }
//   else
//  {
//	System.out.println("All products add to cart case is failed");
//  }












