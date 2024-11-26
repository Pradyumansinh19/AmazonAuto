package AmazonAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.Common;

public class ProductDetailObject extends Common {

	WebDriver driver;

	public ProductDetailObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

///////////////////////////////////////////////////////////////////----Locators-----//////////////////////////////////////////////
	// Getting element of add to button
	@FindBy(css = " #add-to-cart-button")
	private WebElement addToCart;

	// Getting element of cart button to navigate to cart page
	@FindBy(css = "#nav-cart-count")
	private WebElement cartButton;

	// Getting element of side bar close button
	@FindBy(css = "#attach-close_sideSheet-link")
	private WebElement sideBar;

///////////////////////////////////////////////////////////////////----Action-Methods-----////////////////////////////////////////

}
