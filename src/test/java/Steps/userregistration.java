package Steps;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import Pages.Homepage;
import Pages.Loginpage;
import Pages.Userregistrationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import selen.exercises.TestBase;

public class userregistration extends AbstractTestNGCucumberTests {
	public static WebDriver driver;
	public static String downloadpath=System.getProperty("user.dir")+"\\downloads";
	@BeforeSuite
	//@Parameters({"browser"})
	public void startDriver(@Optional("chrome")String browserName)
	
	{
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Resource\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Resource\\chromedriver.exe");
			driver=new FirefoxDriver();
			
		}
	
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
}
	@Test
	public class UserRegistration  {
	Homepage homeobj;
	Userregistrationpage registerobj;
	public Loginpage loginobject;
	@Given("user in homepage")

	public void user_in_homepage() {
		homeobj=new Homepage(driver);
		homeobj.openregistrationpage();
		
	}
	
	@When("user click on register")
	public void user_click_on_register()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("register?returnUrl=%2F"));
	}
	@Test
	@When("user entered userdata")
	public void user_entered_userdata()
	{
		registerobj=new Userregistrationpage(driver);
		registerobj.userregistration("ggg", "yyy","ggg@gmail.com","12345678");
		
	}
	
	@Then("user is now registered successfully")
	public void user_is_now_registered_successfully()
	{
		registerobj.userlogout();
	}
	@AfterSuite
	public void stopDriver()
	{
		driver.quit();
	}

}
}
