package NotifictaionPopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.easemytrip.com/");
		
//		Robot robot=new Robot();
//	
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//	
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//	     robot.keyPress(KeyEvent.VK_ENTER);
//	    
//	     robot.keyRelease(KeyEvent.VK_TAB);
//	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	}

}
