package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Working_With_BrowserAction {
	
	public static void main(String[] args) {
		  
		
		//ChromeDriver driver= new ChromeDriver();
		//driver.get("https://www.google.co.in");
		
		//FirefoxDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.co.in");
		
		//WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.co.in");
		
		//upcasting to achive runtime polymorphism 		
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.co.in");
		
		//WebDriver driver=new SafariDriver();
		//driver.get("https://www.google.co.in");
		
		
	}

}
