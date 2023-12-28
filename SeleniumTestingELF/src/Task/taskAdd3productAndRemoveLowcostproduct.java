package Task;

import java.time.Duration;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskAdd3productAndRemoveLowcostproduct
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/desktops");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//a[text()='Build your own cheap computer']/../../..//input[contains(@onclick,'AjaxCart')]")).click();
		driver.findElement(By.id("add-to-cart-button-72")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Build your own expensive computer']/../..//input[contains(@onclick,'AjaxCart')]")).click();
	    driver.findElement(By.id("add-to-cart-button-74")).click();
	    driver.navigate().back();
	    //driver.findElement(By.xpath("//a[text()='Blue and green Sneaker']/../..//input[contains(@onclick,'AjaxCart')]")).click();
        driver.findElement(By.linkText("JEWELRY")).click();
        driver.findElement(By.xpath("//a[text()='Create Your Own Jewelry']/../..//input[contains(@onclick,'AjaxCart')]")).click();
        driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("11cm");
        driver.findElement(By.id("add-to-cart-button-71")).click();
         driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
         
         
        String Cart = driver.findElement(By.xpath("//div[contains(@class,'page shopping-cart-page')]/../..//table/tbody/tr[1]/td[4]")).getText();
	}
}
