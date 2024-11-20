package AmazonAuto.AmanzonAuto;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.Common;

public class ProductDetailObject extends Common {
	
	WebDriver driver;
	
	public ProductDetailObject(WebDriver driver)
	{
		this.driver  = driver;
		PageFactory.initElements(driver, this);
	}


///////////////////////////////////////////////////////////////////----Locators-----//////////////////////////////////////////////
	@FindBy(css = " #add-to-cart-button")
	private WebElement addToCart;
	
	@FindBy(css = ".style_badgeLabel__dD0Hv")
	private List<WebElement> discounts;
	
	@FindBy(css = "#nav-cart-count")
	private WebElement cartButton;
	
	@FindBy(css = "#attach-close_sideSheet-link")
	private WebElement sideBar;
	
	
	
///////////////////////////////////////////////////////////////////----Action-Methods-----////////////////////////////////////////
	public void addItemToCart() throws InterruptedException
	{
		addToCart.click();
		Thread.sleep(5000);
	
	}
	
	public void goToCart()
	{
		if(sideBar.isDisplayed())
		{
			sideBar.click();
		}
			cartButton.click();
		
	}
}
