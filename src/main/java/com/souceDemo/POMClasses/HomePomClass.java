package com.souceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePomClass
{

	   //POM Class steps
	   //1.WebDriver driver declare
	   //2.ele find by @FindBy Annotation
	   //3.created a method to perform a action on element
	   //4.Constructor create

       //1.driver declared 

         private WebDriver driver;
         private Select s;
         
//      -------------------------
       
          //2FindElement
          @FindBy(xpath="//button[@id='react-burger-menu-btn']")
               WebElement Menubutton;

       //3Createmethod to perform a action
         public void menubutton()
        {
	      Menubutton.click();
         }
//      ------------------------
      
         // findElement logout
         @FindBy(xpath ="//a[@id='logout_sidebar_link']")
               WebElement logout;
  
        public void LogoutClick() 
       {
	      logout.click();
        }
//	   -------------------------
//      Create Constructor  
        public HomePomClass(WebDriver driver)
  	   {
  		this.driver = driver;
  		PageFactory.initElements(driver, this);
 		s= new Select(dropDown);
  	    }

//	------------------------------------------------
	

    	//bag element
    	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    	private WebElement bagButton;
    	
    	public void clickBagButton()
    	{
    		bagButton.click();
    	}
    	
//    ----------------------------------------------------	
        //addToCart element
    	@FindBy(xpath = "//a[@class='shopping_cart_link']")
    	private WebElement addToCart;
    	
    	public String getTextFromAddToCart()
    	{
    		String totalProducts= addToCart.getText();
    		return totalProducts;
    	}

//	---------------------------------------------------------
    	
       	//multiple product elements
    	
    	@FindBy(xpath = "//button[text()='Add to cart']")
    	private List<WebElement> allProducts;
   
//       	public void SelectAllProducts()
//    	{
//    		for(WebElement Addtocart: allProducts) 
//    		{
//    			Addtocart.click();
//    		}
//    	}	
//  ---------------------------------------------  		
    		
//    	public void clickAllProducts()
//    	{
//    		for(int i=0; i<allProducts.size();i++)
//    		{
//    			allProducts.get(i).click();
//    		}

    
    	public void clickAllProducts() 
    	{
          for(WebElement i :allProducts) 
          {
        	  i.click();
          }
    	}
//    ----------------------------------------------	
    	
       
    	//1.sort by /filter option
    	@FindBy(xpath="//select[@class='product_sort_container']")  
    	private WebElement dropDown;
    	
    	public void clickdropDownFilter(int a)
    		{
    		    dropDown.click();
    		    s=new Select(dropDown);            // declare select s globally
    		    s.selectByIndex(a);               // and initialise in constructor
    		}                                     // s = new Select(dropDown)
    		
    	public String textFilter()
    	{
    	    String z=  s.getFirstSelectedOption().getText();
    		return z;
    	}  
          
//    ----------------------------------------------------------      
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
    	

    	}	

