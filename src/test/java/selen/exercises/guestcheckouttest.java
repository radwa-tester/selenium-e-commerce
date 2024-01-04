package selen.exercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Loginpage;
import Pages.Searchpage;
import Pages.checkoutpage;
import Pages.productdetailspage;
import Pages.shoppingcartpage;

public class guestcheckouttest extends TestBase {
	
	productdetailspage productdetailsobj;
	shoppingcartpage    shoppingcartobj;
	Searchpage  searchpageobj;
	String productname="Apple MacBook Pro 13-inch";
	Loginpage loginobj;
	checkoutpage checkoutobj;
	String firstname1="jjj";
	String lastname1="ooo";
	String email1="rrr@gmail.com";
	String countryName1="Egypt";
	String city1="alex";
	String address1="nnnnnn";
	String postalcode1="1233";
	String phone1="1252447895";
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
	@Test
	public void checkout()
	{
	shoppingcartobj.checkout();
	loginobj=new Loginpage(driver);
	loginobj.checkasguest();
	
	
	}
	@Test
	public void checkoutdetails() throws InterruptedException
	{
		checkoutobj=new checkoutpage(driver);
		checkoutobj.checkoutproduct(firstname1, lastname1, countryName1, email1, city1, address1, postalcode1, phone1);
		Assert.assertTrue(checkoutobj.Total.getText().contains("$3,600.00"));
		checkoutobj.confirmcheckoutprocess();
		
	}

}
