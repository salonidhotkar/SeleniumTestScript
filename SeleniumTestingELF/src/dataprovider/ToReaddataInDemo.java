package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReaddataInDemo {
	@DataProvider
	public String[] passtestdata() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(new File("./resources/LetCode.xlsx"));
		Workbook workbook = WorkbookFactory.create(file);
		int cellcount = workbook.getSheet("DWS").getRow(0).getPhysicalNumberOfCells()-1;
		String[] data = new String[cellcount];

		for (int i = 0; i < cellcount; i++) {
			data[i] = workbook.getSheet("DWS").getRow(0).getCell(i + 1).toString();
		}
		return data;
	}

	@Test(dataProvider = "passtestdata")
	public void TestinguserNameTextField(String testdata) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(testdata);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
