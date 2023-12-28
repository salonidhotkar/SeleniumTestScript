package CrossBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lenovo {
	@Parameters
	@Test
	public void lenovo(@Optional("chrome")String BrowserName)
	{
		WebDriver driver=null;
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		    driver=new ChromeDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		    driver=new EdgeDriver();
		}
		else
		{
			Reporter.log("Invalid BrowserName",true);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.lenovo.com/");
	}

}
