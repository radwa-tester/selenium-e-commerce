package selen.exercises;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.contactuspage;

public class contactustest extends TestBase {
	Homepage homepageobj;
	contactuspage contactusobj;
	public String name="gogo";
	public String email="gogo@gmail.com";
	public String enquiry="gvf bnv cvhgh jhjhjk jhjhjh ";
	@Test
	public void contactus()
	{
		homepageobj=new Homepage(driver);
		contactusobj=new contactuspage(driver);
		homepageobj.opencontactuspage();
		contactusobj.contactus(name, email, enquiry);
		Assert.assertTrue(contactusobj.result.getText().contains("Your enquiry has been successfully sent to the store owner."));
	}

}
