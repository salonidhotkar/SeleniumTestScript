package HiddenDivisionPopUps;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Local;

public class HowToHandleCalander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LocalDateTime ld= LocalDateTime.now();
		String mnt = ld.getMonth().name();
		mnt=mnt.substring(0, 1).toUpperCase()+mnt.substring(1).toLowerCase();
		int year = ld.getYear();
		int Day = ld.getDayOfMonth();
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.agoda.com/");
		try
		{
		  driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		}
		catch(org.openqa.selenium.NoSuchElementException se)
		{
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		Thread.sleep(2000);
		for(;;)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			try
			{
				driver.findElement(By.xpath("//div[text()='"+mnt+" "+(year+1)+"']/..//span[text()='"+(Day-2)+"']")).click();
				driver.findElement(By.xpath("//div[text()='"+mnt+" "+(year+1)+"']/..//span[text()='"+(Day-1)+"']")).click();
				break;
				
			}
			catch(org.openqa.selenium.NoSuchElementException ne)
			{
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
		
	}

}
