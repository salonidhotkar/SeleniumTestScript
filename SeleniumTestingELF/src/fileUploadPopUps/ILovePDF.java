package fileUploadPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ILovePDF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		WebElement pdf = driver.findElement(By.xpath("//input[@tabindex='-1']"));
		pdf.sendKeys("D:\\Saloni\\cv resume\\Saloni_civil_TAE.pdf");
	}

}
