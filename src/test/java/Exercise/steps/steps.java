package Exercise.steps;

import org.testng.Assert;
import Pages.Homepage;
import Pages.Userregistrationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import selen.exercises.TestBase;

public class steps extends TestBase  {
	
		
		Userregistrationpage registerobj;
		Homepage homeobj;
	@Given("user in homepage")

	public void user_in_homepage() {
		
	
		homeobj=new Homepage(driver);
		homeobj.openregistrationpage();
		
		
	}
	
	@When("user click on register")
	public void user_click_on_register()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
		
	}
	
	/*@When("user entered userdata")
	
	public void user_entered_userdata()
	{
		registerobj=new Userregistrationpage(driver);
		registerobj.userregistration("ggg", "yyy","ggg@gmail.com","12345678");
		
		
	}*/
	@When("user entered \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void i_entered(String firstname, String lastname, String email, String password) {
		registerobj = new Userregistrationpage(driver); 
		registerobj.userregistration(firstname, lastname,email,password);
	}

	
	@Then("user is now registered successfully")
	public void user_is_now_registered_successfully()
	{
		Assert.assertTrue(registerobj.sucessmessage.getText().contains("Your registration completed"));
		
	}
	
	
	}


