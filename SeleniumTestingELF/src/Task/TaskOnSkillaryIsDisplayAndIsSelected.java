package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOnSkillaryIsDisplayAndIsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		driver.findElement(By.linkText("SPANISH")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.linkText("ENGLISH")).click();
	      Thread.sleep(1000);
		
		driver.findElement(By.linkText("SIGN IN")).click();
		
//		if(driver.findElement(By.id("usertype_yes")).isEnabled())
//		{
//			System.out.println(driver.findElement(By.id("groupcode")).isDisplayed());
//		}
//		else
//		{
//			System.out.println(driver.findElement(By.id("groupcode")).isDisplayed());
//		}
		
		WebElement YesBox = driver.findElement(By.id("usertype_yes"));
		YesBox.click();
		
		if(YesBox.isSelected())
		{
			System.err.println(driver.findElement(By.id("groupcode")).isDisplayed());
		}
		else
		{
			System.err.println(driver.findElement(By.id("groupcode")).isDisplayed());
		}
		
	}

}
