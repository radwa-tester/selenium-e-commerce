package selen.exercises;



import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import Pages.Homepage;
import Pages.Loginpage;
import Pages.Myaccountpage;
import Pages.Userregistrationpage;



public class Myaccounttest extends TestBase {
	Homepage homeobject;
	Userregistrationpage registerobj;
	
	Myaccountpage myaccountobj;
	String oldpassword="12345678";
	String newpassword="123456";
	String firstname="radwa";
	String lastname="khodair";
	String email= "radwyyff@gmail.com";
	public Loginpage loginobject;
	public Loginpage logoutobject;
	
	
	@Test(priority = 1)
	public void usercanregistersuccessfully()
	{
		
		homeobject=new Homepage(driver);
		homeobject.openregistrationpage();
		registerobj=new Userregistrationpage(driver);
		registerobj.userregistration(firstname, lastname, email, oldpassword);
		
	Assert.assertTrue(registerobj.sucessmessage.getText().contains("Your registration completed"));
	
	}
	@Test(priority=2)
	public void Registeredusercanloginfirst()
	{
		
		loginobject=new Loginpage(driver);
	 homeobject.openloginpage();
	 loginobject.userlogin(email, oldpassword);
	 
	 Assert.assertTrue(registerobj.logoutlink.isDisplayed());
	}
	@Test(priority=3)
	public void registeredusercanchangepassword()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		myaccountobj=new Myaccountpage(driver);
		homeobject.openmyaccount();
		myaccountobj.openchangepasswordpage();
		myaccountobj.changepassword(oldpassword, newpassword);
		
		
		Assert.assertTrue(myaccountobj.result.getText().contains("Password was changed"));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test(priority = 4)
	public void registeredusercanlogout() throws InterruptedException
	{
		registerobj.closeresult();
		Thread.sleep(1000);
		registerobj.userlogout();
			}
	//-------------------------------------//
	@Test(priority=5)
	public void Registeredusercanlogin()
	{
		
		loginobject=new Loginpage(driver);
	 homeobject.openloginpage();
	 loginobject.userlogin(email, newpassword);
	 
	 Assert.assertTrue(registerobj.logoutlink.isDisplayed());
	}

}
