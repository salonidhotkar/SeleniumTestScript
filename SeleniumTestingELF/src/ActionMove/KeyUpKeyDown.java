package ActionMove;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://parivahan.gov.in/parivahan/");
		Actions action=new Actions(driver);
		 
		List<WebElement> allnavelements = driver.findElements(By.xpath("//li[@data-level='1']"));
		
		for(WebElement tab:allnavelements)
		{
			action.keyDown(Keys.CONTROL).perform();
			tab.click();
			action.keyUp(Keys.CONTROL).perform();
//		   action.keyDown(Keys.SHIFT).perform();
//		   tab.click();
//		   action.keyUp(Keys.SHIFT).perform();
		   
		}
		   
		   Set<String> handle = driver.getWindowHandles();		   
		   for(String handle1:handle)
		   {
			   driver.switchTo().window(handle1);
			   System.out.println(driver.getTitle());
		   
		   
		  String s1= "About Us | Parivahan Sewa | Ministry of Road Transport & Highways, Government of India";
		  String title=driver.switchTo().window(handle1).getTitle();
		  
		  if(title.contains(s1)) {
			  driver.close();
		  }
	}	   
	}

}