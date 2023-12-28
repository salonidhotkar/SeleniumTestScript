package browserAction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToCaptureURLofThePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		//EdgeDriver driver=new EdgeDriver();
		//driver.get("https://www.amazon.in/in");
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com"); 
		String titleOfthepage=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(titleOfthepage);
		System.out.println(url);
		

		
		 
	}

}
