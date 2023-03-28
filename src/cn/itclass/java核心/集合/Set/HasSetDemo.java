package cn.itclass.java核心.集合.Set;

import cn.itclass.java核心.集合.Student;

import java.util.HashSet;
import java.util.Iterator;

/*
* HasSet集合的使用
* 存储结构：哈希表（数组+链表+红黑树）
* 存储过程(重复依据)
* 1.根据HashCode计算保存位置，如果位置为空，则直接保存，否则执行第二步
*   hashCode
*   1.31是质数，减少散列冲突。
*   2.提高效率，31*i=(i<<5)-i
* 2.再执行equals方法，如果equals方法为true，则认为是重复，否则，形成链表
* */
public class HasSetDemo {
    public static void main(String[] args) {
        //
        HashSet<String> hasSet1 = new HashSet<String>();
        //1.添加元素
        hasSet1.add("华为");
        hasSet1.add("苹果");
        hasSet1.add("小米");
        System.out.println("个数"+hasSet1.size());
        System.out.println(hasSet1);
        //2.删除
        //hasSet1.remove("华为");
        System.out.println(hasSet1);
        //4.遍历、
        //for
        for(String s : hasSet1){
            System.out.println(s);
        }
        //iterator
        Iterator<String> it = hasSet1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //5
        System.out.println(hasSet1.contains("xiaoni"));
        System.out.println(hasSet1.isEmpty());

        HashSet<Student> hashSet2 = new HashSet<>();
        Student stu1 = new Student("张三",19);
        Student stu2 = new Student("李四",18);
        Student stu3 = new Student("王二",15);
        hashSet2.add(stu1);
        hashSet2.add(stu2);
        hashSet2.add(stu3);
        //hashSet2.add(stu3);  重复  hashcode 相同，equals也相同
        hashSet2.add(new Student("王二",15));

        System.out.println("个数："+hashSet2.size());
        System.out.println(hashSet2);

        //2
        hashSet2.remove(new Student("王二",15));
        System.out.println(hashSet2);

        //3
        for (Student s : hashSet2
             ) {
            System.out.println(s);
        }
        Iterator<Student> it1 = hashSet2.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        //4
        System.out.println(hashSet2.contains(stu1));
        System.out.println(hashSet2.contains(new Student("张三", 19)));
    }
}
