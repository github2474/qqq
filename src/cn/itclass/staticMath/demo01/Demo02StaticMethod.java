package cn.itclass.staticMath.demo01;
/*
*
* 一旦使用static修饰成员方法，就成为静态方法，静态方法不属于对象，而属于类
* 没有static 必须先创建对象才能使用成员方法
*
* 注意事项：
* 1、静态不能直接访问非静态
* 原因：因为在内存中先有静态内容，后有非静态内容。
* 2、静态方法当中不能用this
* 原因：this代表当前对象，通过谁调用的方法，谁就是对象
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        //然后才能使用成员方法
        obj.Method();

        //对于静态方法，可以通过类名称直接调用
        Myclass.MethodStatic();


    }

    public static void myMethod(){
        System.out.println("自己的方法！");
        //静态方法不能用this
        //System.out.println(this);
    }
}
