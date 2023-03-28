package cn.itclass.java核心.IO流.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
练习一：拷贝
需求：拷贝一个文件夹，考虑子文件夹
* */
public class test01 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\你好\\Documents\\Scanned Documents");
        File dest = new File("C:\\Users\\你好\\Documents\\Downloads");
        //拷贝方法
        copydir(src,dest);
        try(FileInputStream fin = new FileInputStream("C:\\Users\\你好\\Documents\\Scanned Documents");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\你好\\Documents\\Downloads");
        ){
            byte[] bytes = new byte[1024];
            int len;
            while((len = fin.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void copydir(File src, File dest) throws IOException {
        dest.mkdirs();
        //递归
        //1进入数据源
        File[] files = src.listFiles();
        //2遍历数组
        for(File file :files){
            if(file.isFile()){
                //3判断文件，拷贝  文件开始，文件结束
                FileInputStream fin = new FileInputStream(file);    //目录，文件名
                // 文件
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while((len=fin.read(bytes))!=-1){
                    fos.write(bytes,0,len);
                }
                fos.close();
                fin.close();
            }else{
                //4判断文件夹，递归
                copydir(file,new File(dest,file.getName()));
            }
        }
    }
}
