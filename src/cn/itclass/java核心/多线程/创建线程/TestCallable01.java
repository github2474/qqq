package cn.itclass.java核心.多线程.创建线程;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

//线程创建方式三:实现callable接口
public class TestCallable01 implements Callable {
    private String url;
    private String name;
    public TestCallable01(String url,String name){
        this.url=url;
        this.name=name;
    }
    //下载图片线程的执行体
    @Override
    public Object call() throws Exception {
        WebDownloader wd = new WebDownloader();
        wd.downloader(url,name);
        System.out.println("下载了文件："+name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable01 t1 = new TestCallable01("http://henan.china.com.cn/pic/2022-03/21/dc181fbe-6f29-45fb-a8de-e5fd74604728.jpg","1.jpg");
        TestCallable01 t2 = new TestCallable01("http://henan.china.com.cn/pic/2022-03/21/dc181fbe-6f29-45fb-a8de-e5fd74604728.jpg","2.jpg");
        TestCallable01 t3 = new TestCallable01("http://henan.china.com.cn/pic/2022-03/21/dc181fbe-6f29-45fb-a8de-e5fd74604728.jpg","3.jpg");

        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);

        //获取结果：
        boolean rs1 = r1.get();
        boolean rs2 = r2.get();
        boolean rs3 = r3.get();

        //关闭服务
        ser.shutdownNow();
    }
}

