package Jewallary;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Reliance {
	
	@Test
	public void reliance()
	{
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://reliancejewels.com/");
		 
	}

}
