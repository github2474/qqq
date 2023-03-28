package cn.itclass.Scanner.Demo03;

import java.util.Random;

/*
* 题目要求：
* 根据int变量的值，来获取随机数字，范围是[1,n],也可以取到1也可以取到n;
*
* 思路：
* 1、定义一个int变量n，随意赋值；
* 2、要使用Random：三个步骤：导包、创建、使用
* 3、如果写10，0~9，想要1~10，可以发现整体加一即可
*
*
* */
public class Demo03Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();

        for (int i = 0; i < 10; i++) {

            int result = r.nextInt(n)+1;
            System.out.println(result);
        }
    }
}
