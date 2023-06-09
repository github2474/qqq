package cn.itclass.Scanner.Demo01;
import java.util.Scanner;//导包
/*
* Scanner类
*
* 引用类型的一般使用步骤：
* 1、导包
* import 包路径.类名称;
* 如果要用的类和当前类在同一个包下，可以不写。
*只有java.lang包下的内容不需要导包，其他都需要import
*
* 2、创建
* 类名称 对象名 = new 类名称；
*
* 3、使用
* 对象名.成员方法名();
*
* 获取键盘输入的一个int数字    String str = sc.nextInt();
* 字符串    String str = sc.next();
* */
public class Demo01Scanner {
    public static void main(String[] args) {
        //创建
        //system.in 从键盘输入
        Scanner sc = new Scanner(System.in);
        //获取数字
        int num = sc.nextInt();
        System.out.println("输入的数字是"+ num);
        //获取字符串
        String str = sc.next();
        System.out.println("输入的字符串是"+ str);
    }
}
