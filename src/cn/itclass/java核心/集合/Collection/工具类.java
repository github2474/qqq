package cn.itclass.java核心.集合.Collection;

import java.util.*;

public class 工具类 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //1添加数字
        list.add(13);
        list.add(12);
        list.add(11);
        list.add(10);
        System.out.println("元素个数"+list.size());
        System.out.println(list);

        //binarySearch
        int n =Collections.binarySearch(list,12);
        System.out.println(n);

        //copy  先让长度相等
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(0);
        }
        Collections.copy(list1,list);
        System.out.println(list1);

        //reverse 反转
        Collections.reverse(list1);
        System.out.println(list1);

        //shuffle 打乱
        Collections.shuffle(list1);
        System.out.println(list1);

        //list 转成数组
        Integer[] arr = list1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        //数组转成集合
        String[] names = {"111","222","333"};
        List<String> list2 = Arrays.asList(names);
        //该集合是一个受限集合，不能添加
        System.out.println(list2);
        //把基本类型数组转成集合是必须要修改为包装类

    }
}
