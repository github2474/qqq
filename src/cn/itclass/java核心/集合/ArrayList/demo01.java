package cn.itclass.java核心.集合.ArrayList;

import cn.itclass.java核心.集合.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
* ArrayList使用
*
* */
public class demo01 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();
        Student stu1 = new Student("张三",19);
        Student stu2 = new Student("李四",18);
        Student stu3 = new Student("王二",15);
        //1
        arrayList.add(stu1);
        arrayList.add(stu2);
        arrayList.add(stu3);
        System.out.println(arrayList);
        //2重写equals
        arrayList.remove(new Student("王二",15));
        System.out.println(arrayList);
        //3
        Iterator it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        ListIterator lit = arrayList.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
        //4
        System.out.println(arrayList.contains(new Student("张三",19)));
        System.out.println(arrayList.isEmpty());
        //5
        System.out.println(arrayList.indexOf(new Student("张三",19)));
    }
}
