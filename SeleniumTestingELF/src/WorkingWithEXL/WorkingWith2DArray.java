package WorkingWithEXL;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWith2DArray {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
    

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		File file =new File("./resources/LetCode.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(file);
		
		int rowcount = workbook.getSheet("Sheet2").getPhysicalNumberOfRows();
		int cellscount = workbook.getSheet("Sheet2").getRow(0).getPhysicalNumberOfCells();
		
		String[][] arr=new String[rowcount][cellscount]; 
		
		for(int i=0; i<rowcount; i++)
		{
			for(int j=0; j<cellscount; j++)
			{
				arr[i][j]=workbook.getSheet("Sheet2").getRow(i).getCell(j).toString();
			}
		}
		
		
		for(int i=0; i<rowcount; i++) {
			for(int j=0; j<cellscount; j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			     System.out.println();
			
		}
			
		
		{
		
			
			System.out.println();
		}
		
		
	}

}
