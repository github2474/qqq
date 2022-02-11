package cn.itclass.day01.Demo03;

import java.util.Random;

/*
* Random类用来生成随机数字，使用起来三个步骤
* 1、导包
* import java.util.Random
* 2、创建
* Random r = new Random ();
* 3、使用
* 获得一个随机的int数字（范围是int所有范围，有正负两种）： int num = r.nextInt();
* 获取一个随机int数字（参数代表范围左闭右开区间）：int num = r.nextInt(3);
* 实际上含义是：[0,3),也是0~2
* */
public class Demo01Random{

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是"+num);
    }
}
