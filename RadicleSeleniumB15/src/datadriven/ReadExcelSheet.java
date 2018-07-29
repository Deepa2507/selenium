package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.testng.annotations.Test;

public class ReadExcelSheet {
	
	
	XSSFWorkbook wb;
	//HSSFWorkbook wb1;
	XSSFSheet sheet ;
	
	
	public ReadExcelSheet(String excelPath) throws InvalidFormatException, IOException{
		
		File srcFile = new File(excelPath);
		FileInputStream fis = new FileInputStream(srcFile);
		//Read excel file
		wb = new XSSFWorkbook(fis); //xlsx
		//wb1 = new HSSFWorkbook(fis); //xls
		//get sheet
		sheet = wb.getSheetAt(0);
		wb.close();
		
	}
	
	
	public String getCellData(int sheetNumber, int row, int column){
		
		//sheet =wb.getSheetAt(sheetNumber);
		String data0;
		try{
			data0 = sheet.getRow(row).getCell(column).getStringCellValue();
		}catch(Exception e){
			data0 = "";
		}
		return data0;
	}
	
	public int getRowCount(int sheetIndex){
		
		int rowCNT = wb.getSheetAt(sheetIndex).getLastRowNum();
		return rowCNT;
	}
	
	public int getColumnCount(int sheetIndex,int rowCount)
	{
		int temp =0;
		int ColumnCount=0;
		for(int i =0;i<rowCount;i++){
			ColumnCount= wb.getSheetAt(sheetIndex).getRow(i).getLastCellNum();
			if(temp<ColumnCount){
				temp =ColumnCount;
			}
			//System.out.println("temp :" + temp);
		}
		  if(temp>ColumnCount)
			  ColumnCount= temp;
	       return ColumnCount;
			
	}

}
