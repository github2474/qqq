package cn.itclass.java核心.集合.Map;

import cn.itclass.java核心.集合.Student;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap=new TreeMap<>((o1,o2)->{//定制迭代器
            int n1 = o1.getAge()-o2.getAge();
            int n2=o1.getName().compareTo(o2.getName());
            return n1==0?n2:n1;
        });
        Student stu1 = new Student("liming",19);
        Student stu2 = new Student("wangzi",12);
        Student stu3 = new Student("liuer",14);
        treeMap.put(stu1,"111");
        treeMap.put(stu2,"222");
        treeMap.put(stu3,"333");
        System.out.println(treeMap);
        //for
        System.out.println("---entrySet----");
        for (Map.Entry<Student,String> entry: treeMap.entrySet()
             ) {
            System.out.println(entry);
        }
        System.out.println("---keySet---");
        for (Student stu : treeMap.keySet()
             ) {
            System.out.println(stu+"="+treeMap.get(stu));
        }

    }
}
