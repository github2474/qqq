package cn.itclass.String;
/*
* 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]
* 思路：
* 数组数组toString + #
* 
* 
* int 转换为String 
*  1,空用字符串拼接 ，
*  2,String.valueof(i), 
*  3,Integer.toString(i);
*  4,Integer j = i;   j.toSrtring();
*
* 方法使用：
* 接收对象 = 方法名（调用对象）；
* 方法：
* public static 返回类型 方法名(接收对象){
*   return 返回类型
* }
* 
* */
public class Demo08StringPractise {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        String str = fromArrayToString(arr);
        System.out.println(str);
    }
    public static String fromArrayToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i == arr.length - 1){
                str += "]";
            }else {
                str += "#";
            }
        }

        return str;
    }
}
