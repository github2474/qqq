package cn.itclass.java核心.多线程.线程同步;
//不安全
public class UnSafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket,"小黄").start();
        new Thread(buyTicket,"大黄").start();
        new Thread(buyTicket,"黄牛党").start();
        new Thread(buyTicket,"小王").start();

    }
}

class BuyTicket implements Runnable{

    //票
    private int ticketNums = 10;
    boolean flag = true;  //外部停止方式

    @Override
    public void run() {
        //买票
        while(flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //synchronized 同步方法，锁的是this
    private synchronized void buy() throws InterruptedException {
        //判断是否有票
        if(ticketNums<=0){
            flag=false;
            return;
        }
        Thread.sleep(100);
        //买票
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
