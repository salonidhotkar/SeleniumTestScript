package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIDLocator {

	public static void main(String[] args) throws InterruptedException {
	 	// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demowebshop.tricentis.com/login");
	      Thread.sleep(1000);
	     
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("saloni123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("$@loni1234");
		Thread.sleep(1000);
		driver.findElement(By.id("RememberMe")).click();
	      
	       

	}

}
