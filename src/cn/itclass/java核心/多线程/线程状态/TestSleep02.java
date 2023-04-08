package cn.itclass.java核心.多线程.线程状态;

import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时
public class TestSleep02 {
    public static void tenDown() throws InterruptedException {
      int num=10;

      while(true){
          Thread.sleep(1000);
          System.out.println("倒计时 "+num--);
          if(num<=0){
              break;
          }
      }
    }

    public static void main(String[] args) throws InterruptedException {
        //打印当前系统时间
        Date Time= new Date(System.currentTimeMillis());//获取系统时间

        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(Time));
                Time = new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
