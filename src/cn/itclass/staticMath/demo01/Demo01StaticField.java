package cn.itclass.staticMath.demo01;
/*
* 一个成员变量使用了static ，那么这个变量不在属于自己，而属于所在的类。多个对象共享一份数据
*
*
*
* */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭子",18);
        Student two = new Student("小玲",19);
        one.room ="101教室";

        System.out.println("姓名：" + one.getName()
                + "，年龄：" + one.getAge() + "，教室：" + one.room
                + "，学号：" + one.getId());
        System.out.println("姓名：" + two.getName()
                + "，年龄：" + two.getAge() + "，教室：" + two.room
                + "，学号：" + two.getId());
    }

}
