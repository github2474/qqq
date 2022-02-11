package cn.itclass.day01.Demo05;

import java.util.ArrayList;

/*
* 题目：
* 自定义4个学生对象，添加到集合，并遍历
* 思路：
* 1、自定义Student学生类，四个部分
* 2、创建一个集合，用来储存学生对象，泛型<Student>
* 3、根据类，创建四个学生对象
* 4、将四个学生对象添加到集合中
* 5、遍历集合 for size get
*
* */
public class Demo02ArraylistStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("小明",11);
        Student stu2 = new Student("Anastasia",18);
        Student stu3 = new Student("贺兴运",18);
        Student stu4 = new Student("小红",10);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "," + "年龄：" + stu.getAge());
        }

    }
}
