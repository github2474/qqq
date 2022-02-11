package cn.itclass.day01.Demo03;

import java.util.Random;
import java.util.Scanner;

/*
* 题目：猜数字
*
* 思路：
* 1、产生随机数字，不变化。用Random方法
* 2、需要键盘输入，需要Scanner
* 3、获得键盘数字，需要Scanner中的nextInt方法
* 4、得到两个数字，判断一下
* 5、
*
* */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int result  = r.nextInt(100)+1;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10 ; i++) {
            int num = sc.nextInt();
            if(num > result){
                System.out.println("猜大了，再试一下");
            }else if(num < result){
                System.out.println("猜小了，再试一下");
            }else{
                System.out.println("猜对了！");
                break;
            }
            Times(i);
            ShowResult(i);
        };

        System.out.println("游戏结束");
    }
    public static void ShowResult(int i){
        if (i==9){
            System.out.println("次数用完了。。。");
        }
    }
    public static void Times(int i){
        if(i<9) {
            int tmp = 9 - i;
            System.out.println("你还剩" + tmp + "次机会");
        }
    }
}
