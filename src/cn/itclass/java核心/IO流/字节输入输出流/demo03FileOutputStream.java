package cn.itclass.java核心.IO流.字节输入输出流;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo03FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("../javalearning/a.txt",true);
        //fout.write(97);
        /*byte[] bytes = {97,98,99,100};
        fout.write(bytes,1,3);*/
        String str = "abcdefghigklmn";
        byte[] bytes = str.getBytes();
        fout.write(bytes);
        fout.write('\r');
        String str2 = "666666666";
        byte[] bytes2 = str2.getBytes();
        fout.write(bytes2);
        fout.close();
    }
}
