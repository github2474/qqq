package cn.itclass.java核心.IO流.test;

import java.io.*;

public class test04 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //method1();  //5874.739秒
        //method2();  //26.83秒
        //method3(); //40.096秒   导手时间
        //method4(); //25.507秒
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0 + "秒");
    }

    private static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\电影\\111\\_E06.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream((new FileOutputStream("F:\\电影\\copy\\copy.mp4")));
        byte[] bytes = new byte[8192];
        int len ;
        while ((len= bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
    }

    private static void method3() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\电影\\111\\_E06.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream((new FileOutputStream("F:\\电影\\copy\\copy.mp4")));
        int b ;
        while ((b= bis.read())!=-1){
            bos.write(b);
        }
    }

    private static void method2() throws IOException {
        FileInputStream fin = new FileInputStream("F:\\电影\\111\\_E06.mp4");
        FileOutputStream fos = new FileOutputStream("F:\\电影\\copy\\copy.mp4");
        byte[] bytes = new byte[8192];
        int len ;
        while ((len= fin.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
    }

    private static void method1() throws IOException {
        FileInputStream fin = new FileInputStream("F:\\电影\\111\\_E06.mp4");
        FileOutputStream fos = new FileOutputStream("F:\\电影\\copy\\copy.mp4");
        int b ;
        while ((b= fin.read())!=-1){
            fos.write(b);
        }
    }
}
