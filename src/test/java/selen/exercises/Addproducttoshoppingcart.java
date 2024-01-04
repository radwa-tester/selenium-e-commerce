package selen.exercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Searchpage;
import Pages.productdetailspage;
import Pages.shoppingcartpage;

public class Addproducttoshoppingcart extends TestBase {
	
	productdetailspage productdetailsobj;
	shoppingcartpage    shoppingcartobj;
	Searchpage  searchpageobj;
	String productname="Apple MacBook Pro 13-inch";
	
	@Test
	public void addproducttoshoppingcart() throws InterruptedException
	{
	
    productdetailsobj =new productdetailspage(driver);
    shoppingcartobj=new shoppingcartpage(driver);
    searchpageobj=new Searchpage(driver);
    searchpageobj.productsearchautosuggest(productname);
    productdetailsobj.addproducttocart();
    Thread.sleep(5000);
    productdetailsobj.gotoshoppingcart();
    Thread.sleep(3000);
    Assert.assertTrue(shoppingcartobj.Total.getText().contains("$3,600.00"));
    
	}
}
