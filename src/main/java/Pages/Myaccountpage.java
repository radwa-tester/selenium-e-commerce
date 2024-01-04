package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Myaccountpage extends PageBase {

	public Myaccountpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(linkText="Change password")
	WebElement changepasswordlink;
	@FindBy(id="OldPassword")
	WebElement oldpaawordTxt;
	
	@FindBy(id="NewPassword")
	WebElement NewpasswordTxt;
	
	@FindBy(id="ConfirmNewPassword")
	WebElement confirmNewpasswordTxt;
	@FindBy(css ="button[class*='change-password-button']")
	WebElement changepassbtn;
	@FindBy(css="div.bar-notification.success")
	public WebElement result;
	
	
	
	public void openchangepasswordpage()
	{
		clickbutton(changepasswordlink);
	}
	public void changepassword(String oldpassword,String newpassword)
	{
		SetTextElementText(oldpaawordTxt,oldpassword);
		SetTextElementText(NewpasswordTxt, newpassword);
		SetTextElementText(confirmNewpasswordTxt, newpassword);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		clickbutton(changepassbtn);
		
	}

}
