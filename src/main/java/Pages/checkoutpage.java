package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class checkoutpage extends PageBase {

	public checkoutpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id = "BillingNewAddress_FirstName")
	WebElement firstname1;
	@FindBy(id = "BillingNewAddress_LastName")
	WebElement lastname1;
	@FindBy(id = "BillingNewAddress_Email")
	WebElement email1;
	@FindBy(id = "BillingNewAddress_CountryId")
	WebElement countrydropdn;
	@FindBy(id = "BillingNewAddress_City")
	WebElement city1;
	@FindBy(id = "BillingNewAddress_Address1")
	WebElement Address1;
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	WebElement ZipPostalCode;
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	WebElement phonenumber;
	@FindBy(css = "button[class*='new-address-next-step-button']")
	WebElement continue1;
	
	@FindBy(id= "shippingoption_1")
	WebElement Nextdayair;
	@FindBy(css = "button[class*='shipping-method-next-step-button']")
	WebElement continue2;
	@FindBy(id= "paymentmethod_0")
	WebElement moneyorder;
	@FindBy(css = "button[class*='payment-method-next-step-button']")
	WebElement continue3;
	@FindBy(css = "button[class*='payment-info-next-step-button']")
	WebElement continue4;
	@FindBy(css = "button[class*='confirm-order-next-step-button']")
	WebElement confirm;
	@FindBy(css = "div[class*='title']")
	WebElement message ;
	@FindBy(linkText="Click here for order details.")
	WebElement orderdetailslink;
	@FindBy(css="span[class*='value-summary']")
	public WebElement Total;
	
	public void checkoutproduct(String firstname,String lastname,String countryName,
			String email,String city,String address,String postalcode,String phone) throws InterruptedException
	{
		SetTextElementText(firstname1, firstname);
		SetTextElementText(lastname1, lastname);
		SetTextElementText(email1, email);
		select=new Select(countrydropdn);
		select.selectByVisibleText(countryName);
		SetTextElementText(city1, city);
		SetTextElementText(Address1, address);
		SetTextElementText(ZipPostalCode, postalcode);
		SetTextElementText(phonenumber, phone);
		clickbutton(continue1);
		clickbutton(Nextdayair);
		clickbutton(continue2);
		Thread.sleep(1000);
		clickbutton(moneyorder);
		clickbutton(continue3);
		Thread.sleep(1000);
		clickbutton(continue4);
		Thread.sleep(1000);
		
		
	}
	
	public void confirmcheckoutprocess() {
		clickbutton(confirm);
		
	}
}
