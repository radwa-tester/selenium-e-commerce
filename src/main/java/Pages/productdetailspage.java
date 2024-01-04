package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productdetailspage extends PageBase {

	public productdetailspage(WebDriver driver) {
		super(driver);
		
	}
@FindBy(css="div.product-name")
public WebElement productname;

@FindBy(xpath="//strong[@class='current-item']")
public WebElement productnamebreadcrumb;
@FindBy(css="button[class*='email-a-friend-button']")
public WebElement emailfriendbtn;

@FindBy(css="span[class*='price-value-4']")
public WebElement productpricelabel;

@FindBy(linkText="Add your review")
WebElement addreviewlink;

@FindBy(id="add-to-wishlist-button-4")
WebElement addtowishlistbtn;

@FindBy(css="button[class*='add-to-compare-list-button']")
WebElement addtocomparelistbtn;

@FindBy(id="add-to-cart-button-4")
WebElement addtocartbtn;
@FindBy(linkText = "Shopping cart")
WebElement shoppingcart;

@FindBy(linkText = "Compare products list")
WebElement compareproductsbutton;

public void opensendemail()
{
	clickbutton(emailfriendbtn);
}
public void addreviewpage()
{
	clickbutton(addreviewlink);
}
public void addproducttowishlist()
{
clickbutton(addtowishlistbtn);
}
public void addproducttocomparelist()
{
clickbutton(addtocomparelistbtn);
}
public void addproducttocart()
{
clickbutton(addtocartbtn);
}
public void gotoshoppingcart()
{
	clickbutton(shoppingcart);
}
public void gotocomparepage()
{
	clickbutton(compareproductsbutton);
}
}

