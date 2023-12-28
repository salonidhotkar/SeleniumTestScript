package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingWithScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.olaelectric.com/");
	    File source1 = driver.getScreenshotAs(OutputType.FILE);
		File pageFile=new File("./ErrorShot/page.jpeg");
		FileHandler.copy(source1, pageFile);
	    
	    File source=driver.findElement(By.xpath("//a[@aria-label='store logo']")).getScreenshotAs(OutputType.FILE);
		File destFile=new File("./ErrorShot/ola2.jpeg");
		FileHandler.copy(source, destFile);
		//driver.findElement(By.)
	}

		
	

}
