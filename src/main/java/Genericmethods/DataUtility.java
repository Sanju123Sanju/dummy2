package Genericmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	/**
	 * get the data from excel/ datautility file
	 * @param shname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Throwable
	 */
	public String getFetchdataFromExcel(String shname, int rownum, int cellnum) throws Throwable {
		
		FileInputStream fis= new FileInputStream(finalVariables.EXCELPATH);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh= book.getSheet(shname);
		DataFormatter df= new DataFormatter();
		String data= df.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		
		return data;
		
		
	}
	
public void getWritedataFromExcel(String shname, int rownum, int cellnum, String data) throws Throwable {
		
		FileInputStream fis= new FileInputStream(finalVariables.EXCELPATH);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh= book.getSheet(shname);
		Row ro= sh.createRow(rownum);
		ro.createCell(cellnum).setCellValue(data);
	    FileOutputStream fos= new FileOutputStream(finalVariables.EXCELPATH);
		book.write(fos);
		
	}
/**
 *   Description purpose of method or author
 * 
 * 
 */

// single line comments  within method / single line description


/*
 
 
 multiple line comments
 
 */

/**
 * get the last row number of datautility file
 * @param shname
 * @return
 * @throws Throwable
 */
public int getLastRowNumdataFromExcel(String shname) throws Throwable {
	
	FileInputStream fis= new FileInputStream(finalVariables.EXCELPATH);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh= book.getSheet(shname);
	int lastrowNum= sh.getLastRowNum();
	return lastrowNum;
	
}
public int getEveryRowLastCellNumdataFromExcel(String shname, int rownum) throws Throwable {
	
	FileInputStream fis= new FileInputStream(finalVariables.EXCELPATH);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh= book.getSheet(shname);
	Row ro = sh.getRow(rownum);
    int	lastcellNum= ro.getLastCellNum();
	return lastcellNum;
	
}

public ArrayList<String> getEveryRowNumLastCellNumdataFromExcel(String shname) throws Throwable {
	
	FileInputStream fis= new FileInputStream(finalVariables.EXCELPATH);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh= book.getSheet(shname);
	int row= sh.getLastRowNum();
	ArrayList<String> rowcell = new ArrayList<String>();
	for(int i=0 ;i<=row;i++) {
	Row ro= sh.getRow(i);
	int cell= ro.getLastCellNum();
	rowcell.add(i+","+cell);
	}
	return rowcell; 
}

}

