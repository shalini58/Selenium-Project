package learnTestNg;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {

		//Setup Path for Excel
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//Read Data from Excel
		XSSFSheet ws = wb.getSheetAt(0);
		
		//no of row count
		int rowCount = ws.getLastRowNum();
		
		//no of column count
		short columnCount = ws.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][columnCount];
		
		for (int i = 1; i <= rowCount ; i++) {
			for (int j = 0; j < columnCount ; j++) {
				XSSFRow row = ws.getRow(i);
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j] = cellValue;
			}
			
		}
		
		/*
		 * XSSFRow row = ws.getRow(1);
		 * 
		 * XSSFCell cell = row.getCell(0);
		 * 
		 * String data = cell.getStringCellValue();
		 * 
		 * System.out.println(data);
		 */
		
		wb.close();
		return data;
	}

}
