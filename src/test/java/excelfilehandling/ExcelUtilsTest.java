package excelfilehandling;

public class ExcelUtilsTest {
	public static void main(String[] args) {
		
		String excelpath="./exceldata/Data.xlsx";
		String sheetname="Sheet1";
		ExcelUtils utils = new ExcelUtils(excelpath, sheetname);
		utils.getRowCount();
		utils.getCellData(1,0);
		utils.getCellData(2, 2);
		
	}

}
