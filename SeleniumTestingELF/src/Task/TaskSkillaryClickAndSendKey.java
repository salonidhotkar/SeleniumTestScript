package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSkillaryClickAndSendKey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("saloni123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("S@loni05");
		Thread.sleep(2000);
		driver.findElement(By.name("captcha")).sendKeys("dA7cq9");
		Thread.sleep(2000);
		driver.findElement(By.name("captcha_type")).click();
				
	}
}
