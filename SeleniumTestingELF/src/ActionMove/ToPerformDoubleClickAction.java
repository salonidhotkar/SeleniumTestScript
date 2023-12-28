package ActionMove;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");
		WebElement Addbutton = driver.findElement(By.id("add"));
		
		Actions action=new Actions(driver);
		action.doubleClick(Addbutton).perform();
		action.doubleClick(Addbutton).perform();
		
		action.moveToElement(driver.findElement(By.id("minus"))).doubleClick().perform();
		
		
		
	}

}
