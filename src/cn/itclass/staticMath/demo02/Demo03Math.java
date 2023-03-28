package cn.itclass.staticMath.demo02;
/*
* java.util.Math类是数学相关的工具类，
* 里面提供了大量的静态方法，完成与数学运算相关的操作
*
* 获得绝对值： absalutely
* public static double abs(double num)
* 向上取整：
* public static double ceil(double num)
* 向下取整：
* public static double floor(double num)
* 四舍五入：
* public static long round(double num)
*
* Math.PI 代表（double） Π
* */
public class Demo03Math {

    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(-666));//666
        //向上
        System.out.println(Math.ceil(1.98));//2.0
        System.out.println(Math.ceil(1.0));//1.0
        //向下,抹零
        System.out.println(Math.floor(-0.22));//-1.0
        System.out.println(Math.floor(1.001));//1.0
        //45，，不带小数点
        System.out.println(Math.round(2.34));//2

        System.out.println(Math.random());
        System.out.println(Math.PI);
    }

}
