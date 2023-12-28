package ActionMove;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithForInfinite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://onepagelove.com/");
		
		
		Actions act=new Actions(driver);
		//WebElement love = driver.findElement(By.linkText("Lee Travaglini"));
		for(;;)
		{
			try
			{
				driver.findElement(By.linkText("Lee Travaglini")).click();
		        break;
			}
			catch(NoSuchElementException e)
			{
				act.scrollByAmount(0, 1000).perform();
			    
			}
			catch(ElementClickInterceptedException c)
			{
				driver.findElement(By.linkText("Lee Travaglini")).click();
		        break;
			}
		}
		 
	}

}
