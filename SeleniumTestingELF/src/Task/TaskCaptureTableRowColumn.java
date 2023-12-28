package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCaptureTableRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		 WebElement Goldtable = driver.findElement(By.xpath("//h2[text()='22K & 24K Gold Rates Per Gram in  Bangalore']"));
		
//		 for(int i=1; i<5; i++)
//		 {
//			 String Details = driver.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold')]/../..//table/tbody/tr["+i+"]/td[1]")).getText();
//			String cost = driver.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold')]/../..//table/tbody/tr["+i+"]/td[2]/div/div[1]")).getText();
//			System.out.println(Details +" - "+cost);
//		 }
		 
         for(int i=1; i<10; i++) {
	         String Historical = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates in Bangalore for the Last 10 Days')]/../..//td[@class='tb10Td']/..")).getText();
             String Days = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates in Bangalore for the Last 10 Days')]/../..//td[2]/div")).getText();
             System.out.println(Historical+" - "+Days);
         }
}
}
