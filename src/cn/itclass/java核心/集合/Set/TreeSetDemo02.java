package cn.itclass.java核心.集合.Set;

import cn.itclass.java核心.集合.Student;

import java.util.Comparator;
import java.util.TreeSet;

/*
* TreeSet集合的使用
* Comparator:实现定制比较（比较器）
* Comparable：可比较的
*
*
*
* */
public class TreeSetDemo02 {
    public static void main(String[] args) {
        //创建集合,并指定比较规则。   可以用lambda，形参类型可以省略，
        TreeSet<Student> students =new TreeSet<>((o1,o2) -> {
                int n1 = o1.getName().compareTo(o2.getName());
                int n2 = o1.getAge()- o2.getAge();
                return n2==0?n1:n2;//谁是==0，谁先比较
        });

        Student stu1 = new Student("zhangsan",16);
        Student stu2 = new Student("lisi",18);
        Student stu3 = new Student("wanger",19);

        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        System.out.println(students);
    }
}
