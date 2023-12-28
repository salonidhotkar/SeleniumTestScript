package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCloseTheParent{

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	    
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		

			driver.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
			driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
			Thread.sleep(3000);
			
			driver.close();
			
	}

}
