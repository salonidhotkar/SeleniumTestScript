package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//To Capture Tool Tip Text
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(2000);
		String ToolTip = driver.findElement(By.cssSelector("img[title='Dining Table set']")).getAttribute("title");
     	System.out.println(ToolTip);
	
		//AlternativeName
	    driver.get("https://www.kalkifashion.com/in/");
		Thread.sleep(2000);
		String Alternative = driver.findElement(By.cssSelector("img[title='Bridesmaid Lehengas']")).getAttribute("alt");
		System.out.println(Alternative);
		
		//To Capture the data entered
		driver.get("https://www.nykaafashion.com/");
		Thread.sleep(2000);
		WebElement SearchBox = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products, styles, brands')]"));
		SearchBox.clear();
		SearchBox.sendKeys("lipstick");
		String ValueEnter = SearchBox.getAttribute("value");
		System.out.println(ValueEnter);
	}

}
