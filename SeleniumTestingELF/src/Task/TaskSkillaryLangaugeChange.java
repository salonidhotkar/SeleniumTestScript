package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSkillaryLangaugeChange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.skillrary.com/user/login");
      driver.manage().window().maximize();
      Thread.sleep(2000);
      
      driver.findElement(By.linkText("SPANISH")).click();
      Thread.sleep(2000);
      driver.findElement(By.linkText("ENGLISH")).click();
      Thread.sleep(1000);
      driver.navigate().back();
      Thread.sleep(1000);
      driver.findElement(By.linkText("SIGN IN")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("email")).sendKeys("salonidhotkar12@gmail.com");
      Thread.sleep(2000);
      driver.findElement(By.name("password")).sendKeys("S@loni123");
      Thread.sleep(2000);
      driver.findElement(By.name("captcha")).sendKeys("9gnQRf");
      Thread.sleep(2000);
      driver.findElement(By.id("usertype_yes")).click();
      driver.findElement(By.id("groupcode")).sendKeys("TYSS123");
      driver.findElement(By.name("remember")).click();
     
      
		
		
	}

}
