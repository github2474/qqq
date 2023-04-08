package cn.itclass.java核心.IO流.解压缩流;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /*
        *压缩流
        * */
        File src = new File("a.txt");
        File dest = new File("zip");
        toZip(src,dest);
    }
    public static void toZip(File src,File dest) throws IOException {
        //压缩本质:把每一个(文件/文件夹)看成ZipEntry对象放到压缩包中
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        //2.创建Zip对象
        ZipEntry entry = new ZipEntry("a.txt");
        //3.把ZipEntry对象放到压缩包中
        zos.putNextEntry(entry);
        //4.将src文件中数据写入压缩包
        FileInputStream fis = new FileInputStream(src);
        int b;
        while((b = fis.read())!=-1){
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
