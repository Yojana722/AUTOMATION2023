package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Yojana\\new\\DEC2022\\Excel\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

		// 1. getStringCellValue() - to read String,char data
		String data1 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);

		String data2 = sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data2);
		System.out.println(data2.charAt(0));// A

		// 2. getNumericCellValue() - to read numeric data
		double data3 = sh.getRow(0).getCell(2).getNumericCellValue();// double
		System.out.println(data3);// 100.0

		// explicit casting
		int data = (int) data3;
		System.out.println(data);// 100
		
		//3. getBooleanCellValue() - to read boolean data
		boolean data4 = sh.getRow(0).getCell(3).getBooleanCellValue();
		System.out.println(data4);
		
		//4. getLastRowNum() - it returns number of rows from 0th index
		int rowSize = sh.getLastRowNum();
		System.out.println(rowSize);//2
		System.out.println(rowSize+1);//3 actual row count
		
		//5. getLastCellNum() -it returns number of values from specific row
		short cellSize = sh.getRow(3).getLastCellNum();
		System.out.println(cellSize);
	}
}
