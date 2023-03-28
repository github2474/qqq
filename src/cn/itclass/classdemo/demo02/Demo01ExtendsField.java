package cn.itclass.classdemo.demo02;
/*
* 在父类的继承关系中，如果成员变量重名，则创建子对象时，访问有两种方法
*
* 直接访问：通过子类对象访问成员变量：等号左边是谁，就先优先用谁，没有则向上找
*
* 间接通过成员方法访问成员变量：
*   方法属于谁，就有优先用谁，没有则向上找。
*
*
* */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();

        System.out.println("fu:"+fu.numFu);

        Zi zi = new Zi();

        System.out.println("Zi:"+zi.numZi);

        //等号左边是谁。就先优先用谁
        System.out.println(zi.num);

        zi.methodZi();
        //打印出的是fu的num。方法属于谁，就有优先用谁，没有则向上找。
        zi.methodFu();

    }
}
