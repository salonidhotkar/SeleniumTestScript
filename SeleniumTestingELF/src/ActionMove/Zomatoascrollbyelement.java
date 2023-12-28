package ActionMove;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class Zomatoascrollbyelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    

		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com");
		 
		Actions act=new Actions(driver);
		WebElement zomato = driver.findElement(By.xpath("//h5[text()='Marathahalli']"));
		//act.scrollToElement(zomato).click().perform();
		
		ScrollOrigin or=ScrollOrigin.fromElement(zomato);
		act.scrollFromOrigin(or, 0, 100).perform();
		
		
		
		
	}

}
