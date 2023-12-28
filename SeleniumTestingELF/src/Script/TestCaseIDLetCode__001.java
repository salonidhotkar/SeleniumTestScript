package Script;

/***
 * @author User
 */
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCaseIDLetCode__001 {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
        
     
		//step to read data from excel
		File file=new File("./resources/LetCode.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		String email = workbook.getSheet("sheet1").getRow(8).getCell(6).toString();
		String password = workbook.getSheet("Sheet1").getRow(9).getCell(6).toString();
		
		//Expected Result
		String welcomepageTitle="";
		String HomePageURL="https://letcode.in/";
		String LoginURL="https://letcode.in/signin";
		
		
		//step 1:launch Browser Enter the URL
		  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		  driver.get("https://letcode.in/signin");
		  
		 String WelcomepageTitle = driver.getTitle();
		 if(WelcomepageTitle.equals(WelcomepageTitle))
		 {
			 System.out.println("Welcome page should Display");
		 }else	
		 {
			 System.out.println("Welcome page is not Displayed");
		 }
		 
		 //Step:2 .Click on LogIn button
		WebElement LoginButton = driver.findElement(By.linkText("Log in"));
		LoginButton.click();
	     String login = driver.getCurrentUrl();
	     if(login.equals(LoginURL))
	     {
	    	 System.out.println("Login page Should Display");
	     }else
	     {
	    	 System.out.println("Login page is not Diplayed");
	     }
		
		 //Step3:Enter Email addresss
		 WebElement EmailId = driver.findElement(By.name("email"));
		 EmailId.clear();
		 EmailId.sendKeys(email);
		 String EmailIDTextBox = EmailId.getAttribute("value");
		 
		 if(EmailIDTextBox.equals(email))
		 {
			 System.out.println("Valid Email should be Entered");
		 }else
		 {
			 System.out.println("Valid Email is not Entered");
		 }
		  
		//Step3:Enter Password
		 WebElement Password = driver.findElement(By.name("password"));
		 Password.clear();
		 Password.sendKeys(password);
		 String passwordTextBox = Password.getAttribute("value");
		 
		 if(passwordTextBox.equals(password))
		 {
			 System.out.println("Valid password should be Entered");
		 }else
		 {
			 System.out.println("Valid password is not Entered");
		 }
		  
		//Step:4 
		//Test step 5 : Click on SignIn button
			driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("New Course!")));
			String HomePage = driver.getCurrentUrl();
			System.out.println(HomePage);
			if (HomePage.equals(HomePageURL)) {
				System.out.println("Home page is displayed");
			} else {
				System.out.println("Home page is not displayed");
			}
		
		
		
		
		
	}

}
