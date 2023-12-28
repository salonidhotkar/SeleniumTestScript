package browserAction;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformFromBrowserHistory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.maybelline.co.in");
      driver.get("https://www.lakmeindia.com");
      driver.get("https://www.reneecosmetics.in");
      
      Thread.sleep(8000);
      Navigation navigation=driver.navigate();
      Thread.sleep(8000);
      navigation.back();
      Thread.sleep(8000);
      navigation.back();
      Thread.sleep(8000);
      navigation.forward();
      Thread.sleep(8000);
      navigation.refresh();
      Thread.sleep(4000);
      
      driver.close();
	}

}
