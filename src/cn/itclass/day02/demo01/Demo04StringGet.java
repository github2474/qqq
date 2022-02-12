package cn.itclass.day02.demo01;
/*
* String 与获取相关的常用方法有：
*
* public int Length（）：长度
* public String concat(String str):拼接
* public char charAt(int index):获取指定索引位置的单个字符，（索引从零开始）
* public int indexOf(String str):查找参数字符串在本字符中首次出现的位置，如果没有返回-1
* */
public class Demo04StringGet {
    public static void main(String[] args) {
        //获得长度
        int length = "FakeNewsAddInTheBlack".length();
        System.out.println("字符串FakeNewsAddInTheBlack的长度是"+length);
        System.out.println("=======================");
        //拼接
        String str1 = "hello";
        String str2 = "World";
        // String strNull = null;  NullPointerException
        String str3 = str1.concat(str2);
        System.out.println("======hello + World=======");
        System.out.println("拼接的字符串1是"+str3);
        System.out.println("====hello + null + World======");
        //String str4 = str1.concat(strNull).concat(str2);
        //System.out.println("拼接的字符串2是"+str4);
        //查看索引

        System.out.println("查看"+str1+"索引3: "+str1.charAt(3));
        // System.out.println("查看"+str1+"索引10: "+str1.charAt(10));    // StringIndexOutOfBoundsException
        //查看字母首次出现位置
        System.out.println("查看字母l首次出现位置: "+str3.indexOf('l'));
        System.out.println("查看字符串ll首次出现位置: "+str3.indexOf("ll"));

    }
}
