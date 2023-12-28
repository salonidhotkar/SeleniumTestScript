package JsPop_ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertOnW3School {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		Thread.sleep(1000);
		System.out.println(text);
		alt.sendKeys("hello Friends");
		Thread.sleep(2000);
		alt.dismiss();
		
		
	}

}
