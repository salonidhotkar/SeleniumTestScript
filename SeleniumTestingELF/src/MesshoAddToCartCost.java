import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MesshoAddToCartCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/?page=1");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.xpath("//span[text()='Women Western']")).click();
	driver.findElement(By.xpath("//p[text()='Tops']")).click(); 
		
	}

}
