package browserAction;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManagrBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.co.in");
		
		//get size
		Dimension size=driver.manage().window().getSize();
		System.out.println("Height:"+size.getHeight());
		System.out.println("Width:"+size.getWidth());
		
		//setsize
		Thread.sleep(3000);
		Dimension newsize=new Dimension(500,500);
		driver.manage().window().setSize(newsize);
		
		
		
		
		//getPosition
		Point position=driver.manage().window().getPosition();
		int x=position.getX();
		int y=position.getY();
		System.out.println("x position is:"+position.getX());
		System.out.println("Y position is:"+position.getY());
		
		//setPosition
		Thread.sleep(3000);
		Point targetPosition=new Point(100,200);
		driver.manage().window().setPosition(targetPosition);
		
		//maximize
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		//close
		Thread.sleep(4000);
		driver.close();
		

		
		
		
		
	}

}
