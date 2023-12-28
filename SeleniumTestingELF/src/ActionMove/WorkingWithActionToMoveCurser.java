package ActionMove;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithActionToMoveCurser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.purplle.com/");
		WebElement Brand = driver.findElement(By.xpath("//a[text()='BRANDS ']"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(Brand).perform();
		Thread.sleep(1000);  
		driver.findElement(By.linkText("Good Vibes")).click();
		
	}

}
