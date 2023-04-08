package cn.itclass.java核心.多线程.创建线程;

public class TestThread03 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("执行run：第"+i+"次");
        }
    }

    public static void main(String[] args) {
        //创建接口实现类对象
        TestThread03 tt3 = new TestThread03();
        //创建实现类对象，通过线程对象开启线程，代理
        new Thread(tt3).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("执行main：第"+i+"次");
        }
    }
}
