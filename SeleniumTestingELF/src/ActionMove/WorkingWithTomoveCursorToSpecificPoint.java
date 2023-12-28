package ActionMove;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithTomoveCursorToSpecificPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi/");
		driver.findElement(By.linkText("LOGIN")).click();
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("S@loni1234");
		
		Actions action=new Actions(driver);
		action.moveToElement(password, 290, 0).click().perform();
	}

}
