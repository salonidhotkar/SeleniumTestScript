package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithiframeSpeedTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.speedtest.net/");
		Thread.sleep(3000);
		WebElement addvertise = driver.findElement(By.xpath("//iframe[@name='google_ads_iframe_/6692/speedtest.net/stnext_lowerboard_0']"));
		driver.switchTo().frame(addvertise);
		
		driver.findElement(By.id("cbb")).click();
		driver.switchTo().defaultContent();
		
		
	}

}
