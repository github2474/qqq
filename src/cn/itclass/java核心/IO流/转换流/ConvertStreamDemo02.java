package cn.itclass.java核心.IO流.转换流;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class ConvertStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //利用转换流按照指定字符编码写出
        /*//1.创建转换流的对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbkfile1.txt"),"GBK");
        //2.写出数据
        osw.write("你好你好");
        osw.close();*/
        FileWriter fw =  new FileWriter("gbkfile1.txt", Charset.forName("GBK"));
        //2.写出数据
        fw.write("你好你好咿呀咿呀呦");
        fw.close();
    }
}
