package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader4 {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir") + "\\KT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("July");
		
		int rowNum1 = sh.getLastRowNum();
		System.out.println(rowNum1);
		int rowNum2 = sh.getPhysicalNumberOfRows();
		System.out.println(rowNum2);
		for (int i=0;i<rowNum2;i++)
		{
            XSSFRow row = sh.getRow(i);
            XSSFCell cel = row.getCell(0);
           printValueOfCellAccordingToCellType(cel);
           cel = row.getCell(1);
           printValueOfCellAccordingToCellType(cel);
            
   		}
		
		
		

	}
	
	public static void printValueOfCellAccordingToCellType(XSSFCell cel)
	{
		switch (cel.getCellType()) {
		case STRING:
			System.out.println(cel.getStringCellValue());
			
			break;
		case BOOLEAN:
			System.out.println(cel.getBooleanCellValue());
			
			break;
		case NUMERIC:
			System.out.println(cel.getNumericCellValue());
			
			break;
		case FORMULA:
			System.out.println(cel.getCellFormula());
			
			break;
		case BLANK:
			System.out.println("Cell does not have anything");
			
			break;
		default:
			System.out.println("We do not have cell type case written");
			break;
		}
        
        
	}

}
