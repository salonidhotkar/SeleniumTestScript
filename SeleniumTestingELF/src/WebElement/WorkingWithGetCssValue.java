package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCssValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://skillrary.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("SIGN IN")).click();
//		driver.findElement(By.xpath("//button[text()=' Submit ']")).click();
//		Thread.sleep(2000);
//		WebElement ErrorMesg = driver.findElement(By.id("email-error"));
//		System.out.println(ErrorMesg.getCssValue("color"));
//		System.out.println(ErrorMesg.getCssValue("display"));
//		System.out.println(ErrorMesg.getCssValue("margin-bottom"));
//		System.out.println(ErrorMesg.getCssValue("font-weight"));
//		
		driver.get("https://www.maybelline.co.in/");
		Thread.sleep(2000);
		WebElement TextColor = driver.findElement(By.xpath("//span[text()='Tips & trends']"));
		System.out.println(TextColor.getCssValue("color"));
		System.out.println(TextColor.getCssValue("line-height"));
		System.out.println(TextColor.getCssValue("font-family"));
		
		//driver.findElement(null)
		
	}

}
