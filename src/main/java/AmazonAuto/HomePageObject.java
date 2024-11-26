package AmazonAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.Common;

public class HomePageObject extends Common {

	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

///////////////////////////////////////////////////////////////////----Locators-----//////////////////////////////////////////////
	// Today's Deal button click
	@FindBy(css = ".nav-a[href='/deals?ref_=nav_cs_gb']")
	private WebElement todayDeal;

///////////////////////////////////////////////////////////////////----Action-Methods-----////////////////////////////////////////
	// implementation of navigation to
	public void goTo() {
		driver.get("https://www.amazon.in/");

	}

	// implementation of navigation to Today's deal page
	public DealPageObject goToBestDeals() {
		todayDeal.click();
		DealPageObject deals = new DealPageObject(driver);
		return deals;
	}

}
