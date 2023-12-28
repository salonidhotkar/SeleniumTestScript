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

public class Practice1 {
	@DataProvider
	public String[] dataprovider() throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream(new File("./resources/LetCode.xlsx"));
		 Workbook workbook = WorkbookFactory.create(file);
		int cellcount = workbook.getSheet("Sheet3").getRow(0).getPhysicalNumberOfCells()-1;
		String[] data=new String[cellcount];
		
		for(int i=0; i<cellcount; i++) {
			data[i]=workbook.getSheet("Sheet3").getRow(0).getCell(i+1).toString();
		}
		 return data;
		 
	}
	 @Test(dataProvider = "dataprovider")
	 public void enteringvalue(String name) {
		 System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		driver.get("https://www.linkedin.com/login");
 		driver.findElement(By.id("username")).sendKeys(name); 
	 }
	    

}
