package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropDownHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://en-gb.facebook.com/r.php?locale=en_GB&display=page");
		   WebElement DayList = driver.findElement(By.id("day"));
		  WebElement MonthList = driver.findElement(By.id("month"));
		  WebElement YearList = driver.findElement(By.id("year"));
		  
		  Select dayselect=new Select(DayList);
		  Select monthselect=new Select(MonthList);
		  Select yearselect=new Select(YearList);
		  
		  System.out.println(dayselect.isMultiple());
		  dayselect.selectByVisibleText("5");
		  monthselect.selectByIndex(1);
		  yearselect.selectByValue("1998");
		  
	}

}
