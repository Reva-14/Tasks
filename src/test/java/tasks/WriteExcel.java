package tasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\91917\\eclipse-workspace\\Tasks\\target\\Task.xlsx");
	FileOutputStream output = new FileOutputStream(f);
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.createSheet("Tasks");
	XSSFRow row = sheet.createRow(0);
	XSSFCell cell = row.createCell(0);
	cell.setCellValue("Revathy");
	workbook.write(output);
}}
	