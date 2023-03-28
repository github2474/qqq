package cn.itclass.Scanner.Demo05;

import java.util.ArrayList;
import java.util.Random;

/*
*用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中。
* 要求使用自定义方法来实现筛选
*
*分析：
* 1、需要创建一个集合，用来存储int数字，<Integer>
* 2、随机数字就用Random nextInt
* 3、循环20次，把随机数字放入大集合，for循环，add方法
* 4、定义一个方法，用来筛选。
*
* 筛选：根据大集合，筛选出符合要求的元素。得到小集合。
* 三要素
* 返回值类型：
* 方法名称:getSmallList
* 参数列表:ArrayList大集合（装20个随机数字）
* 5、判断（if）是偶数，num % 2 == 0
* 6、如果是偶数，就放到小集合中，否则不放
*
* */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> BigList = new ArrayList<>();
        ArrayList<Integer> SmallList = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            BigList.add(num);

        }

        SmallList = getSmallList(BigList);

        System.out.println(BigList);
        System.out.println(SmallList);
        System.out.println("偶数有多少个：" + SmallList.size());
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> BigList){
        ArrayList<Integer> SmallList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = BigList.get(i);
            if(num%2 == 0){
                SmallList.add(num);
            }
        }
        return SmallList;
    }


}
