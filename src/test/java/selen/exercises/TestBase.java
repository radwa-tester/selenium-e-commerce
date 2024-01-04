package selen.exercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests {
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
	@AfterSuite
	public void stopDriver()
	{
		driver.quit();
	}
}
