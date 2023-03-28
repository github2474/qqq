package cn.itclass.java核心.集合.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
* 测试Set接口的使用
* 特点；1.无序 2。不能重复
*
* */
public class demo01 {
    public static void main(String[] args) {
        //创建集合
        Set<String> set =new HashSet<>();
        //1.添加数据
        set.add("huawei");
        set.add("apple");
        set.add("xiaomi");
        //set.add("huawei");
        System.out.println(set);

        //2删除
        //set.remove("apple");
        //System.out.println(set);
        //set.clear();
        System.out.println(set);

        //3遍历
        //for
        System.out.println("----for---");
        for (String s:set
             ) {
            System.out.println(s);
        }
        //iterator
        System.out.println("---iterator---");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //4
        System.out.println(set.contains("huawei"));
        System.out.println(set.isEmpty());
    }


}
