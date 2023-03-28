package cn.itclass.java核心.集合.Set;

/*
* TreeSet
* 基于排序顺序实现元素不重复（存储结构：红黑树）
* 实现了SortedSet接口，对集合元素自动排序
* 要求：元素对象的类型必须实现Comparable接口，指定排序规则  不用重写hashCode和equals
* 通过CompareTo方法确定是否为重复元素
*  compareTo 方法返回0 ，认为是重复元素
* */

import cn.itclass.java核心.集合.Student;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Student> treeSet = new TreeSet<>();
        //1，添加元素
        Student stu1 = new Student("zhangsan",19);
        Student stu2 = new Student("lisi",18);
        Student stu3 = new Student("wanger",15);
        Student stu4 = new Student("wanger",17);
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        treeSet.add(new Student("wanger",17));
        System.out.println(treeSet);

        //2
        treeSet.remove(new Student("wanger",17));
        //遍历
        for (Student s : treeSet
             ) {
            System.out.println(s);
        }
        Iterator<Student> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
