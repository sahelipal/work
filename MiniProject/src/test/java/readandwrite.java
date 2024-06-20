import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readandwrite {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\demo\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(rows).getLastCellNum();
		for(int r=0;r<=rows;r++) {
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<cols;c++) {
				String value=currentRow.getCell(c).toString();
				System.out.println(value);
			}
		}
		wb.close();
		file.close();
		
		FileOutputStream file1=new FileOutputStream(System.getProperty("user.dir")+"\\demo\\Book1.xlsx");
		XSSFWorkbook wb1=new XSSFWorkbook();
		XSSFSheet sheet1=wb.createSheet();
		XSSFRow row1=sheet1.createRow(0);
		row1.createCell(0).setCellValue("monalis");
		row1.createCell(1).setCellValue("baba");
		
		wb1.write(file1);
		wb1.close();
		file1.close();
		System.out.println("writing done");
		
	}

}
