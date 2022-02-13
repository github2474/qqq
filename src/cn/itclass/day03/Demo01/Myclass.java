package cn.itclass.day03.Demo01;

public class Myclass {
    int num ;// 成员变量
    static int numStatic; // 静态变量
    public void Method(){
        System.out.println("这是一个成员方法" );;
        System.out.println(num);
        System.out.println(numStatic);
    }
    public static void MethodStatic(){
        System.out.println("这是一个静态方法");
        System.out.println(numStatic);
        System.out.println(/*num*/);//不能访问成员变量
    }
}
