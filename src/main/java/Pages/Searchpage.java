package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage extends PageBase {

	public Searchpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id="small-searchterms")
	WebElement searchtxtbox;
	
	@FindBy(css="button[class*='search-box-button']")
	WebElement searchbtn;
	

@FindBy(linkText="Apple MacBook Pro 13-inch")
WebElement producttitle;

@FindBy(linkText = "shopping cart")
WebElement shoppingcart;

@FindBy(id ="ui-id-1")
List<WebElement> productlist;

public void productsearch(String productname) {
	SetTextElementText(searchtxtbox, productname);
	clickbutton(searchbtn);
	
}
public void openproductdetailspage()
{
	clickbutton(producttitle);
}
public void productsearchautosuggest(String productname)
{
	SetTextElementText(searchtxtbox, productname);
	productlist.get(0).click();
}

}


