package cn.itclass.String;

/*
* String 当中与转换相关的常用方法有
*
* public char[] toCharArray（）： 将当前字符拆分成为字符数组作为返回值
* public byte[] getBytes(): 获取当前字符串底层的字节数组
* public String replace（CharSequence oldString , CharSequence newString)
* 将所有老的字符串替换成新的字符串
*
*
* */
public class Demo06StringConvert {
    public static void main(String[] args) {
        char[] chars ="hello".toCharArray();
        System.out.println(chars[2]);
        System.out.println(chars.length);
        System.out.println("=================");

        String str1 = "helloworld世界";
        byte[] bytes= str1.getBytes();


        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }


        System.out.println("================");

        String str2 = str1.replace("world","java");
        System.out.println("替换后的字符串为：" + str2);
    }
}
