package Task;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskFoodPandaCloseAds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.foodpanda.com/");
		Actions act=new Actions(driver);
		
		List<WebElement> listElements = driver.findElements(By.xpath("//ul[@id='menu-primary']/li[not(contains(.,'Choose location'))]"));
		
	for(WebElement list:listElements)
	{
		act.keyDown(Keys.CONTROL).perform();
		list.click();
		act.keyUp(Keys.CONTROL).perform();
		
	}
	
	Set<String> window = driver.getWindowHandles();
	for(String list1:window)
	{
        driver.switchTo().window(list1);
        
        if(driver.getTitle().contains("panda ads"))
        {
        	driver.close();
        }
        
}
}
}