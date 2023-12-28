package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithCheckBox {

	private static final String Expectedcondition = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(15));
	   // FluentWait fl=new FluentWait(driver).pollingEvery(Duration.ofMillis(100));
	    
	   
	
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("445102");
		WebElement CheckBox = driver.findElement(By.id("Check"));
		//System.out.println(CheckBox.isEnabled());
		
		explicitwait.until(ExpectedConditions.elementToBeClickable(CheckBox)); 
		//while(!CheckBox.click()){}
		CheckBox.click();
		
		//driver.findElement(By.id("Check")).click();
	
	}

}
