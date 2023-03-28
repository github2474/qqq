package cn.itclass.java核心.IO流.字符输入输出流;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CharSetDemo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "ai你偶";
        byte[] bytes = str.getBytes();//默认
        System.out.println(Arrays.toString(bytes));
        byte[] bytes1 = str.getBytes("GBK"); //指定方式
        System.out.println(Arrays.toString(bytes1));

        //2 解码
        String str1 = new String(bytes);
        System.out.println(str1);

        String str2 = new String(bytes,"GBK");
        System.out.println(str2);
    }

}
