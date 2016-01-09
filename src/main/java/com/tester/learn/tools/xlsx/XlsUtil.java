package com.tester.learn.tools.xlsx;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by U0138272 on 1/9/2016.
 */
public class XlsUtil {

    private static int SHENZHEN_GEM_SHEET = 2;
    private static int SHENZHEN_A_SHEET = 3;
    private static int SHENZHEN_B_SHEET = 4;
    private static int SHENZHEN_SME = 6;


    public File getFile() throws IOException
    {
       InputStream is = null;
       Workbook wb = null;
       Class<?> claz = getClass();
       File file = null;
        try
        {
            ClassLoader classLoader = claz.getClassLoader();
            file = new File(classLoader.getResource("Shenzhen-Abbreviation.xlsx").getFile());
            System.out.println(file);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return file;
    }

    public HashMap<String,String> readXlsx(File file,int sheetNum)
    {
        Workbook wb = null;
        HashMap<String,String> hmResults = new HashMap<>();
        try
        {
            InputStream in = new FileInputStream(file);
            System.out.println(in);
            wb = new XSSFWorkbook(in);
            Sheet sheet = wb.getSheetAt(sheetNum);
            System.out.println(sheet);
            Iterator<Row> rows = sheet.rowIterator();
            while(rows.hasNext())
            {
                Row row = rows.next();
                if(row.getRowNum() == 0) continue;
                String strStockCode = row.getCell(0).getStringCellValue().toString();
                String strCompanyAbb = row.getCell(1).getStringCellValue().toString();

                if (strStockCode != null && strCompanyAbb != null)
                {
                    hmResults.put(strStockCode,strCompanyAbb);
                }
            }

        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return hmResults;
    }

    public String convertMapToJson()
    {
        System.out.println("converted to json ");
        return new String();
    }

    public void writeJsonToFile()
    {
        System.out.println("write to json");
    }


    public static void main(String[] args)
    {
        HashMap<String,String> hmStockCodeAndCompany = null;
        XlsUtil xu = new XlsUtil();
        try{
          File xlsxFile =  xu.getFile();
          hmStockCodeAndCompany = xu.readXlsx(xlsxFile,SHENZHEN_GEM_SHEET);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(hmStockCodeAndCompany);
    }
}
