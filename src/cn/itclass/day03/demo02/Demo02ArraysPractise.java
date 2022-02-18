package cn.itclass.day03.demo02;

/*
*题目：
* 请使用Arrays相关API，将一个随机字符串中的所有字符升序排列，并倒序打印
*
* */


import java.util.Arrays;

public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "ancjbdebvblfed";

        //如何升序打印  sort
        //必须是一个数组，才能用Arrays.sort();
        //String-->数组  toCharArray();
        char[] chr = str.toCharArray();
        //sort排序
        Arrays.sort(chr);
        //输出字符数组
        System.out.println(Arrays.toString(chr));

        //遍历数组  chr.forr
        for (int i = chr.length - 1; i >= 0; i--) {
            System.out.println(chr[i]);
        }


    }
}
