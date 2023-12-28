package sayalee;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserRollsRoyce {
	@Parameters("sname")
	@Test
	public void rollsroyce(String browserName)
	{
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
			driver=new EdgeDriver();
			
		}else
		{
			Reporter.log("Invalid browser name",true);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
	}

}
