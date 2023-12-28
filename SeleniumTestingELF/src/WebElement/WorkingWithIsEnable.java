package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsEnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");

		// driver.get("https://www.instagram.com/");

		Thread.sleep(2000);

		// ToEnableTheLoginButtoninsta
//		WebElement Login= driver.findElement(By.xpath("//button[.='Log in']"));
//   	System.out.println(Login.isEnabled());
//		
//		//Capture tagNamedemo
//		WebElement Register = driver.findElement(By.linkText("Register"));
//		System.out.println(Register.getTagName());
//		
//		//ToDisplayElementoninsta
//		WebElement Login1 = driver.findElement(By.xpath("//button[.='Log in']"));
//		System.out.println(Login1.isDisplayed());
//
//			
		// ToSelectedondemo
		// WebElement RememberMe = driver.findElement(By.id("RememberMe"));
		// System.out.println(RememberMe.isSelected());

		
		
//		  WebElement Rememberme1 = driver.findElement(By.id("RememberMe"));
//		  System.out.println(Rememberme1.isSelected());
//		 
		WebElement RemberMe2 = driver.findElement(By.id("RememberMe"));
		System.out.println(RemberMe2.isSelected());
	}

}
