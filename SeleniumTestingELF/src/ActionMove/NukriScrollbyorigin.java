package ActionMove;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.page.model.ScreencastFrame;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class NukriScrollbyorigin {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  

		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com");
		 
		Actions act=new Actions(driver);
	    WebElement scroll = driver.findElement(By.xpath("//span[text()='Resume writing']"));
		
	  ScrollOrigin so= ScrollOrigin.fromElement(scroll);
	   act.scrollFromOrigin(so, 0, 150).perform();
	}
	}


