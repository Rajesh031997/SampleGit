package datedrive;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadrivenex {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\rk156\\eclipse-workspace\\datedrive\\src\\main\\resources\\test.xlsx");
		FileOutputStream ss=new FileOutputStream(file);
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("testcase");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		Row row1 = sheet.createRow(1);
		Cell cell1 = row1.createCell(0);
		Row row2 = sheet.createRow(2);
		Cell cell2 = row2.createCell(0);
		cell.setCellValue("Rajesh");
		cell1.setCellValue("Sandy");
		cell2.setCellValue("alex");
		workbook.write(ss);
	}

}
