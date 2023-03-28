package cn.itclass.java核心.集合.Map;

/*
*   HasMap ：jdk1.2 线程不安全，null可以作为key和value
*   HashTable ：jdk1.0 线程安全，运行效率慢，不允许null作为key或value
*   Properties ：HashTable的子类，要求key和value都是String。【通常用于配置文件的读取】
*
* 1.HashTable刚创建时，table是null，加入第一个元素，table的容量变成16；
* 2.当元素个数大于阈值(16*0.75=12)时，会进行扩容，扩容大小为原来的二倍，目的是减少调整元素的个数
* 3.jdk8 当链表长度大于8，且数组个数大于等于64时，会调整为红黑树，目的是提高效率。
* 4.jdk8 当链表长度小于6，调整成链表
* 5.jdk8以前，链表是头插入，jdk8以后是尾插入
* */

import cn.itclass.java核心.集合.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo01 {

    public static void main(String[] args) {
        //创建集合
        HashMap<Student,String> students = new HashMap<>();
        //添加元素
        Student stu1 = new Student("liming",19);
        Student stu2 = new Student("wangzi",12);
        Student stu3 = new Student("liuer",14);
        students.put(stu1,"上海");
        students.put(stu2,"西安");
        students.put(stu3,"北京");
        //
        students.put(new Student("liuer",14),"杭州");
        System.out.println(students);
        //删除
        //students.remove(new Student("liuer",14));
        System.out.println(students);

        //遍历
        //for
        System.out.println("----for----");
        for (Student stu : students.keySet()
             ) {
            System.out.println(stu+"="+students.get(stu));
        }
        //entrySet 最快
        System.out.println("----entrySet----");
        for (Map.Entry<Student, String> entry : students.entrySet()) {
            System.out.println(entry);
        }

        //判断
        System.out.println(students.containsKey(new Student("lisi",12)));
        System.out.println(students.containsValue("北京"));

    }

}
