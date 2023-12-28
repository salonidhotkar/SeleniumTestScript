package AuthanticationPopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWithRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
	 	// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(1000);
		
//		Robot robot =new Robot();
//		robot.keyPress(KeyEvent.VK_S);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_L);
//		robot.keyPress(KeyEvent.VK_O);
//		robot.keyPress(KeyEvent.VK_N);
//		robot.keyPress(KeyEvent.VK_I);
//		Thread.sleep(1000);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//		robot.keyPress(KeyEvent.VK_S);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_L);
//		robot.keyPress(KeyEvent.VK_O);
//		robot.keyPress(KeyEvent.VK_N);
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyPress(KeyEvent.VK_0);
//		robot.keyPress(KeyEvent.VK_5);
//		Thread.sleep(1000);
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
		
		
		
		
		
		
	}

}
