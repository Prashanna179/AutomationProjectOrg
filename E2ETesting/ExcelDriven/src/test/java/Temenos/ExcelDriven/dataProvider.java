package Temenos.ExcelDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	
	
	@Test(dataProvider = "getData")
	public void testcase1(String s1,String s2,String s3)
	{
		System.out.println(s1 + s2 + s3);
	}
	
	@DataProvider
	public static Object[][] getData() throws IOException
	{
		
		//Excel Sheet Data Driven Method
		FileInputStream file = new FileInputStream("C:\\UserDrive\\Prashan\\ExcelDemo.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("sample");
		System.out.println("***" + wb.getSheetName(1) + "worksheet ***");
		//To get how many rows
		int rowsCount = sheet.getPhysicalNumberOfRows();
		XSSFRow firstrow = sheet.getRow(0);
		//to get how many columns
		int colCount = (int)firstrow.getLastCellNum();
		
		//Creating multi array based on rows and columns count
		Object data[][] = new Object[rowsCount-1][colCount];
		
		
		for(int i=0;i<rowsCount-1;i++)
		{
			XSSFRow row = sheet.getRow(i+1);
			
			for(int j=0;j<colCount;j++)
			{
				XSSFCell c = row.getCell(j);
				if(c.getCellType()==CellType.STRING)
				{
					data[i][j]=c.getStringCellValue();
				}
				else
				{
					
				data[i][j]=NumberToTextConverter.toText(c.getNumericCellValue());
				}
			}
		}
		return data;
		
		
		/*for(int i=0;i<rowsCount-1;i++)
		{
			for(int j=0;j<colCount;j++)
			{
					System.out.println(data[i][j]);
			}
		}*/
		
		
		//Normal method
		//Object data[][]= {{"hello","text",1},{"Bye","Message",2},{"Hi","Call",3}};
		//return data;
	}

}


