package cn.itclass.classdemo.demo03;

public class Zi extends Fu{
    int num = 50;
    public void method(){
        int num = 20;
        System.out.println(num);//20 局部变量
        System.out.println(this.num);//50 本类变量
        System.out.println(super.num);//100 父类变量
    }
}
