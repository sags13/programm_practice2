package testPack02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFIle {
	
	public static void main(String args[]) throws EncryptedDocumentException, IOException, FileNotFoundException {
		
		String file_path = "E:\\FIleOperation\\demo1.xlsx";
		
		FileInputStream file1 = new FileInputStream(file_path);
		String pwd_11 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue(); 
		System.out.println(pwd_11);
	}

}
