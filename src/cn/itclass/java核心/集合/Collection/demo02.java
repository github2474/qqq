package cn.itclass.java核心.集合.Collection;
import cn.itclass.java核心.集合.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* Collection  的使用，保存学生信息
*
*
* */
public class demo02 {
    public static void main(String[] args) {
        //新建Collection对象
        Collection collection = new ArrayList();
        Student stu1 = new Student("张三",19);
        Student stu2 = new Student("李四",18);
        Student stu3 = new Student("王二",15);
        //1添加数据
        collection.add(stu1);
        collection.add(stu2);
        collection.add(stu3);
        System.out.println("元素个数"+collection.size());
        System.out.println(collection);
        //2删除数据
        //collection.remove(new Student("王二",15)); 不能删除
        System.out.println("元素个数"+collection.size());
        System.out.println(collection);
        //3.遍历
        //1.for
        System.out.println("增强for:");
        for(Object object : collection ){
            System.out.println(object);
        }
        //2.iterator
        // hasNext();next();remove();
        System.out.println("iterator:");
        Iterator it = collection.iterator();
        while(it.hasNext()){
            Student stu = (Student) it.next();
            System.out.println(stu.toString());
        }
        //4.判断
        System.out.println("判断");
        System.out.println(collection.contains(stu1));
    }
}
