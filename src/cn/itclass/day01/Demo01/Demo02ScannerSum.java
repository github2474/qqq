package cn.itclass.day01.Demo01;

import java.util.Scanner;

/*
题目：键盘输入两个int数字，并就和
思路：
1、输入用scanner
2、Scanner的三个步骤：导包创建使用
3、需要两个数字，调用两次nextInt
4、得到两个数字，加在一起
5、打印
*/
public class Demo02ScannerSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入的第二个数：");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("结果是"+result);
    }
}
