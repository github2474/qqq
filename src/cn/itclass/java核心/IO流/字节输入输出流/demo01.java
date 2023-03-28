package cn.itclass.java核心.IO流.字节输入输出流;


import java.io.FileOutputStream;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileOutputStream fout = new FileOutputStream("../javalearning/a.txt");
        //2.写出数据
        fout.write('h');
        //释放资源
        fout.close();
    }
}
