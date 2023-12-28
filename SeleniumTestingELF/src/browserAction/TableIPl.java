package browserAction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableIPl {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   driver.get("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/points-table-standings");
		   List<WebElement> IPLTable = driver.findElements(By.xpath("//div[contains(@class,'ds-p-0 ds-border-b ds-border-line last:ds-border-b-0 ds-overflow-auto')]/../..//table/tbody/tr[@class='ds-text-tight-s ds-text-typo-mid2']/.."));
		   
		   for(WebElement IPLtable:IPLTable)
		   {
			 String team =IPLtable.findElement(By.xpath("td[1]")).getText(); 
			  
			 String points =IPLtable.findElement(By.xpath("td[7]")).getText(); 
			 System.out.println(team+" _ "+points);
		   }
		   
	}

}
