package com.tester.learn.tools.xlsx;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by U0138272 on 1/9/2016.
 */
public class XlsUtil {

    private static int SHENZHEN_GEM_SHEET = 2;
    private static int SHENZHEN_A_SHEET = 3;
    private static int SHENZHEN_B_SHEET = 4;
    private static int SHENZHEN_SME = 6;
    private static String XLSX_FILE_NAME = "Shenzhen-Abbreviation.xlsx";


    public File getFile() throws IOException
    {
       InputStream is = null;
       Workbook wb = null;
       Class<?> claz = getClass();
       File file = null;
        try
        {
            ClassLoader classLoader = claz.getClassLoader();
            file = new File(classLoader.getResource(XLSX_FILE_NAME).getFile());
            System.out.println("file::"+file);
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

    public JSONObject convertMapToJson(HashMap<String,String> hmInfo)
    {
        System.out.println("converted to json ");
        JSONObject objAll = new JSONObject();
        Iterator it = hmInfo.entrySet().iterator();
        int i = 0;
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            objAll.put("\"" + pair.getKey()+".SZ" + "\"",pair.getValue());
            i++;
        }
        System.out.println("objArr" + objAll);
        return objAll;
    }

    public void writeJsonToFile(JSONObject jsonObj)
    {
        String strfilePath =  XlsUtil.class.getResource("").getPath();
        System.out.println("filePath==:  "+strfilePath);
        File outPutFile = new File(strfilePath + "output.json");
        System.out.println(outPutFile.getAbsolutePath());
        try{

            FileWriter fileWriter = new FileWriter(outPutFile);
            fileWriter.write(jsonObj.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String,String> hmStockCodeAndCompany = null;
        XlsUtil xu = new XlsUtil();
        try{
          File isXlsxFile =  xu.getFile();
          hmStockCodeAndCompany = xu.readXlsx(isXlsxFile,SHENZHEN_GEM_SHEET);
          JSONObject stockJsonObj = xu.convertMapToJson(hmStockCodeAndCompany);
          xu.writeJsonToFile(stockJsonObj);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(hmStockCodeAndCompany);

    }
}
