package browserAction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinkListandPartialLinkList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.driver.chrome","/.driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Woodenstreet.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Dining & Kitchen")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Modular Kitchen")).click();
		
		
		
		
		
		
		
	}

}
