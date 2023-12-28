package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class TaskToCloseChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		
		

		Set<String>WindowId=driver.getWindowHandles();
		String parent=driver.getWindowHandle();
		
		WindowId.remove(parent);
		for( String Window:WindowId)
		{
			driver.switchTo().window(Window);
			driver.close();
		}
		


		
	}

}
