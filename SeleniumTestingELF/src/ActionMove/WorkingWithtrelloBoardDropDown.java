package ActionMove;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithtrelloBoardDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitewait=new WebDriverWait(driver,Duration.ofSeconds(25));
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("salonidhotkar05@gmail.com");
		driver.findElement(By.id("login")).click();
	
		explicitewait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("password")).sendKeys("T@nuj@1234",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@title='Subjects']")).click();
		WebElement sourcefile = driver.findElement(By.linkText("In Progress"));
		WebElement subject = driver.findElement(By.xpath("//h2[text()='Selenium']/../../..//button[text()='Add a card']"));
		WebElement manualfrom = driver.findElement(By.linkText("To do"));
		WebElement manual = driver.findElement(By.xpath("//h2[text()='Java']/../../..//button[text()='Add a card']"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(sourcefile, subject).perform();
		
		Actions act=new Actions(driver);
		act.dragAndDrop(manualfrom, manual).perform();
		
		

	}

}
