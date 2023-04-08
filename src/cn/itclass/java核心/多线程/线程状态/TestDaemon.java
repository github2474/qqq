package cn.itclass.java核心.多线程.线程状态;

public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();
        //守护线程
        Thread thread = new Thread(god);
        thread.setDaemon(true);
        thread.start();
        //你
        new Thread(you).start();

    }
}

class God implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("上帝保佑你！");
        }
    }
}

class You implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你一生都开心地活着");
        }
        System.out.println("-======goodbye!world!");//Hello,World!
    }
}
