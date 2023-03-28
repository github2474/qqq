package cn.itclass.java核心.IO流.字节输入输出流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyDemo01 {
    public static void main(String[] args) {
        FileInputStream fin=null;
        FileOutputStream fout=null;
        try {
            fin = new FileInputStream("F:\\图片\\0f5f08e65b4d2d20a8e41e42a999f91e.jpeg");
            fout = new FileOutputStream("../javalearning/img.jpeg");
            //读写
            int b;
            while((b = fin.read())!=-1){
                fout.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.释放
            if(fout!=null){
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fin!=null){
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
