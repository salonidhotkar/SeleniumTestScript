package Task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTitleAndURLStoreItInExternalFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com"); 
		String titleOfthepage=driver.getTitle()+"\n";
		String url=driver.getCurrentUrl()+"\n";
		System.out.println(titleOfthepage);
		System.out.println(url);
		
		FileOutputStream f1=new FileOutputStream("./FileURL/Data");
		f1.write(titleOfthepage.getBytes());
		f1.write(url.getBytes());
		
		FileInputStream f2=new FileInputStream("./FileURL/Data");
		int i=f2.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=f2.read();
		}
		
		
		
	}

}
