package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class compareproductpage extends PageBase{

	public compareproductpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(linkText ="Asus N551JK-XO076H Laptop")
public WebElement firstname;
@FindBy(linkText ="Apple MacBook Pro 13-inch")
public WebElement secondname;
@FindBy(css="button[class*='remove-button']")
WebElement removebtn;
@FindBy(linkText ="Clear list")
WebElement clearlist;


}
