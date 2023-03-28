package cn.itclass.classdemo.demo03;
/*
* 局部变量和成员变量的差别
* 局部变量     直接写局部变量名
* 本类成员变量   this.成员变量名
* 父类成员变量   super.成员变量名
* */
public class Demo01Extends {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();

    }
}
