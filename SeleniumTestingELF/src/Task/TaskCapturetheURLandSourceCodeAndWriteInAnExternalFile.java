package Task;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCapturetheURLandSourceCodeAndWriteInAnExternalFile {


		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
	    
			//System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
			//EdgeDriver driver=new EdgeDriver();
			//driver.get("https://www.amazon.in/in");
			
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com"); 
			String titleOfthepage=driver.getTitle()+"\n";
			String url=driver.getCurrentUrl()+"\n";
			System.out.println(titleOfthepage);
			System.out.println(url);
			
			File file=new File("TitleUrl.txt");
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("FileCreated");
			}
			else
			{
				System.out.println("FileisAlreadyCreated");
			}
			
			FileOutputStream f1=new FileOutputStream(file);
			f1.write(titleOfthepage.getBytes());
			f1.write(url.getBytes());
		}
}
