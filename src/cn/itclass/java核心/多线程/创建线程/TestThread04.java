package cn.itclass.java核心.多线程.创建线程;
//多个线程操作同一个对象
//买火车票

//发现问题：多个线程操作同一个资源，线程不安全，数据紊乱
public class TestThread04 implements Runnable{

    private int ticketNums =100;

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
        TestThread04 tt4 = new TestThread04();
        new Thread(tt4,"小明").start();
        new Thread(tt4,"老师").start();
        new Thread(tt4,"黄牛").start();
        new Thread(tt4,"小黄").start();
        new Thread(tt4,"小兴").start();
    }
}
