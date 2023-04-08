package cn.itclass.java核心.IO流.打印流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class printStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("a.txt"),true, Charset.forName("UTF-8"));
        //2.写出数据
        ps.printf("%s爱上了%s","a","b");
        //3.关流
        ps.close();
    }
}
