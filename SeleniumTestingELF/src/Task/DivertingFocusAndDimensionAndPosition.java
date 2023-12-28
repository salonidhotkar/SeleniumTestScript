package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class DivertingFocusAndDimensionAndPosition {


        public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
				driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();

				Thread.sleep(8000);
				Set<String> allWindowid = driver.getWindowHandles();

				for (String WindowId : allWindowid)
					
				{
					driver.switchTo().window(WindowId);
					System.out.println(driver.getTitle());
				
				Dimension size= driver.manage().window().getSize();
				System.out.println("Height is:"+size.getHeight());
				System.out.println("Width:"+size.getWidth());
				
				Thread.sleep(2000);
				Dimension newsize=new Dimension(600,600);
				driver.manage().window().setSize(newsize);
				
				Point Position=driver.manage().window().getPosition();
				System.out.println("x postion is:"+Position.x);
				System.out.println("y position is:"+Position.y);
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				Point targetPosition=new Point(20,30);
				driver.manage().window().setPosition(targetPosition);
				
				
				
				
				}
				
			}
		

	}


