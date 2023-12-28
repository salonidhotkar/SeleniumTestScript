import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Practiceall {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		Thread.sleep(2000);
		 WebElement click = driver.findElement(By.xpath("//span[text()='Fashion']"));
		 Actions act=new Actions(driver);
		 act.click(click).perform();
		WebElement category = driver.findElement(By.linkText("Men's Bottom Wear"));
		
		Actions at=new Actions(driver);
		at.click(category).click().perform();
		
		File flip = driver.getScreenshotAs(OutputType.FILE);
		File file=new File("./flipkart/ss.png");
		FileHandler.copy(flip, file);
		
		Dimension size= driver.manage().window().getSize();
		System.out.println("Height:"+size.getHeight());
		System.out.println("width:"+size.getWidth());
		
		Point position = driver.manage().window().getPosition();
		System.out.println("X:"+position.getX());
		System.out.println("Y:"+position.getY());
		
//		WebElement click = driver.findElement(By.linkText("Computers"));
//		
//		
//		Actions act=new Actions(driver);
//		act.click(click).perform();
//		
//		WebElement subclick = driver.findElement(By.linkText("Notebooks"));
//		Actions act1=new Actions(driver);
//		act1.click(subclick).perform();
//		
		
		
	}

}
