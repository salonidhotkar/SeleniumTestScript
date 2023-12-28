package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleRow {
    @DataProvider 
	public String[][] RegistrationDetails() {
		String[][] details={
		                       {"salonidhotkar05@gmail.com","S@loni1234"},
		                       {"salonydhotkar@gmail.com","$aloni1234"}
		                 };
		
		 return details;
	 }
        @Test(dataProvider = "RegistrationDetails")
        public void EnterDetails(String arr[])throws Exception {
    	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	driver.get("https://demowebshop.tricentis.com/login");
    	driver.findElement(By.id("Email")).sendKeys(arr[0]);
    	driver.findElement(By.id("Password")).sendKeys(arr[1]);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@value='Log in']")).click();
    	
    }
	     
}
