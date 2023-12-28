package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WriteAMethodWhichAcceptDropDown {
	
	public void selectLastOption(WebElement dropDrownElement)
	{
		Select ListBox=new Select(dropDrownElement);
		int totalNoOfOptions=ListBox.getOptions().size();
		ListBox.selectByIndex(totalNoOfOptions-1);
	}

	
		
			
		
	

}
