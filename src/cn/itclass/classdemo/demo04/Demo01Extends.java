package cn.itclass.classdemo.demo04;
/*
* 在父子类继承关系中，创建子类对象时，访问成员方法的规则：
*   创建的对象是谁就优先用谁，如果没有则向上找
*
* 注意事项：
* 无论成员方法还是成员变量，如果没有，都向上找
*
* 重写（Override）
* 概念: 在继承关系中，方法名一样，方法的参数也一样
* 重写（Override）：方法名一样，方法的参数也一样
* 重载（Overload）：方法名一样，方法的参数不一样
*
* @Override写在前面，用来检测是否重写成功
* */
public class Demo01Extends {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodZi();
        zi.methodFu();

        //子类执行
        zi.method();


    }

}
