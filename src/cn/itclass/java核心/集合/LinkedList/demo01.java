package cn.itclass.java核心.集合.LinkedList;

import cn.itclass.java核心.集合.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
* LinkedList
* 存储结构：双向链表
*
* */
public class demo01 {
    public static void main(String[] args) {
        //创建集合
        LinkedList linkedList=new LinkedList<>();
        Student stu1 = new Student("张三",19);
        Student stu2 = new Student("李四",18);
        Student stu3 = new Student("王二",15);
        //1
        linkedList.add(stu1);
        linkedList.add(stu2);
        linkedList.add(stu3);
        //2
        //linkedList.remove(new Student("王二",15));
        System.out.println(linkedList);
        //3
        for (int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
        System.out.println("---for---");
        for (Object o:linkedList
             ) {
            System.out.println(o);
        }
        System.out.println("---iterator---");
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("---lit---");
        ListIterator lit = linkedList.listIterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        //4
        System.out.println(linkedList.contains("aaa"));
        System.out.println(linkedList.isEmpty());
        //5
        System.out.println(linkedList.indexOf(new Student("王二",15)));
    }
}
