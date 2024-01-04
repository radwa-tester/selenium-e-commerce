package selen.exercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Searchpage;
import Pages.compareproductpage;
import Pages.productdetailspage;

public class compareproducttest extends TestBase {
	productdetailspage productdetailsobj;
	Searchpage  searchpageobj;
	String productone="Asus N551JK-XO076H Laptop";
    String producttwo="Apple MacBook Pro 13-inch";
    compareproductpage compareobj;
@Test
public void compareproduct() throws InterruptedException
{
	productdetailsobj =new productdetailspage(driver);
	searchpageobj=new Searchpage(driver);
	compareobj=new compareproductpage(driver);
	searchpageobj.productsearchautosuggest(productone);
	productdetailsobj.addproducttocomparelist();
	Thread.sleep(3000);
	searchpageobj.productsearchautosuggest(producttwo);
	productdetailsobj.addproducttocomparelist();
	Thread.sleep(3000);
	productdetailsobj.gotocomparepage();
	Thread.sleep(3000);
	Assert.assertTrue(compareobj.firstname.getText().contains(productone));
	Assert.assertTrue(compareobj.secondname.getText().contains(producttwo));
}
}
