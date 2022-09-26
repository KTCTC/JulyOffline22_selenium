package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir") + "\\KT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("July");
		
		XSSFRow row = sh.getRow(2);
		
		XSSFCell cel = row.getCell(1);
		
		String data = cel.getStringCellValue();
		System.out.println(data);
		
		String str = sh.getRow(2).getCell(0).getStringCellValue();
		System.out.println(str);
		
		System.out.println(String.valueOf(cel));
		

	}

}
