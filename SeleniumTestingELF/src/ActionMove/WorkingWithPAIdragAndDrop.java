package ActionMove;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithPAIdragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//WebDriverWait explicitewait=new WebDriverWait(driver,Duration.ofSeconds(25));
		driver.get("https://www.paiinternational.in/");
		
		driver.findElement(By.linkText("Select Category")).click();
		driver.findElement(By.linkText("Furniture")).click();
	
		WebElement dragfrom = driver.findElement(By.xpath("//span[@class='irs-slider from']"));
		WebElement dragto = driver.findElement(By.xpath("//span[@class='irs-slider to']"));
		Actions action=new Actions(driver);
		action.clickAndHold(dragfrom).moveByOffset(30, 0).release().perform();
	}

}
