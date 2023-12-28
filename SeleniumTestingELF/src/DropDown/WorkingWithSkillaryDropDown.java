package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSkillaryDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://demoapp.skillrary.com/");
		   
		   WebElement MultilistBox = driver.findElement(By.id("cars"));
		  Select CoursePrice= new Select(MultilistBox);
		  CoursePrice.selectByIndex(4);
		  Thread.sleep(1000);
		  CoursePrice.selectByValue("90");
		  Thread.sleep(1000);
		  CoursePrice.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		  Thread.sleep(1000);
		  System.out.println(CoursePrice.getFirstSelectedOption().getText());
		  
		  CoursePrice.deselectByIndex(3);
		  Thread.sleep(1000);
		  CoursePrice.deselectByValue("99");
		  Thread.sleep(1000);
		  CoursePrice.deselectByVisibleText("INR 300 - INR 399 ( 1 )");
	}

}
