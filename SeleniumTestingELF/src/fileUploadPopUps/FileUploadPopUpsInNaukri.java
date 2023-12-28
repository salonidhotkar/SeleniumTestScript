package fileUploadPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUpsInNaukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/registration/createAccount");
		
		WebElement resume = driver.findElement(By.id("resumeUpload"));
		Actions act=new  Actions(driver);
		act.scrollToElement(resume).scrollByAmount(0, 100).perform();
		
		resume.sendKeys("D:\\Saloni\\cv resume\\resumejava,API.docx");
		
		
	}

	
	}


