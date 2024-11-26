package AmazonAuto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.Common;

public class DealPageObject extends Common {

	WebDriver driver;

	public DealPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

///////////////////////////////////////////////////////////////////----Locators-----//////////////////////////////////////////////	
	// Getting all items on deals
	@FindBy(css = "span.a-truncate-cut")
	private List<WebElement> dealItems;

///////////////////////////////////////////////////////////////////----Action-Methods-----////////////////////////////////////////
	// Implementation to get all items on today's deal
	public void getItemsOnDeal(String fileName) throws FileNotFoundException, IOException {

		exportDataToWorkbook(dealItems, fileName);

	}

}
