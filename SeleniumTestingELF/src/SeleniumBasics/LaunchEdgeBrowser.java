package SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.msedge.driver","D:\\Downloads\\edgedriver_win64");
         //EdgeDriver driver=new EdgeDriver(); 
		
       System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver-win64\\chromedriver-win64") ;
       ChromeDriver driver=new ChromeDriver();
	}

}
