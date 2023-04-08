package cn.itclass.java核心.多线程.线程状态;
//测试stop
/*1、建议线程正常停止-->利用次数，不建议死循环
* 2、建议使用标志位-->设置一个标志位
* 3、不要使用stop或者destroy过时方法
* */
public class TestStop implements Runnable{

    //设置一个标志位
    private boolean flag = true;

    @Override
    public void run() {
        int i =0;
        while(flag){
            System.out.println("run ... Thread "+i++);
        }
    }

    //设置一个公开的方法停止线程
    public void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TestStop ts = new TestStop();
        new Thread(ts).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main "+i);
            if(i==900){
                //调用stop
                ts.stop();
                System.out.println("线程该停止了");
            }
        }
    }
}
