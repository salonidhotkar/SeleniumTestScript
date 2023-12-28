package JsPop_ups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcceptsPopupsOnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
	    Alert alt = driver.switchTo().alert();
	   String text = alt.getText();
	   System.out.println(text);
	   alt.accept();
	  // alt.dismiss()
		
	}

}
