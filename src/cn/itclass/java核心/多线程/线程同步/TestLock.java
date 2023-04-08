package cn.itclass.java核心.多线程.线程同步;

import cn.itclass.java核心.多线程.线程状态.TestJoin;

import java.util.concurrent.locks.ReentrantLock;

//测试Lock
public class TestLock {
    public static void main(String[] args) {
        TestLock2 t1 = new TestLock2();
        new Thread(t1,"大黄").start();
        new Thread(t1,"小黄").start();
        new Thread(t1,"黄牛").start();
        new Thread(t1,"小明").start();
    }
}

class TestLock2 implements Runnable{
    int ticketNums = 10;

    //定义Lock锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try{
                lock.lock();//加锁
                if(ticketNums<=0){
                    break;
                }else{
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+ticketNums--);
                }
            } finally {
                //解锁
                lock.unlock();
            }
        }
    }
}
