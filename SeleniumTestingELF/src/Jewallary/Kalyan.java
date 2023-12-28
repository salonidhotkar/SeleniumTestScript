package Jewallary;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kalyan {




	@Test(groups="functionality")
	public void kalyan()
	{
	

	System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.kalyanjewellers.net/");
	 

}

  

	@Test(groups="integration")
	public void josalikks()
	{
	

	System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.josalukkasonline.com/");
	 

}
}
