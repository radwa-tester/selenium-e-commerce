package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactuspage extends PageBase {

	public contactuspage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(id="FullName")
	WebElement yournametxt;
	@FindBy(id = "Email")
	WebElement youremailtxt;
	@FindBy(id = "Enquiry")
	WebElement enquirytxt;
	@FindBy(name = "send-email")
	WebElement submitbtn;
	@FindBy(css="div[class*='result']")
	public WebElement result;
	public void contactus(String name,String email,String enquiry)
	{
		SetTextElementText(yournametxt,name);
		SetTextElementText(youremailtxt, email);
		SetTextElementText(enquirytxt, enquiry);
		clickbutton(submitbtn);
	}
	
}
