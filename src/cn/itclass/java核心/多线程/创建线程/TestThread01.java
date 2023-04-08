package cn.itclass.java核心.多线程.创建线程;
//自定义线程类继承Thread类
public class TestThread01 extends Thread{
//重写run()方法，编写线程执行体

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.println("我是test");
        }
    }

    public static void main(String[] args) {
        //主线程
        //创建线程对象，调用start()方法启动线程
        new TestThread01().start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是Main");
        }
    }

}
