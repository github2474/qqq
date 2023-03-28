package cn.itclass.java核心.集合.Set;

/*
* 要求：使用TreeSet集合实现字符串按照长度进行排序
* helloworld zhang list wangwu beijing xian nanjing
* Comparator 接口实现定制比较
*
*
* */

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo03 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>((o1, o2) -> {
            int n1 = o1.length()-o2.length();//从小到大排
            int n2 = o1.compareTo(o2);
            return n1==0?n2:n1;
        });

        treeSet.add("helloworld");
        treeSet.add("zhang");
        treeSet.add("lisi");
        treeSet.add("wangzi");
        treeSet.add("cat");
        treeSet.add("teacher");
        treeSet.add("xian");

        System.out.println(treeSet);
    }
}
