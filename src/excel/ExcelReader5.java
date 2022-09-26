package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader5 {

	public static void main(String[] args) throws IOException {

		File f = new File(System.getProperty("user.dir") + "\\KT.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("July");
		
		int rowNum1 = sh.getLastRowNum();
		System.out.println(rowNum1);
		int rowNum2 = sh.getPhysicalNumberOfRows();
		System.out.println(rowNum2);
		
		ArrayList<String> keys = new ArrayList<>();
		ArrayList<String> values = new ArrayList<>();
		
		for (int i=1;i<rowNum2;i++)
		{
            XSSFRow row = sh.getRow(i);
            XSSFCell cel = row.getCell(0);
          String keyy = printValueOfCellAccordingToCellType(cel);
           cel = row.getCell(1);
         String val = printValueOfCellAccordingToCellType(cel);
         keys.add(keyy);
         values.add(val);
            
   		}
		
		
		

	}
	
	public static String printValueOfCellAccordingToCellType(XSSFCell cel)
	{
		Object dd =null;
		switch (cel.getCellType()) {
		case STRING:
			dd = cel.getStringCellValue();
			
			break;
		case BOOLEAN:
			dd = cel.getBooleanCellValue();
			
			break;
		case NUMERIC:
			dd = cel.getNumericCellValue();
			
			break;
		case FORMULA:
			dd = cel.getCellFormula();
			
			break;
		case BLANK:
			System.out.println("Cell does not have anything");
			
			break;
		default:
			System.out.println("We do not have cell type case written");
			break;
		}
        
        return dd.toString();
	}

}
