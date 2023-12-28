package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSizeGetLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com");
		 
		WebElement EmailNameTextBox = driver.findElement(By.id("email"));
		WebElement PassWordTextBox = driver.findElement(By.id("passContainer"));
		
		Point EmailNameloc = EmailNameTextBox.getLocation();
		Point PassWordTextloc = PassWordTextBox.getLocation();
		System.out.println("X value of Email" +EmailNameloc.getX());
		System.out.println("X value of password" +PassWordTextloc.getX());
		
		if(EmailNameloc.getX()==PassWordTextloc.getX())
		{
			System.out.println("It is aligned properly towords left");
		}
		else
		{
			System.out.println("It is not alligned towards left");
		}
		
		
	}

}
