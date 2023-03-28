package cn.itclass.Scanner.Demo05;

import java.util.ArrayList;

/*
* 题目：
* 定义以指定格式打印集合的方法（Arraylist作为参数），使用{元素@元素@元素}
*
*
* */
public class Demo03ArraylistPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Nastia");
        list.add("Anastasia");
        list.add("贺兴运");
        list.add("老王");

        printArraylist(list);
    }
    public static void printArraylist(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.print(str);
            if(i< list.size()-1){
                System.out.print("@");
            }
        }
        System.out.println("}");
    }
}
