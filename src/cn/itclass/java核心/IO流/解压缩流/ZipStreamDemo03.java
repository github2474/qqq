package cn.itclass.java核心.IO流.解压缩流;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo03 {
    public static void main(String[] args) throws IOException {
        /*
        * 把daily压缩
        *
        * */
        //1.创建File对象表示要压缩的文件夹
        File src = new File("daily");
        //2.创建File对象表示压缩包放哪里
        File destParent = src.getParentFile();
        //3.创建File对象表示压缩包的路径
        File dest = new File(destParent,src.getName()+".zip");
        //4.创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //5.获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
        toZip(src,zos,src.getName());
        //6.释放资源
        zos.close();
    }
    /*
    * 数据源
    * 压缩流
    * 压缩包内部路径
    * */
    public static void toZip(File src,ZipOutputStream zos,String name) throws IOException {
        //1.进入src文件夹
        File[] files = src.listFiles();
        //2.遍历数组

        for(File file:files){
            if(file.isFile()){
                //3.判断-文件，变成ZipEntry对象，放入到压缩包中
                ZipEntry entry = new ZipEntry(name+"\\"+file.getName());
                zos.putNextEntry(entry);
                //读取文件写到压缩包
                FileInputStream fis = new FileInputStream(file);
                int b;
                while((b=fis.read())!=-1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else{
                //4.判断-文件夹，递归
                toZip(file,zos,name+"\\"+file.getName());

                // 添加空的ZipEntry对象来表示该文件夹
                if (file.listFiles().length == 0) {
                    ZipEntry entry = new ZipEntry(name + "/" + file.getName() + "/");
                    zos.putNextEntry(entry);
                    zos.closeEntry();
                }
            }

        }
    }
}
