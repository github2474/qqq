package cn.itclass.day01.Demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //
/*
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
*/

        //匿名
       /* int num = new Scanner(System.in).nextInt();
        System.out.println("输入的是"+num);*/

        //一般方法传参
       /* Scanner sc = new Scanner(System.in);
        methodParam(sc);*/

        //使用匿名对象传参
       /* methodParam(new Scanner(System.in));*/

        //使用匿名对象作为返回值
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是"+num);
    }
    public static  Scanner methodReturn(){
        return new Scanner(System.in);
    }

}
