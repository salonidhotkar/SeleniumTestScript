package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPurplleCartCost {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.purplle.com/");
		
		//driver.findElement(By.className("p-search3")).click();
		//driver.findElement(By.xpath("//label[text()='Search for Products and Brands']")).sendKeys("lipstick");
		driver.findElement(By.partialLinkText("SHOP CATEGORIES")).click();
		//Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Makeup")).click();
	
		driver.findElement(By.linkText("Primer")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//div[text()='Revlon ColorStay Grip Matte Primer']")).click();
		//driver.findElement(By.partialLinkText("Add to Cart")).click();
		
		
		
		
	}
}
