package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stubd
    
		
	        int count=0; int count2=0; int count3=0;
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.facebook.com/");
			WebElement daylist = driver.findElement(By.id("day"));
			WebElement Monthlist = driver.findElement(By.id("month"));
			WebElement Yearlist = driver.findElement(By.id("year"));
		
			 WriteAMethodWhichAcceptDropDown w1=new  WriteAMethodWhichAcceptDropDown();
			 w1.selectLastOption(daylist);
			 w1.selectLastOption(Yearlist);
	}

}
