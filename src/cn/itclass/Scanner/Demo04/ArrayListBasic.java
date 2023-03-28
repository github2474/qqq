package cn.itclass.Scanner.Demo04;

import java.util.ArrayList;
/*
* 如果希望向集合ArrayList当中储存基本类型，必须使用基本类型对应的包装。
*
* 基本类型    包装类（引用类型，包装类都位于java.lang包下）
* byte       Byte
* short      Short
* int        Integer
* long       Long
* float      Float
* double     Double
* char       Character [特殊]
* boolean    Boolean
*
* 从JDK.1.5开始，支持自动装箱，自动拆箱
*
* 自动装箱：基本类型 ————> 包装类型
* 自动拆箱：包装类型 ————> 基本类型
*
* */
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //错误写法：泛型只能是引用类型，不能是基本类型
      /*  ArrayList<int> list1 = new ArrayList<int>();
*/
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        System.out.println(list2);

        int num = list2.get(1);
        System.out.println("集合的第二个数字是：" + num);



    }
}
