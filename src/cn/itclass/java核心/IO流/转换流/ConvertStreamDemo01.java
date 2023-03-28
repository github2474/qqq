package cn.itclass.java核心.IO流.转换流;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ConvertStreamDemo01 {
    public static void main(String[] args) throws IOException {
        /*
        //利用转换流按照指定字符编码读取
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbkfile1.txt"),"GBK");
        int ch ;
        while((ch = isr.read())!=-1){
            System.out.println((char)ch);
        }
        //3释放资源
        isr.close();*/
        FileReader fr = new FileReader("gbkfile1.txt", Charset.forName("GBK"));
        int ch ;
        while((ch = fr.read())!=-1){
            System.out.print((char)ch);
        }
        //3释放资源
        fr.close();
    }
}
