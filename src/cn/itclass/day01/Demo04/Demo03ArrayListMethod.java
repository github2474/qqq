package cn.itclass.day01.Demo04;

/*
* Arraylist 的方法：
*
* public Boolean add(E e): 向集合中添加元素，参数类型和泛型一致
* public E get(int index): 像集合中获取元素，参数是索引，返回值是对应位置的元素
* public E remove(int index):从集合中删除元素，返回值是删除的元素
* public int size(): 获得集合的尺寸长度，返回值是集合中包含的元素个数
*
*
* */

import java.util.ArrayList;

public class Demo03ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list);

        //向集合中添加元素
        boolean success = list.add("杨颖");
        System.out.println(list);
        System.out.println("添加动作是否成功"+success);

        list.add("李云迪");
        list.add("王力宏");
        list.add("吴亦凡");
        System.out.println(list);

        //从集合中提取元素
        String name = list.get(2);
        System.out.println("第二号索引位置："+name);

        //从集合中删除元素
        String nameRemove = list.remove(0);
        System.out.println(nameRemove);
        System.out.println(list);

        //获取长度
        int size = list.size();
        System.out.println(size);

    }
}
