package cn.itclass.java核心.多线程.线程状态;

import cn.itclass.java核心.多线程.创建线程.TestThread04;

//模拟网络延时:放大问题的发生性
public class TestSleep implements Runnable{

    private int ticketNums =10;

    @Override
    public void run() {
        while (true){
            if(ticketNums<0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        TestSleep tt4 = new TestSleep();
        new Thread(tt4,"小明").start();
        new Thread(tt4,"老师").start();
        new Thread(tt4,"黄牛").start();
        new Thread(tt4,"小黄").start();
        new Thread(tt4,"小兴").start();
    }
}
