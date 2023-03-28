package cn.itclass.java核心.IO流.转换流;

import java.io.*;

public class ConvertStreamDemo04 {
    public static void main(String[] args) throws IOException {
        /*
        * 利用字节流读取文件数据，每次读一行，不能乱码
        * 1.字节流在读取中文时，是会出现乱码的，但是字符流可以搞定
        * 2.字节流里面没有读一整行数据的，只有字符缓冲流可以*/
        /*FileInputStream fis = new FileInputStream("a.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        System.out.println(str);
        br.close();*/
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt")));
        String str = br.readLine();
        System.out.println(str);
        br.close();
    }
}
