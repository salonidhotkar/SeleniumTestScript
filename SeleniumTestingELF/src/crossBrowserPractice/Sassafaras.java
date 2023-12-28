package crossBrowserPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sassafaras {
	@Test
    @Parameters("pn")
	public void sassa(@Optional("chrome")String name) {
		WebDriver w=null;
	if(name.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    w=new ChromeDriver();
	}else if(name.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
	    w=new EdgeDriver();
	}else {
		Reporter.log("name",true);
	}
	w.manage().window().maximize();
	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	w.get("https://www.sassafras.in/");
	
		
	}

}
