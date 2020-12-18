package com.java.test;

import java.io.*;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        //读取文件
        InputStreamReader isr = new InputStreamReader(new FileInputStream(new File("E://test.txt")), "UTF-8");
        int len = 0;
        while((len = isr.read())!=-1){
            System.out.print((char)len);
        }
        isr.close();
        System.out.println();
        //:
        File file = new File("E:\\test.txt");
        InputStream is = new FileInputStream(file);
        InputStreamReader ir = new InputStreamReader(is);
        BufferedReader bufr = new BufferedReader(ir);
        String line = null;
        while((line = bufr.readLine())!=null){
            System.out.println(line);
        }
        ir.close();
    }
}
