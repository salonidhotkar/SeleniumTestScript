package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDream11AddPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
	    driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("7083382992");
	}

}
