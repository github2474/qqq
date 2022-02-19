package cn.itclass.day05.demo02;
/*
* 继承关系中，父子类构造方法特点
*
* 1、子类构造方法当中有一个默认隐含的“super（）”，所以一定是先调用父类构造，后执行子类构造
* 2、可以通过super关键字来子类构造调用父类重载构造。
* 3、只有子类构造方法才能调用父类构造方法
*
* 总结：
* 子类必须必须调用super类，不写一定会【自动赠送】，super必须是【第一个】，只能【调用一次】。。
* */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();



    }
}
