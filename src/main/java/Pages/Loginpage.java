package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends PageBase {

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="Email")
	WebElement EmailTxtBox;
	
	@FindBy(id="Password")
	WebElement passwordTxtBox;
	
	@FindBy(linkText="log out")
	WebElement logoutbtn;
	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement loginBtn;
	@FindBy(css="button[class*='checkout-as-guest-button']")
	WebElement checkasguest;
	
	
	public void userlogin(String email,String password) {
		SetTextElementText(EmailTxtBox, email);
		SetTextElementText(passwordTxtBox, password);
		clickbutton(loginBtn);
		
		
		
		
	}
	
	public void checkasguest()
	{
		clickbutton(checkasguest);
	}

}
