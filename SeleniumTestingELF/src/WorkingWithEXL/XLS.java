package WorkingWithEXL;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XLS {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
   
		File file=new File("./resources/MyExcel.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		String Data1 = workbook.getSheet("Sheet1").getRow(9).getCell(3).getStringCellValue();
		boolean Data2 = workbook.getSheet("Sheet2").getRow(12).getCell(5).getBooleanCellValue();
		double Data3 = workbook.getSheet("Sheet3").getRow(5).getCell(2).getNumericCellValue();
		LocalDateTime Data4 = workbook.getSheet("Sheet4").getRow(12).getCell(14).getLocalDateTimeCellValue();
		
		System.out.println( Data1);
		System.out.println(Data2);
		System.out.println(Data3);
		System.out.println(Data4);
		
	}

}
