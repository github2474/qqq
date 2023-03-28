package cn.itclass.java核心.IO流.转换流;

import java.io.*;
import java.nio.charset.Charset;

public class ConvertStreamDemo03 {
    public static void main(String[] args) throws IOException {
        /*
         * 将本地文件中的GBK文件，转成UFT-8
         * */
        /*//1.JDK11以前的方案
        InputStreamReader isr = new InputStreamReader(new FileInputStream("gbkfile1.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utffile.txt"),"UTF-8");
        int ch ;
        while((ch = isr.read())!=-1){
            osw.write(ch);
        }
        //3释放资源
        isr.close();
        osw.close();*/
        //2.替代方案
        FileReader fr = new FileReader("gbkfile1.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("utffile.txt",Charset.forName("UTF-8"));
        int ch;
        while ((ch=fr.read())!=-1){
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}
