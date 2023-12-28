package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCCSLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		driver.findElement(By.className("email")).sendKeys("salonidhotkar05@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.className("password")).sendKeys("S@loni123");
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		
		
	}

		}


