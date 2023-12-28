package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDemoShopWorkUSingLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		

		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("saloni");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Dhotkar");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("salonidhotkar69@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("S@loni1234");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("S@loni1234");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/13/1/1    ');return false;\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Shopping cart")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[name=\"removefromcart\"]")).click();
        driver.findElement(By.cssSelector("input[value='Update shopping cart']")).click();
	}
}

