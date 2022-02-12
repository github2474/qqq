package cn.itclass.day02.demo01;
/*
*"="是进行对象的地址比较，字符串内容比较，可以使用两个方法
*
* public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true；否则返回false
* 注意事项：
* 1.任何对象都能用Object进行接收
* 2，equals方法具有对称性，也就是a.equals(b)和b.equals(a);一样
* 3，如果一个常量一个变量，推荐吧常量字符放前面
* “123”.equals(str)
* str.equals("123")会产生空指针异常//NullPointerException
*
* public boolean equalsIgnoreCase(String str)
*
* */
public class Demo03StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray ={'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));//t
        System.out.println(str1.equals("Hello"));//t
        System.out.println("Hello".equals(str1));//t
        System.out.println("hello".equals(str1));//false
        System.out.println("=====================");

        String str4 = null;

        System.out.println("123".equals(str4));

        String str5 = "Java";
        String str6 = "java";
        System.out.println(str5.equals(str6));
        System.out.println(str6.equalsIgnoreCase(str5));

    }


}
