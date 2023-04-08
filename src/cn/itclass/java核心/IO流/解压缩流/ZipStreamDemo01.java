package cn.itclass.java核心.IO流.解压缩流;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //1.创建一个File表示要解压的压缩包
        File src = new File("C:\\Users\\你好\\Desktop\\SnakeGame.zip");
        //2.创建一个File表四解压的目的地
        File dest = new File("C:\\Users\\你好\\Desktop\\SnakeGameDest");
        unzip(src,dest);
    }
    //定义一个方法用来解压
        public static void unzip(File src,File dest) throws IOException {
            //解压的本质:把每一个ZipEntry按照层级拷贝到本地另一个文件夹中.

            //解压缩流
            ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
            //先获取到zip中每一个zipentry对象
            ZipEntry entry ;
            while((entry=zip.getNextEntry())!=null){
                System.out.println(entry);
                if(entry.isDirectory()){
                    //文件夹：需要在目的地dest创建一个同样的文件夹
                    File file = new File(dest,entry.toString());
                    file.mkdirs();
                }else{
                    //文件：需要读取到压缩包中的文件，并把它存放到对应的dest文件夹中
                    int b;
                    FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                    while((b= zip.read())!=-1){
                        fos.write(b);
                    }
                    fos.close();
                    //表示压缩包中的一个文件处理完了
                    zip.closeEntry();
                }
            }
            zip.close();

        }
}
