package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskClickAndSendKeysUsingLocatorsId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.shoppersstack.com/");
	      Thread.sleep(10000);
	      
	     driver.findElement(By.id("loginBtn")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.id("Create Account")).click();
	     Thread.sleep(5000);
	     WebElement FirstName=driver.findElement(By.id("First Name"));
	     FirstName.sendKeys("SALONI");
	     Thread.sleep(2000);
         WebElement LastName=driver.findElement(By.id("Last Name"));
	     LastName.sendKeys("DHOTKAR");
	     driver.findElement(By.id("Female")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("Phone Number")).sendKeys("7083382992");
	     Thread.sleep(2000);
	     driver.findElement(By.id("Email Address")).sendKeys("sonawaletanuja55@gmail.com");
	     Thread.sleep(2000);
	     driver.findElement(By.id("Password")).sendKeys("S@loni1234");
	     Thread.sleep(2000);
	     driver.findElement(By.id("Confirm Password")).sendKeys("S@loni1234");
	     Thread.sleep(1000);
	     driver.findElement(By.id("Terms and Conditions")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("Register")).click();
	     
	     
	      
	}

}
