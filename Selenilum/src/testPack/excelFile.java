package testPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelFile {
	public static void main(String []args) throws EncryptedDocumentException, IOException {
		String path = "G:\\testing dummy file\\test1.xlsx";
		FileInputStream file = new FileInputStream (path);
		//String value  = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		//System.out.println(value);
		
		double num = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(num);
		
		
		
	
	}
	

}
