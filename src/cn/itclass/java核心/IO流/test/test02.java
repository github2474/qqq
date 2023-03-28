package cn.itclass.java核心.IO流.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test02 {
    public static void main(String[] args) throws IOException {
        //^ 异或   两边相同：false,两边不同：true
        //1.创建对象关联原始文件
        FileInputStream fin = new FileInputStream("C:\\Users\\你好\\Pictures\\Saved Pictures\\222.jpg");
        //2.创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("C:\\Users\\你好\\Pictures\\Saved Pictures\\333.jpg");
        //3.加密处理
        int b;
        while ((b= fin.read())!=-1){
            fos.write(b^2);
        }
        //4.释放资源
        fos.close();
        fin.close();
    }
}
