package com.tester.learn.tools.readTxt;

import org.json.simple.JSONObject;

import java.io.*;

/**
 * Created by leosong on 16-1-12.
 */
public class Test {

    public File getFile() throws IOException
    {
        File file = null;
        Class<?> claz = getClass();
        ClassLoader classLoader = claz.getClassLoader();
        file = new File(classLoader.getResource("ShangHai.txt").getFile());
        return file;
    }

    public static void main(String[] args)
    {
        Test test = new Test();
        File shangHaiFile = null;
        JSONObject objAll = new JSONObject();
        try{
            shangHaiFile = test.getFile();
            BufferedReader br = new BufferedReader(new FileReader(shangHaiFile));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int counter =0;
            while(line != null)
            {
                String[] data = line.toString().split(" ");
                if(data[0] != null && data[1] !=null)
                {
                    objAll.put("\"" + data[0] + ".SS" + "\"", data[1]);
                }

                line = br.readLine();
                counter++;
            }

            String strFilePath = Test.class.getResource("").getPath();
            File outPutFile = new File(strFilePath + "outputSS.json");
            try
            {
                FileWriter fileWriter = new FileWriter(outPutFile);
                fileWriter.write(objAll.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            } catch(Exception e)
            {
                System.out.println(e.getMessage());
            }



        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}
