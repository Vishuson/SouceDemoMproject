package com.souceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.souceDemo.POMClasses.HomePomClass;

public class TC05_VerifyWhetherWeAreAbleToApplyFilter extends TestBaseClass
{   
	 @Test
	 public void VerifyapplyFilter() 
	 {     
	     // click on filter
	      
	       HomePomClass y = new HomePomClass(driver); 
	       
	       y.clickdropDownFilter(2);
	       String given="Price (low to high)";
	       String actual=y.textFilter();
	       System.out.println("Actual---->"+actual);
	     
	       Assert.assertEquals(actual, given);
	       
       	}  
	 }   
//------------------------------------------------------------	       
	 //	   	if(given.equals(actual))
//       	{
//       	 System.out.println
//       	 ("the Iteam are Filter on the base of Price (low to high)");
//       	 System.out.println
//       	 ("The test case is passed");
//       	}
//       	else
//       	{
//       		System.out.println
//       		("the Iteam are NOT Filter on the base of Price (low to high)");
//       		System.out.println
//       		("The test case is Failed");       
	       
	       
  



















