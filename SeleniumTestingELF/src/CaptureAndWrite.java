import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAndWrite {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String titleOfthePage=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println(titleOfthePage);
		System.out.println(url);
		 
		FileOutputStream f1=new FileOutputStream("./ToWrite/ToCapture");
		f1.write(titleOfthePage.getBytes());
		f1.write(url.getBytes());
		
		FileInputStream f2=new FileInputStream("./ToWrite/ToCapture");
		int i=f2.read();
		while(i!=-1)
		{
			System.out.print((char)i);
		     i=f2.read();
		     
		}
		
		
		
		
		
	}

}
