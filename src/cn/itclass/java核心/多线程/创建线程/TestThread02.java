package cn.itclass.java核心.多线程.创建线程;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import static org.apache.commons.io.FileUtils.copyURLToFile;

//练习Thread，实现多线程同步下载图片
public class TestThread02 implements Runnable{
    private String url;
    private String name;
    public TestThread02(String url,String name){
        this.url=url;
        this.name=name;
    }
    //下载图片线程的执行体
    @Override
    public void run() {
        WebDownloader wd = new WebDownloader();
        wd.downloader(url,name);
        System.out.println("下载了文件："+name);
    }

    public static void main(String[] args) {
        TestThread02 t1 = new TestThread02("http://henan.china.com.cn/pic/2022-03/21/dc181fbe-6f29-45fb-a8de-e5fd74604728.jpg","1.jpg");
        TestThread02 t2 = new TestThread02("http://henan.china.com.cn/pic/2022-03/21/dc181fbe-6f29-45fb-a8de-e5fd74604728.jpg","2.jpg");
        TestThread02 t3 = new TestThread02("http://henan.china.com.cn/pic/2022-03/21/dc181fbe-6f29-45fb-a8de-e5fd74604728.jpg","3.jpg");

        //同时执行，
        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
    }
}
//下载器
class WebDownloader{
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现异常");
        }
    }
}
