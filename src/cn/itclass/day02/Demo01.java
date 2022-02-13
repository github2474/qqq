package cn.itclass.day02;
/*
 * 字符串的特点：
 * 1、字符串的内容永不可变
 * 2、正因为字符串的不可改变，所以字符串是可以共享使用的。
 * 3、字符串的效果上相当于char[]字符数组，但是底层原理是byte[]字节数组
 *
 * 创建字符串的三种方法：
 *  public String（），创建一个空白字符串，不包含任何内容
 *  public String（char[]）,根据字符数组的内容，来创建对应的字符串
 *  public String（byte[]）,根据字节数组的内容，来创建对应的字符串
 *
 *
 *一种直接创建
 * String str = "hello";
 *
 * */
public class Demo01 {
    public static void main(String[] args) {
        //使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串：" + str1);

        //根据字符数组创建字符串
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串是"+ str2);

        //根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串是：" + str3);

        String str = "hello";
        System.out.println("第四个字符串是："+str);
    }
}
