package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleRowFromExcel {
	@DataProvider
	public String[] []registrationDetails() throws Exception {
		FileInputStream file=new FileInputStream(new File("./resources/Element.xlsx"));
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("DWS Registration");
		int EmailId = sheet.getPhysicalNumberOfRows(); 
		int Password = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][]data=new String[EmailId][Password];
		
		for(int i=0; i<EmailId; i++) {
			for(int j=0; j<Password; j++) {
				data[i][j]=sheet.getRow(i).getCell(j).toString();
			}
			
			
		}
		  return data;
		
	}
	
	   @Test(dataProvider = "registrationDetails")
	   public void EnterDetails(String arr[]) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    	driver.get("https://demowebshop.tricentis.com/login");
	    	driver.findElement(By.id("Email")).sendKeys(arr[0]);
	    	driver.findElement(By.id("Password")).sendKeys(arr[1]);
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    	
	   }

}
