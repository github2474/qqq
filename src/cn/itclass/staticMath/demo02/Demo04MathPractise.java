package cn.itclass.staticMath.demo02;
/*
* 题目：
* 计算在-10.8到5.9之间，绝对值大于6 或者小于2.1 的整数有多少？
*
*
* 处理-10.8使用
* 向上取整   或 (int) 强转：舍弃小数位
*
* 或  用 ||
* */
public class Demo04MathPractise {
    public static void main(String[] args) {
        double max = 5.9;
        double min = -10.8;

        for(int i=(int)max; i<6;i++){
            if (Math.abs(i)>6 || Math.abs(i)<2.1){
                System.out.println(i);
            }
        }
    }
}
