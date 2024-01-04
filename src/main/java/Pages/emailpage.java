package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class emailpage extends PageBase {

	public emailpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(id ="FriendEmail")
WebElement friendemailtxt;
@FindBy(id = "YourEmailAddress")
WebElement emailaddress;

@FindBy(id = "PersonalMessage")
WebElement personalmess;

@FindBy(name = "send-email")
WebElement sendemail;
@FindBy(css="div[class*='result']")
public WebElement confmess;
public void emailfriend(String friendemailtxt1,String personalmess1)
{
	SetTextElementText(friendemailtxt, friendemailtxt1);
	SetTextElementText(personalmess, personalmess1);
	clickbutton(sendemail);
}
}
