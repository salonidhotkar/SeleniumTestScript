package SeleniumTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithSBI {

	public static void main(String[] args) {
     

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.linkText("Forgot Username / Login Password")).click();
		
		 Set<String> WindowId = driver.getWindowHandles();
	    for(String Window:WindowId)
	    {
	    	driver.switchTo().window(Window);
	    	if(driver.getCurrentUrl().contains("https://retail.onlinesbi.sbi/retail/troubleloginhome.htm?bankCode=0"))
	    	{
	    		driver.findElement(By.id("nextStep")).click();
	             driver.manage().window().maximize();
	    		
	    				
	    	}
	    	
	    	
	}
	    Dimension size = driver.manage().window().getSize();
	    System.out.println("height:"+size.getHeight());
	    System.out.println("width:"+size.getWidth());
	    Dimension di=new Dimension(932,1652);
	    
	     driver.findElement(By.id("userName")).sendKeys("saloni");
	     driver.findElement(By.id("go")).click();
	     Alert alt = driver.switchTo().alert();
	     System.out.println(alt.getText());
	     alt.accept();
     
	   driver.findElement(By.id("accountNo")).sendKeys("12345");
	   driver.findElement(By.id("go")).click();
	   Alert alt1 = driver.switchTo().alert();
	   System.out.println(alt1.getText());
	   alt.accept();
       
	   driver.findElement(By.id("accountNo")).sendKeys("123456789245");
	   driver.findElement(By.id("go")).click();
	   Alert alt2 = driver.switchTo().alert();
	   System.out.println(alt2.getText());
	   alt.accept();
	   
	  WebElement dropdown = driver.findElement(By.id("selCountry"));
	   
	   Select country=new Select(dropdown);
	   country.selectByVisibleText("India");
	   
	   
	  driver.findElement(By.id("mobileNo")).sendKeys("789444");
	  driver.findElement(By.id("go")).click();
	   Alert alt3 = driver.switchTo().alert();
	   System.out.println(alt3.getText());
	   alt.accept(); 
	   
	   
	 driver.findElement(By.id("mobileNo")).sendKeys("9876543219");
     driver.findElement(By.id("go")).click();
     Alert alt4 = driver.switchTo().alert();
	 System.out.println(alt4.getText());
	 alt.accept(); 
	 
	 driver.findElement(By.id("datepicker5")).sendKeys("32/12/2025");
     driver.findElement(By.id("go")).click();
     Alert alt5 = driver.switchTo().alert();
	 System.out.println(alt5.getText());
	 alt.accept(); 
	 
	 driver.findElement(By.id("datepicker5")).sendKeys("5/13/2023");
     driver.findElement(By.id("go")).click();
     Alert alt6 = driver.switchTo().alert();
	 System.out.println(alt6.getText());
	 alt.accept(); 
	 
	 driver.findElement(By.id("datepicker5")).sendKeys("05/02/2023");
     driver.findElement(By.id("go")).click();
     Alert alt7 = driver.switchTo().alert();
	 System.out.println(alt7.getText());
	 alt.accept(); 
	 
	 driver.findElement(By.name("captchaValue")).sendKeys("BF82A");
	}

	
	}

