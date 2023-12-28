package browserAction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/4");
		Thread. sleep(20000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(4000);
		driver.close();
		driver.quit();
		
		
		
		
	}

}
