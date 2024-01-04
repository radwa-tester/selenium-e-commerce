package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productreviewpage extends PageBase {

	public productreviewpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "AddProductReview_Title")
	WebElement reviewtitle;
	@FindBy(id = "AddProductReview_ReviewText")
	WebElement Reviewtxt;
	@FindBy(id="addproductrating_3")
	WebElement Rating;
	@FindBy(name = "add-review")
	WebElement submitreview;
	@FindBy(css="div[class*='result']")
	public WebElement result;
	public void addreview(String reviewtit ,String reviewtxt)
	{
		SetTextElementText(reviewtitle, reviewtit);
		SetTextElementText(Reviewtxt, reviewtxt);
		clickbutton(Rating);
		clickbutton(submitreview);
	}

}
