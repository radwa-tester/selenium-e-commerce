package Pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected WebDriver driver;
	public JavascriptExecutor js;
	public Select select;
	public Actions actions;
	
	
//create constructor
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	protected static void clickbutton(WebElement button)
	{
		button.click();
	}
	protected static void SetTextElementText(WebElement textElement,String value)
	{
		textElement.sendKeys(value);
	}
	
	public void scrollToBottom()
	
	{
		
		js.executeScript("scrollBY(0,2500)");
		
	}
	public void cleartxt(WebElement element)
	{
		element.clear();
	}

}
