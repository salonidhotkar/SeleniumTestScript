package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSubmitAndGetText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demowebshop.tricentis.com/");
     
     driver.findElement(By.linkText("Log in")).click();
     Thread.sleep(2000);
    WebElement emailtextbox = driver.findElement(By.id("Email"));
    emailtextbox.clear();
    emailtextbox.sendKeys("salonidhotkar05@gmail.com");
    
    WebElement passwordtextbox = driver.findElement(By.id("Password"));
    passwordtextbox.clear();
    passwordtextbox.sendKeys("Salonghlhyn");
    driver.findElement(By.cssSelector("input[value='Log in']")).click();
    
//    String errormsg = driver.findElement(By.cssSelector("span[class='field-validation-error']")).getText();
//     System.out.println(errormsg);
//     
    String ErrorMessage=driver.findElement(By.cssSelector("div[ class='validation-summary-errors']")).getText();
    System.out.println(ErrorMessage);
	}

}
