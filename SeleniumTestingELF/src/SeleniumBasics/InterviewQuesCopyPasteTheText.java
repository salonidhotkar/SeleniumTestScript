package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuesCopyPasteTheText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.instagram.com/");
		
//		driver.findElement(By.name("username")).sendKeys("saloni");
//		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL+"a");
//		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL+"c");
//		driver.findElement(By.name("password")).sendKeys(Keys.CONTROL+"v");
      
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("saloni");
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("Email")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("Password")).sendKeys(Keys.CONTROL+"v");
		
		
		
		
	}

}
