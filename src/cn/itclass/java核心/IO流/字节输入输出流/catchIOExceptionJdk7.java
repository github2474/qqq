package cn.itclass.java核心.IO流.字节输入输出流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class catchIOExceptionJdk7 {
    public static void main(String[] args) {


        try( FileInputStream fin = new FileInputStream("F:\\图片\\0f5f08e65b4d2d20a8e41e42a999f91e.jpeg");
             FileOutputStream fout = new FileOutputStream("../javalearning/img.jpeg")){

            //拷贝
            int len;
            byte[] bytes = new byte[1024*1024*5];
            while ((len = fin.read(bytes)) != -1) {
                fout.write(bytes,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
