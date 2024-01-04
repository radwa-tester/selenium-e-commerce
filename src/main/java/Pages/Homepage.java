package Pages;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;





public class Homepage extends PageBase {

	public Homepage(WebDriver driver) {
		super(driver);
		js=(JavascriptExecutor) driver;
				actions =new Actions(driver)  ;
		
	}
@FindBy(linkText ="Register")
WebElement registerlink;
@FindBy(linkText ="Log in")
WebElement LoginLink;
@FindBy(linkText = "Contact us")
WebElement Contactuslink;
@FindBy(id ="customerCurrency")
WebElement currencydropdown;
//@FindBy(css="ul[class*='notmobile']")
//List<WebElement> topMenu;
@FindBy(linkText = "Computers ")
public WebElement computers;



@FindBy(linkText="Notebooks")
public WebElement NotebooksMenu;
@FindBy(linkText="My account")
WebElement Myaccountbtn;
public void openregistrationpage()
{
	
	clickbutton(registerlink);
}
public void openloginpage()
{
	clickbutton(LoginLink);
}
public void opencontactuspage()
{
	//scrollToBottom();
	clickbutton(Contactuslink);
}
public void changecurrency()
{
	select=new Select(currencydropdown);
	select.selectByVisibleText("Euro");
}
public void openmyaccount()
{
	
	clickbutton(Myaccountbtn);
}
public void selectnotebooksmenu()

{
	actions.moveToElement(computers)
	.moveToElement(NotebooksMenu).
	click()
	.build()
	.perform();	
	
}
}
