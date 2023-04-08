package cn.itclass.java核心.多线程.线程状态;
//测试join
public class TestJoin implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程vip来了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //启动线程
        TestJoin testjoin = new TestJoin();
        Thread thread = new Thread(testjoin);
        thread.start();

        //主线程
        for (int i = 0; i < 1000; i++) {
            if(i==200){
                thread.join();
            }
            System.out.println("Main "+i);
        }
    }
}
