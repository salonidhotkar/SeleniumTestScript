package browserAction;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.maybelline.com");
       
      //getsize
       Dimension Size =driver.manage().window().getSize();
       System.out.println("Height:"+Size.getHeight());
       System.out.println("width:"+Size.getWidth());
          
       //setsize
       Thread.sleep(3000);
       Dimension newSize=new Dimension(500,500);
       driver.manage().window().setSize(newSize);
       
       //getposition
       Point position=driver.manage().window().getPosition();
       int x=position.getX();
       int y=position.getY();
       System.out.println("position:"+position.getX());
       System.out.println("position:"+position.getY());
       //setposition
       Thread.sleep(4000);
       Point p=new Point(200,100);
       driver.manage().window().setPosition(p);
       
       
       
     
      
	}

}
