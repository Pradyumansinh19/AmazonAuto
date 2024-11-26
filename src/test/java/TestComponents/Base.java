package TestComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AmazonAuto.HomePageObject;

public class Base {

	WebDriver driver = new ChromeDriver();
	
	// Implementation of navigation to amazon home page
	public HomePageObject homePage()
	{
		HomePageObject home = new HomePageObject(driver);
		home.goTo();
		return home;
		
	}
	
	
	public void quitDriver()
	{
		driver.quit();
	}

}
