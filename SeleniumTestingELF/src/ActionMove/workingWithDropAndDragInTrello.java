package ActionMove;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class workingWithDropAndDragInTrello {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(25));
		
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("salonidhotkar05@gmail.com");
		driver.findElement(By.id("login")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("T@nuj@1234");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[@title='Subjects']")).click();
		Actions action=new Actions(driver);
		action.contextClick(driver.findElement(By.linkText("Completed"))).perform();
		WebElement dropdown = driver.findElement(By.linkText("Open card"));
		System.out.println(dropdown.getText());
		List<WebElement> dropdown1 = driver.findElements(By.xpath("//button[@class='BppQGb2j7TfyB5 bxgKMAm3lq5BpA SEj5vUdI3VvxDc']"));
		
		for(WebElement drop:dropdown1)
		{
			System.out.println(drop.getText());
		}
//		WebElement Box = driver.findElement(By.xpath("//div[@class='ozCejPnL4yzsJ4']"));
//	     System.out.println(Box.getText());
		
		
		
		
		
		
		
		
		
		
		
		
   
	}

}
