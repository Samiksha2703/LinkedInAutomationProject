/**
 * Description : ReadExcelFile.java is file which is having functionality for reading file.
 * Author      : Samiksha Shende
 * Date        : 30/05/2021
 */

package com.bridgelabz.linkedin.utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcelFile {
    XSSFSheet sheet;
    XSSFWorkbook wb;

    public ReadExcelFile(String excelFilePath) {
        try {
            File s = new File(excelFilePath);
            FileInputStream stream = new FileInputStream(s);
            wb = new XSSFWorkbook(stream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getRowCount(int sheetIndex) {
        int row = wb.getSheetAt(sheetIndex).getLastRowNum();
        row = row + 1;
        return row;
    }

    public String getData(String sheetName, int row, int column) {
        sheet = wb.getSheet(sheetName);
        String data = sheet.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
}
