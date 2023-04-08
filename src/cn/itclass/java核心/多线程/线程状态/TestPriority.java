package cn.itclass.java核心.多线程.线程状态;
//测试优先级
public class TestPriority extends Thread{

    public static void main(String[] args) {
        //主线程，默认优先级
        System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getPriority());
        //
        MyPriority myPriority = new MyPriority();

        Thread thread1 = new Thread(myPriority);
        Thread thread2 = new Thread(myPriority);
        Thread thread3 = new Thread(myPriority);
        Thread thread4 = new Thread(myPriority);
        Thread thread5 = new Thread(myPriority);
        Thread thread6 = new Thread(myPriority);

        //先设置优先级，再启动
        thread1.start();
        thread2.setPriority(1);
        thread2.start();
        thread3.setPriority(3);
        thread3.start();
        thread4.setPriority(Thread.MAX_PRIORITY);
        thread4.start();
        thread5.setPriority(5);
        thread5.start();
        thread6.setPriority(6);
        thread6.start();
    }
}
class MyPriority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getPriority());
    }
}
