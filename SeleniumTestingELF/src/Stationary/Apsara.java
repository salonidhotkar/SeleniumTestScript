package Stationary;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apsara {
	
	
	
	@Test(groups="functionality")
	public void apsara()
	{

		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.hindustanpencils.com/category/products/apsara/apsara-pencils/");
		 
	}

}



