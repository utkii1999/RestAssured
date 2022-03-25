package excelfilehandling;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {  
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelfilepath,String sheetname)
	{
		try {
			workbook=new XSSFWorkbook(excelfilepath);
			sheet=workbook.getSheet(sheetname);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
	}

	public static void getCellData(int row , int column)
	{
//		try {
//			String excelfilepath = "./exceldata/Data.xlsx";
////		---------------fOR .XLSX(latest extension)---------------
//			XSSFWorkbook workbook = new XSSFWorkbook(excelfilepath);
//			XSSFSheet sheet = workbook.getSheet("Sheet1");
//			
			
			DataFormatter formatter = new DataFormatter(); //works for all datatypes 
			Object value = formatter.formatCellValue(sheet.getRow(row).getCell(column));
			System.out.println(value);
			
			
			
//			String firstname=sheet.getRow(1).getCell(0).getStringCellValue();
//			System.out.println(firstname);
			
//			double subject_id = sheet.getRow(1).getCell(2).getNumericCellValue();
//			System.out.println(subject_id); //2.0 ----- two ways to correct either typecast or use formatter
		
//	}
//
//		catch (Exception e) {
//
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			e.printStackTrace();
//		}
	}

	public static void getRowCount() {

//		String project_path = System.getProperty("user.dir");  //C:\Users\acer\eclipse-workspace\RestAssuredProject
//		System.out.println(project_path);

//		try {
//			String excelfilepath = project_path+"/exceldata/Data.xlsx";

//			String excelfilepath = "./exceldata/Data.xlsx";
//		---------------fOR .XLSX(latest extension)---------------
//			XSSFWorkbook workbook = new XSSFWorkbook(excelfilepath);
//			XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		
			int rows = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows " + rows);

//		} catch (Exception e) {
//
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			e.printStackTrace();
//		}

	}

}
