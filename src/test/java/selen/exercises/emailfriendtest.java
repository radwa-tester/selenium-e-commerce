package selen.exercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Searchpage;
import Pages.Userregistrationpage;
import Pages.emailpage;
import Pages.productdetailspage;

public class emailfriendtest extends TestBase {
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
	String email= "radwyyffj568@gmail.com";
	String product="apple Mac";
	public Loginpage loginobject;
	

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
	@Test(priority = 4)
	public void emailfriend() throws InterruptedException
	{
		
		productobj=new productdetailspage(driver);
		
		productobj.opensendemail();
		emailobj=new emailpage(driver);
		
        emailobj.emailfriend("rrr5@gmail.com", personalmess);
        Thread.sleep(2000);
        Assert.assertTrue(emailobj.confmess.getText().contains("Your message has been sent."));
	}

}
