package com.readdata;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception {
		readData();
	}
	
	public static void readData() throws Exception {
		
		String filepath = "D:\\Vijay\\Dataold.xls";
		FileInputStream fs = new FileInputStream(filepath);
		HSSFWorkbook wb = new HSSFWorkbook(fs);
	HSSFSheet sh =wb.getSheet("vijay");
	int totalrows = sh.getLastRowNum();
	System.out.println("Total number of rows:"+ totalrows);
	for(int i=0; i<=totalrows; i++) {
	HSSFRow row =	sh.getRow(i);
	int totalcolumns = row.getLastCellNum();
	for(int j=0; j<totalcolumns; j++) {
	HSSFCell cell =	row.getCell(j);
	
	System.out.print(cell.getStringCellValue()+"\t");
	}
	System.out.println(" ");
	

	}
	
	}
		
		
	}


