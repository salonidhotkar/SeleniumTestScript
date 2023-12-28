package JsPop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LIC 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://licindia.in/");
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.xpath("//span[text()=' Pay Premium ']")).click();
		
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		System.out.println(msg);
		alt.accept();
	}
}
