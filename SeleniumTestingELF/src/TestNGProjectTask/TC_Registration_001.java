package TestNGProjectTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Registration_001 {
    @DataProvider
	public String[][] RegistrationDetails() {
		String[][] details= {
				            {"Female","Chandana","Manjesh","chandumajesh123@gmail.com","Chandu@4444","Chandu@4444"}
		                    };
		
		return details;
		}
	@Test(dataProvider = "RegistrationDetails")
	public void register(String arr[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/register");
         driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-"+arr[0].toLowerCase()+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(arr[1]);
		driver.findElement(By.id("LastName")).sendKeys(arr[2]);
		driver.findElement(By.id("Email")).sendKeys(arr[3]);
		driver.findElement(By.id("Password")).sendKeys(arr[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(arr[5]);
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		 	}
	
	 
	
     
		
	}


