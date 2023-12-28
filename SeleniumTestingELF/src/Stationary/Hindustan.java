package Stationary;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hindustan {
	
	@Test(groups={"regression","integration"})
	public void hindu()
	{

		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.hindustanpencils.com/");
		 
	}

}


