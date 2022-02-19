package cn.itclass.day04.demo04;
/*
* 父子类继承关系中，创建子类对象，访问成员方法的规则：
*
*
* */

public class Zi extends Fu {

    public void methodZi(){
        System.out.println("子类方法执行!");
    }

    public void method(){
        System.out.println("zi重名方法执行！");
    }
}
