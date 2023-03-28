package cn.itclass.java核心.集合.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection接口的使用
 * (1)添加元素
 * (2)删除元素
 * (3)遍历元素
 * (4)判断
 */
public class demo01 {
    public static void main(String[] args) {
        //创建一个集合
        Collection collection = new ArrayList();

         /** Collection接口的使用*/
         /**(1)添加元素*/
         collection.add("apple");
         collection.add("peach");
         collection.add("watermelon");
        System.out.println("元数个数"+collection.size());
        System.out.println(collection);
         /** (2)删除元素*/
         collection.remove("apple");
        System.out.println("元数个数"+collection.size());
        System.out.println(collection);
         /** (3)遍历元素【重点】*/
         //1,增强for
        System.out.println("遍历一");
        for (Object object: collection
             ) {
            System.out.println(object);
        }
        //2.迭代器
        /*
        hasNext() 有无下一个
        next()  获取下一个
        remove()  删除当前元素
        */
        System.out.println("遍历二");
        Iterator it = collection.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
            //不能使用collection的删除方法，会出现并发异常  collection.remove(s);
            //it.remove();
        }
        System.out.println("元数个数"+collection.size());
        /** (4)判断*/
        System.out.println(collection.contains("watermelon"));
        System.out.println(collection.isEmpty());
    }
}
