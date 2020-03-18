package excelsheetdata;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	
     public static void main(String[] args) throws Exception  {
		
    	 //convert physical fir or external file to java object
    	 FileInputStream fis = new FileInputStream("C:\\Users\\abc\\Desktop\\Balmiki.xlsx");
    	 
    	 //open workbook in readable mode
    	  Workbook wb = WorkbookFactory.create(fis);
    	 
    	 //to get the sheet and get the row and get the cell to value
    	   String value =wb.getSheet("Sheet1").getRow(1).getCell(3).toString();    
    	  
    	  //print the value on console
    	  System.out.println(value);
    	
	}
}
