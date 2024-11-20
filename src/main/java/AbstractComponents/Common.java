package AbstractComponents;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Common {

	WebDriver driver;

	public Common() {

	}

	public void impWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public Workbook createWorkBook() {
		Workbook workbook = new XSSFWorkbook();
//		Sheet sheet = workbook.createSheet();
		return workbook;

	}

	public void exportWorkBook(Workbook workbook, String filename) {
		try (FileOutputStream fileOut = new FileOutputStream(filename)) {
			workbook.write(fileOut);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void closeWorkBook(Workbook workbook) {
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
