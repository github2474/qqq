package cn.itclass.java核心.IO流.字符输入输出流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamdemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("../javalearning/a.txt");
        FileWriter fw = new FileWriter("../javalearning/b.txt",true);
        System.out.println(System.currentTimeMillis());
        char[] chars = new char[1024*1024];
        int len;
        while((len =fr.read(chars)) != -1){
            fw.write(chars,0,len);
        }
        System.out.println(System.currentTimeMillis());
        fw.close();
        fr.close();

    }
}
