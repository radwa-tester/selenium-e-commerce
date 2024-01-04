package selen.exercises;


import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Homepage;

public class producthovermenutest extends TestBase {
	Homepage homeobject;
	@Test
	public void usercanselectsubcategoryfrommainmenu() throws InterruptedException
	{
		homeobject=new Homepage(driver);
		
		homeobject.selectnotebooksmenu();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
	}


}
