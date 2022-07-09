package datedrive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sampledata {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\rk156\\eclipse-workspace\\datedrive\\src\\main\\resources\\RK.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(stream);
	Sheet sheet = book.getSheet("Sheet1");
//	Row row=sheet.getRow(0);
//	Cell cell = row.getCell(1);
//	System.out.println(cell);
//int count= sheet.getPhysicalNumberOfRows();
//System.out.println(count);
//int ro=row.getPhysicalNumberOfCells();
//System.out.println(ro);
for (int i = 0; i<sheet.getPhysicalNumberOfRows(); i++) {
	Row row = sheet.getRow(i);
	for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		System.out.println(cell);
	
	}
	
	}


}
private void id() {
	System.out.println("123"); 
    System.out.println("432");


}
}




