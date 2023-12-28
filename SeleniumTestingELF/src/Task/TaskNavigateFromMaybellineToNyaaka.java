package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNavigateFromMaybellineToNyaaka {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.co.in");
		Thread.sleep(2000);
		
		driver.switchTo(). newWindow(WindowType.TAB);
		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Men")).click();
		Set<String> allWindowID = driver.getWindowHandles();
		for(String WindowID:allWindowID)
		{
			driver.switchTo().window(WindowID);
			Thread.sleep(2000);
			if(driver.getTitle().contains("Buy Men's Clothing"))
			{
				driver.findElement(By.linkText("Careers")).click();
				break;
			}
		}
		for(String WindowID:allWindowID)
		{
			driver.switchTo().window(WindowID);
			Thread.sleep(2000);
			if(driver.getTitle().contains("Maybelline"))
			{
				driver.close(); 
			}
		}
			
		
		
		
		
	}

}
