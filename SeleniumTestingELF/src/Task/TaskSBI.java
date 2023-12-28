package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSBI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		Thread.sleep(2000);
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot Username / Login Password")).click();
		Thread.sleep(2000);
	    Set<String> WindowId = driver.getWindowHandles();
	    for(String Window:WindowId)
	    {
	    	driver.switchTo().window(Window);
	    	if(driver.getCurrentUrl().contains("https://retail.onlinesbi.sbi/retail/troubleloginhome.htm?bankCode=0"))
	    	{
	    		driver.findElement(By.id("nextStep")).click();
	    		Thread.sleep(2000);
	    		driver.manage().window().maximize();
	    		
	    				
	    	}
	    
	    }
	    driver.findElement(By.id("userName")).sendKeys("saloni");
	    Thread.sleep(2000);
	    driver.findElement(By.id("accountNo")).sendKeys("123456789766543");
	    Thread.sleep(2000);
	    driver.findElement(By.id("mobileNo")).sendKeys("7083382992");
	    driver.findElement(By.id("datepicker5")).sendKeys("29/11/23");
	    Thread.sleep(2000);
	    driver.findElement(By.name("captchaValue")).sendKeys("F2053");
	    Thread.sleep(2000);
	    driver.findElement(By.id("go")).click();
	    
	}

	}

