package cn.itclass.java核心.集合.ArrayList;
//*
// vector
// 线程安全，运行效率慢
//
// */
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        Vector vec = new Vector<>();
        //1
        vec.add("aaa");
        vec.add("bbb");
        vec.add("ccc");
        //2
        //vec.remove("aaa");
        //3遍历
        Iterator it = vec.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //枚举器
        Enumeration en = vec.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
        //4
        System.out.println(vec.contains("aaa"));
        System.out.println(vec.isEmpty());
        //其他
        //firstElement
        System.out.println(vec.lastElement());
        System.out.println(vec.elementAt(2));
    }
}
