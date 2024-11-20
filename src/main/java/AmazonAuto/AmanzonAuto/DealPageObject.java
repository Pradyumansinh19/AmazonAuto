package AmazonAuto.AmanzonAuto;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
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
	// Deals items description
	@FindBy(css = "span.a-truncate-cut")
	private List<WebElement> dealItems;

///////////////////////////////////////////////////////////////////----Action-Methods-----////////////////////////////////////////
	public void getItemsOnDeal() throws FileNotFoundException, IOException {

		Workbook workbook = createWorkBook();
		Sheet sheet = workbook.createSheet();
		int rowNum = 0;

		for (WebElement item : dealItems) {
			Row row = sheet.createRow(rowNum++);
			Cell cell = row.createCell(0);
			cell.setCellValue(item.getText());
		}

		exportWorkBook(workbook, "data.xlsx");
		closeWorkBook(workbook);

	}

}
