package cn.itclass.day02;

import java.util.Scanner;

/*
* 题目：
* 键盘输入一个字符串，并且统计其中各种字符出现的次数
* 种类：大写字母，小写字母，数字，其他；
*
* 思路：
* 1，既然要用到键盘输入，肯定是Scanner
* 2,输入的是字符串， String str = sc.next();
* 3,需要对每一个字符检查，需要用到toCharArray()
* 4,遍历char[]字符数组，对当前种类进行判断，并且用四个变量++
* 5，打印四个变量。分别代表的次数
*
* */
public class Demo09StringPractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if('A'<= ch && ch <= 'Z'){
                countUpper++;
            }else if('a' <= ch && ch <= 'z'){
                countLower++;
            }else if('0' <= ch && ch <= '9'){
                countNumber++;
            }else {countOther++;}

        }

        System.out.println("大写字母，小写字母，数字，其他分别代表的次数：");
        System.out.println(countUpper + "," + countLower + "," + countNumber + "," + countOther);

    }
}
