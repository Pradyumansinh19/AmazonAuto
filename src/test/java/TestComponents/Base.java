package TestComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import AmazonAuto.AmanzonAuto.HomePageObject;

public class Base {

	WebDriver driver = new ChromeDriver();
	
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
