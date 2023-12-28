package dataprovider;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleApplications {
	@DataProvider
	public String[] app() {
		String[]arr= {
				             "https://www.caratlane.com/",
				              "https://www.giva.co/",
				              "https://reliancejewels.com/"
		             };
		return arr;
	}
	  @Test(dataProvider = "app")
	  public void application(String application) {
	System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(application);
	 

	  }
}
