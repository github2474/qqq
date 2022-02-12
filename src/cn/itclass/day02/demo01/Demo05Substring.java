package cn.itclass.day02.demo01;
/*
* 字符串的截取方式
*
* public String substring(int index):截取从参数位置一直到字符串末尾，返回新的字符串
* public String substring(int begin ,int end) :左闭右开
* [begin,end)包括左边，不包括右边
*
*
*
*
* */


public class Demo05Substring {

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(str1.indexOf('W'));
        System.out.println("截取的字符串为：" + str2);
        System.out.println("截取的字符串为：" + str1.substring(str1.indexOf('H'),str1.indexOf('o')+1));

        //下面的写法，字符串的内容不变，变的是strA所存的地址
        String strA = "hello";
        System.out.println(strA);
        strA = "java";
        System.out.println(strA);

    }
}
