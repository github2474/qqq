package cn.itclass.Scanner.Demo04;

/*
* 数组的长度不要能改变
* 集合的长度可变
*
* <E>代表泛型，引用类型，不能是基本类型
*
*注意事项：
* 集合打印出来的是内容
* */

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建一个集合，名称是list，里面装的全是String
        //右边的尖括号不写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);


        list.add("赵丽颖");
        System.out.println(list);

        list.add("迪丽热巴");
        list.add("古力娜扎");

        System.out.println(list);
    }
}
