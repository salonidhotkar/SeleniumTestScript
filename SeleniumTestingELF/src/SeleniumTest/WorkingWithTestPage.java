package SeleniumTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTestPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/User/Downloads/TestPage.html");
		driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
		
		
		Set<String> allwindow = driver.getWindowHandles();
        for(String WindowID:allwindow)
		{
			driver.switchTo().window(WindowID);
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			
			String s1=("Meghana Foods");
			if(driver.getTitle().contains(s1));
			{
				driver.close();
				
		}
		
		
		}
		
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


