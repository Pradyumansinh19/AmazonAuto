package AmazonAuto.AmanzonAuto;

import java.util.List;

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

	// Getting all the items on deal
	@FindBy(css = ".style_badgeLabel__dD0Hv span")
	private List<WebElement> dealsItems;

	@FindBy(css = ".a-truncate-cut")
	private List<WebElement> items;

///////////////////////////////////////////////////////////////////----Action-Methods-----////////////////////////////////////////
	public void goTo() {
		driver.get("https://www.amazon.in/");

	}

	public DealPageObject goToBestDeals() {
		todayDeal.click();
		DealPageObject deals = new DealPageObject(driver);
		return deals;
	}

}
