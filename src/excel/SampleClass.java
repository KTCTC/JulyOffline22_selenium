package excel;

import java.util.ArrayList;

public class SampleClass {

	public static void main(String[] args) {

ExcelHelper excelHelper = new ExcelHelper("KT.xlsx", "July");

ArrayList<String> data = excelHelper.getColumnList(1);
System.out.println(data);
 System.out.println(excelHelper.getKeyValuePair());
 System.out.println(excelHelper.getKeysList());
 System.out.println(excelHelper.getValuesList());
 


	}

}
