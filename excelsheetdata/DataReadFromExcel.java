package excelsheetdata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataReadFromExcel {

	  public static void main(String[] args) throws Exception {
		
		File source = new File("./Data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(source);
		
		//open workbook in readable mode
		Workbook wb = WorkbookFactory.create(fis);
		//to get sheet
		Sheet sheet = wb.getSheetAt(0);
		
		 //to get the row and get the cell to value
 	   String value =sheet.getRow(1).getCell(1).toString();    
 	  
 	  //print the value on console
 	  System.out.println(value);
	}
}
