package cn.itclass.day03.demo01;

public class Demo03StaticStudent {

    public static void main(String[] args) {
        //
        Student.room = "101教室";
        Student one = new Student("郭炯",20);
        System.out.println("one的姓名是：" + one.getName());
        System.out.println("one的姓名是：" + one.getAge());
        System.out.println("one的姓名是：" + Student.room);
        System.out.println("===================================");

        Student two = new Student("黄蓉",18);
        System.out.println("two的姓名是：" + two.getName());
        System.out.println("two的年龄是：" + two.getAge());
        System.out.println("two的教室是：" + Student.room);



    }

}
