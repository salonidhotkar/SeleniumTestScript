package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class TaskCloseCampco {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String> allwindow = driver.getWindowHandles();
		String s="Campco";
		for(String WindowID:allwindow)
		{
			driver.switchTo().window(WindowID).getTitle();
			
			if(driver.getTitle().contains(s))
			{
				driver.close();
				
		}
		
		
		}
		
	}
}


