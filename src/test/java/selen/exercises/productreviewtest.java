package selen.exercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Searchpage;
import Pages.Userregistrationpage;
import Pages.emailpage;
import Pages.productdetailspage;
import Pages.productreviewpage;

public class productreviewtest extends TestBase {
	Homepage homeobject;
	Userregistrationpage registerobj;
	emailpage emailobj;
	Searchpage searchobj;
	productdetailspage productobj;
	String friendemail="rrr5@gmail.com";
	String personalmess="gghgh ghghjg gfghfh";
	String password="12345678";
	
	String firstname="radwa";
	String lastname="khodair";
	String email= "radwyyfgggg@gmail.com";
	String product="apple Mac";
	public Loginpage loginobject;
	public productreviewpage productreviewobj;
	public String  reviewtitle ="title";
	public String Reviewtxt="text";
	
	

	@Test(priority = 1)
	public void usercanregistersuccessfully()
	{
		
		homeobject=new Homepage(driver);
		homeobject.openregistrationpage();
		registerobj=new Userregistrationpage(driver);
		registerobj.userregistration(firstname, lastname, email, password);
		
	Assert.assertTrue(registerobj.sucessmessage.getText().contains("Your registration completed"));
	
	}
	@Test(priority=2)
	public void Registeredusercanloginfirst()
	{
		
		loginobject=new Loginpage(driver);
	 homeobject.openloginpage();
	 loginobject.userlogin(email, password);
	 
	 Assert.assertTrue(registerobj.logoutlink.isDisplayed());
	}
	@Test(priority = 3)
	public void searchproduct() throws InterruptedException
	{
		searchobj=new Searchpage(driver);
		searchobj.productsearchautosuggest(product);
		//productobj=new productdetailspage(driver);
		Thread.sleep(2000);
		
		
		
	}
	@Test(priority=4)
	public void productreview()
	{
		productobj=new productdetailspage(driver);
		productobj.addreviewpage();
		productreviewobj=new productreviewpage(driver);
		productreviewobj.addreview(reviewtitle, Reviewtxt);
		Assert.assertTrue(productreviewobj.result.getText().contains("Product review is successfully added."));
	}
}
