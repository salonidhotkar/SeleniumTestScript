package browserAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
   ChromeDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   driver.get("https://www.purplle.com/");
   
   driver.findElement(By.linkText("SHOP CATEGORIES")).click();
   driver.findElement(By.linkText("Makeup")).click();
   driver.findElement(By.xpath("//div[contains(text(),'Lakme Sun Expert Ultra Matte SPF 40 PA+++ Compact (7 g)')] ")).click();
	}

}
