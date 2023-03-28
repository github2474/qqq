package cn.itclass.java核心.IO流.字节输入输出流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("../javalearning/a.txt");
        int b;
        while((b = fis.read( ) ) != -1){
            System.out.print((char) b);
        }

        fis.close();

    }

}
