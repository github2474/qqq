package cn.itclass.java核心.集合.list;

/*
*list的使用
*
*
* */

import java.util.ArrayList;
import java.util.List;

public class demo02 {
    public static void main(String[] args) {
        //创建集合
        List list = new ArrayList<>();
        //1添加数字
        list.add(13);
        list.add(12);
        list.add(11);
        list.add(10);
        System.out.println("元素个数"+list.size());
        System.out.println(list);
        //2删除
        list.remove(new Integer(12));
        System.out.println(list);
        //3补充方法 sublist 返回子集合 左开右闭
        System.out.println(list.subList(1, 3));
    }
}
