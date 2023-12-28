package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskVtiger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.clear();
		UserName.sendKeys("Saloni");
		WebElement PassWord = driver.findElement(By.id("password"));
		PassWord.clear();
		PassWord.sendKeys("gfyjuuh,");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String ErrorMesg=driver.findElement(By.id("validationMessage")).getText();
		System.out.println(ErrorMesg);
	}

}
