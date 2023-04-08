package cn.itclass.java核心.多线程.线程同步;
//不安全的取钱
//两个人去银行取钱，账户
public class UnsafeBank{
    public static void main(String[] args) {
        //账户
        Account account = new Account(1000,"结婚基金");

        Drawing you = new Drawing(account,500,"you");
        Drawing girl = new Drawing(account,1000,"girl");

        you.start();
        girl.start();
    }
}

class Account{
    int money;//余额
    String name;//卡名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

//银行：模拟取款
class Drawing extends Thread{
    Account account;//账户
    //取了多少钱
    int drawingManey;
    //现在手里有多少钱
    int nowMoney;

    public Drawing(Account account,int drawingManey,String name){
        super(name);
        this.account = account;
        this.drawingManey = drawingManey;
        this.nowMoney = nowMoney;
    }

    //取钱

    @Override
    public void run() {
        //锁的对象是变化的量
        synchronized (account){
            //判断有没有钱
            if (account.money - drawingManey<0){
                System.out.println(Thread.currentThread().getName()+"钱不够，取不了");
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //卡内余额 = 余额 - 取出的钱
            account.money = account.money- drawingManey;
            //你手里的钱
            nowMoney = nowMoney + drawingManey;
            System.out.println(account.name+"余额为"+account.money);
            //Thread.currentThread().getName()= this.getName()
            System.out.println(this.getName()+"手里的钱"+nowMoney);
        }
    }
}