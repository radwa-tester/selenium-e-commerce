package selen.exercises;


import org.testng.Assert;
import org.testng.annotations.Test;



import Pages.Searchpage;
import Pages.productdetailspage;

public class Searchproducttest extends TestBase {
	
	String productName="Apple MacBook Pro 13-inch";
	public Searchpage searchobject;
	public productdetailspage detailsobject;
@Test
public void usersearchforproducts()
{
	searchobject=new Searchpage(driver);
	detailsobject=new productdetailspage(driver);
searchobject.productsearch(productName);
searchobject.openproductdetailspage();
Assert.assertEquals(detailsobject.productnamebreadcrumb.getText(),productName);
	
}
}
