package cn.itclass.Scanner.Demo01;

import java.util.Scanner;

/*
* 题目：
* 输入三个数字，求出最大
* 思路：
* 1、用到scanner
* 2、Scanner三要素：导包创建使用
* 3、三个int 调三次Scanner，
* 4、无法三个数比较
* （1）先比较第1 第2 个
* （2）再把大的和第三个比较
* 5、输出最大
*
* */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();
        int temp = a > b ? a : b ;
        int max  = c > temp ? c : temp ;
        System.out.println("最大的数是："+max);


    }
}
