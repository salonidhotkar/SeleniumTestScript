package browserAction;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverFocus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();

		Thread.sleep(8000);
		Set<String> allWindowid = driver.getWindowHandles();

		for (String WindowId : allWindowid)
			
		{
			driver.switchTo().window(WindowId);
			System.out.println(driver.getTitle());
		
	    Thread.sleep(3000);
		driver.close();
		Thread.sleep(4000);
		driver.quit(); 
		}
	}
}
