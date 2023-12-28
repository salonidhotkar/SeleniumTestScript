package Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class workingWithRediffMail {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitwait=new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("login")).sendKeys("sumanthELFBatch@rediffmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.xpath("//input[@id='TO_IDcmp2']")).sendKeys("sumanthELFbatch@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'rd_inp_sub rd_subject_datacmp2')]")).sendKeys("Saloni");
		WebElement textbox = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
	
		driver.switchTo().frame(textbox);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Greeting of the Day!");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		explicitwait.until(ExpectedConditions.invisibilityOf(textbox));
		File source1 = driver.getScreenshotAs(OutputType.FILE); 
		File pageFile=new File("./RediffScreenshot/page.png");
		FileHandler.copy(source1, pageFile);
		driver.navigate().refresh();
		 
		driver.findElement(By.xpath("//a[@class='mr_icon2 rd_mail_trash masterTooltip']/../../../..//li[@subject='Saloni']")).click();
		explicitwait.until(ExpectedConditions.invisibilityOf(textbox));
		File source2 = driver.getScreenshotAs(OutputType.FILE);
		File deleteFile=new File("./RediffScreenshot/delete.png");
		FileHandler.copy(source2, deleteFile);
		
		driver.findElement(By.linkText("Delete")).click();
		explicitwait.until(ExpectedConditions.invisibilityOf(textbox));
		File source3 = driver.getScreenshotAs(OutputType.FILE);
		File deleteFile1=new File("./RediffScreenshot/delete1.png"); 
		FileHandler.copy(source3, deleteFile1);
	}

}
