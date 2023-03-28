package cn.itclass.String;
/*
* 分割字符的方法：
* public String[] split(String regex): 按照参数规则，将字符串切分成为若干部分
*注意事项;
* split 方法的参数是一个正则表达式
*   用"." 需要转义"\\."
* */
public class Demo07StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array = str1.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("================");

        String str2 = "aaa bbb ccc";
        String[] array1 = str2.split(" ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("==================");

        String str3 ="XXX.ZZZ.YYY";
        String[] arrays1 = str3.split("\\.");
        for (int i = 0; i < arrays1.length; i++) {
            System.out.println(arrays1[i]);
        }

    }
}
