package crossBrowserPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Roadster {
	@Test
	@Parameters("pn")
	public void roadster(@Optional("chrome")String Browser) {
		WebDriver web=null;
		
	if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    web=new ChromeDriver();
	}else if(Browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	    web=new EdgeDriver();
	}else {
		Reporter.log("Browser",true);
	}
	
	web.manage().window().maximize();
	web.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	web.get("https://roadster.com/");
		
		
	}

}
