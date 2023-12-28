package browserAction;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String Source=driver.getPageSource();
		System.out.println(Source);
		
		File f1=new File("SourceCode.txt");
		if(!f1.exists())
		{
			System.out.println("File is AlreadyCreated");
		}
		
		else
		{
			System.out.println("Fi");
		}
		
	}

}
