package ___Common_Utilities;

import java.io.FileInputStream;

import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class _EXCEL_Utilities 
{
	public static FileInputStream input_of_original_file;
	
	public static FileOutputStream output_of_original_file;
	
	public static Workbook excel_workbook;
	
	public static Sheet excel_sheet_name;
	
	public static Row row;
	
	public static Cell column;
	
	public static CellStyle cell_style;
	
	public static Font font;
	
	public _EXCEL_Utilities(String Excel_File_Path) throws Throwable
	{
		input_of_original_file = new FileInputStream(Excel_File_Path);
		
		/* excel_workbook = new XSSFWorkbook(input_of_original_file); */
		excel_workbook = WorkbookFactory.create(input_of_original_file);
	}
	
	public static int get_Rows_Count(String Excel_File_Path, String Excel_Sheet_name) throws Throwable
	{	
		excel_sheet_name = excel_workbook.getSheet(Excel_Sheet_name);
		
		int total_Rows_Count = excel_sheet_name.getLastRowNum();
		
		return total_Rows_Count;
	}
	
	public static short get_Columns_Count(String Excel_File_Path, String Excel_Sheet_name, int row_position) throws Throwable
	{	
		excel_sheet_name = excel_workbook.getSheet(Excel_Sheet_name);
		
		row = excel_sheet_name.getRow(row_position);
		
		short total_Columns_Count = row.getLastCellNum();
		
		
		return total_Columns_Count;
	}
	
	public static String get_String_Data(String Excel_File_Path, String Excel_Sheet_name, int row_position, int column_position) throws Throwable
	{
		String input_Data;
		
		excel_sheet_name = excel_workbook.getSheet(Excel_Sheet_name);
		
		row = excel_sheet_name.getRow(row_position);
		
		try
		{
			column = row.getCell(column_position);
			
			input_Data = column.getStringCellValue();
		}
		catch(Exception e)
		{
			input_Data = "";
			
			System.err.println("No DATA Found. ");
		}
		
		
		
		return input_Data;
	}
	
	public static double get_Numeric_Data(String Excel_File_Path, String Excel_Sheet_name, int row_position, int column_position) throws Throwable
	{
		double input_Data;
		
		excel_sheet_name = excel_workbook.getSheet(Excel_Sheet_name);
		
		row = excel_sheet_name.getRow(row_position);
		
		try
		{
			column = row.getCell(column_position);
			
			input_Data = column.getNumericCellValue();
		}
		catch(Exception e)
		{
			input_Data = 0;
			
			System.err.println("No DATA Found. ");
		}
		
		
		return input_Data;
	}
	
	public static boolean get_Boolean_Data(String Excel_File_Path, String Excel_Sheet_name, int row_position, int column_position) throws Throwable
	{
		boolean input_Data;
		
		excel_sheet_name = excel_workbook.getSheet(Excel_Sheet_name);
		
		row = excel_sheet_name.getRow(row_position);
		
		try
		{
			column = row.getCell(column_position);
			
			input_Data = column.getBooleanCellValue();
		}
		catch(Exception e)
		{
			input_Data = false;
			
			System.err.println("No DATA Found. ");
		}
		
		
		return input_Data;
	}
	
	public static String get_Any_kind_of_Data_in_String_format(String Excel_File_Path, String Excel_Sheet_name, int row_position, int column_position) throws Throwable
	{
		String input_data = "";
		
		if(excel_workbook.getSheet(Excel_Sheet_name).getRow(row_position).getCell(column_position).getCellType()  == CellType.NUMERIC)
		{
			int Column_DATA = (int) excel_workbook.getSheet(Excel_Sheet_name).getRow(row_position).getCell(column_position).getNumericCellValue();
			
			input_data = String.valueOf(Column_DATA);
		}
		else
		{
			input_data = excel_workbook.getSheet(Excel_Sheet_name).getRow(row_position).getCell(column_position).getStringCellValue();
		}
		
		return input_data;
	}
	
	public static void Set_Data_to_Field(String Excel_File_Path, String Excel_Sheet_name, int row_position, int column_position, String Status_Data) throws Throwable
	{	
		excel_sheet_name = excel_workbook.getSheet(Excel_Sheet_name);
		
		row = excel_sheet_name.getRow(row_position);
		
		column = row.createCell(column_position);
		
		column.setCellValue(Status_Data);
		
		output_of_original_file = new FileOutputStream(Excel_File_Path);
		
		excel_workbook.write(output_of_original_file);
	}
	
	public static void fill_Field_with_Green_Colour(String Excel_File_Path, String Excel_Sheet_name, int row_position, int column_position) throws Throwable
	{
		excel_sheet_name = excel_workbook.getSheet(Excel_Sheet_name);		
		row = excel_sheet_name.getRow(row_position);
		column = row.getCell(column_position);
		font = excel_workbook.createFont();
		
		cell_style = excel_workbook.createCellStyle();
		cell_style.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
		cell_style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		font.setBold(true);
		cell_style.setFont(font);
		
		column.setCellStyle(cell_style);
		
		output_of_original_file = new FileOutputStream(Excel_File_Path);
		
		excel_workbook.write(output_of_original_file);
	}
	
	public static void fill_Field_with_Red_Colour(String Excel_File_Path, String Excel_Sheet_name, int row_position, int column_position) throws Throwable
	{
		excel_sheet_name = excel_workbook.getSheet(Excel_Sheet_name);		
		row = excel_sheet_name.getRow(row_position);
		column = row.getCell(column_position);
		font = excel_workbook.createFont();
		
		cell_style = excel_workbook.createCellStyle();
		cell_style.setFillForegroundColor(IndexedColors.RED.getIndex());
		cell_style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		font.setBold(true);
		cell_style.setFont(font);
		
		column.setCellStyle(cell_style);
		
		output_of_original_file = new FileOutputStream(Excel_File_Path);
		
		excel_workbook.write(output_of_original_file);
	}
	
}
