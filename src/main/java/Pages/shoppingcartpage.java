package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class shoppingcartpage extends PageBase {

	public shoppingcartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(css="span[class='product-subtotal']")
public WebElement Total;
@FindBy(name = "updatecart")
WebElement removebtn;
@FindBy(id = "checkout")
WebElement checkoutbtn;
@FindBy(id = "termsofservice")
WebElement checkbox;
public void checkout()
{
	clickbutton(checkbox);
	clickbutton(checkoutbtn);
}
}
