package cn.itclass.java核心.IO流.字节输入输出流;

import java.io.*;

public class demo02 {
    public static void main(String[] args) {
        char ch;
        int data;
        try(FileInputStream fin = new FileInputStream(FileDescriptor.in);
            FileOutputStream fout = new FileOutputStream("F:/日志/text01.txt");) {
            System.out.println("请输入，以#结尾：");
            while((ch=(char)fin.read())!='#'){
                fout.write(ch);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("文件没找到");
        }
        catch (IOException e){}

        try(FileInputStream fin = new FileInputStream("F:/日志/text01.txt");
            FileOutputStream fout = new FileOutputStream(FileDescriptor.out);)
        {
            while(fin.available()>0){
                data = fin.read();
                fout.write(data);
            }
        }
        catch (IOException e){ }

    }
}
