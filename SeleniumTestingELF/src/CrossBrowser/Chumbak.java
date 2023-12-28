package CrossBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
  
public class Chumbak {
	
	@Parameters("Pname")
	@Test
	public void chumbak(@Optional("edge")String browserName){
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		    driver=new ChromeDriver();
		
		}
		else if(browserName.equalsIgnoreCase("edge"))
	      {
		      System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		      driver=new EdgeDriver();
	      }
		else
		{
			Reporter.log("Invalid browserName",true);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.chumbak.com/");

	
		
	}

}

