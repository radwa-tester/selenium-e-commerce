package selen.exercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.Searchpage;
import Pages.productdetailspage;

public class changecurrencytest extends TestBase {
	 Homepage homepageobj;
	Searchpage searchpageobj;
	productdetailspage productdetailobj;
	String productname="Apple MacBook Pro 13-inch";
	@Test
	public void changecurrency() throws InterruptedException
	{
		homepageobj=new Homepage(driver);
		searchpageobj=new Searchpage(driver);
		productdetailobj=new productdetailspage(driver);
		homepageobj.changecurrency();
		searchpageobj.productsearchautosuggest(productname);
		Thread.sleep(2000);
		Assert.assertTrue(productdetailobj.productpricelabel.getText().contains("€"));
	}

}
