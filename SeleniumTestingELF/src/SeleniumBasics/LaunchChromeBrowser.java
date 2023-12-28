package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver-win64");
     ChromeDriver driver=new ChromeDriver();
      
		//System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		//EdgeDriver driver=new EdgeDriver(); 	
		
		//System.setProperty("webdriver.gecko.driver","D:\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe" );
		//FirefoxDriver driver=new FirefoxDriver();
	}

}
