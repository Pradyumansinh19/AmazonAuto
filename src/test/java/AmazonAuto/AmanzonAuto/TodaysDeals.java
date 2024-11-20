package AmazonAuto.AmanzonAuto;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;
import TestComponents.Base;

public class TodaysDeals extends Base {

	@Test
	public void getTodaysDealItems() throws FileNotFoundException, IOException {

		HomePageObject home = homePage();
		DealPageObject deal = home.goToBestDeals();
		deal.getItemsOnDeal();
		quitDriver();
		
	}

}
