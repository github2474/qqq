package cn.itclass.java核心.集合.list;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
*List接口的使用
* 特点：1 有序 有下标 2 可以重复
*
* */
public class demo01 {
    public static void main(String[] args) {
        //先创建集合对象
        List list = new ArrayList<>();
        //1添加元素
        list.add("pg");
        list.add("hw");
        list.add("xm");
        System.out.println("元素个数"+list.size());
        System.out.println(list);
        //2.删除
        //list.remove(1);
        System.out.println("元素个数"+list.size());
        System.out.println(list);
        //3.遍历
        //1for
        System.out.println("for");
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        //2增强for
        System.out.println("增强for");
        for (Object object: list
             ) {
            System.out.println(object);
        }
        //3使用迭代器
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //使用列表迭代器listIterator 区别，可以向前，向后遍历，还可以增删改
        ListIterator lit = list.listIterator();
        System.out.println("---列表迭代器从前往后---");
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("---列表迭代器从后往前---");
        while (lit.hasPrevious()){
            System.out.println(lit.previous());
        }
        //4判断
        System.out.println(list.contains("hw"));
        System.out.println(list.isEmpty());
        //5获取位置
        System.out.println(list.indexOf("hw"));
    }
}
