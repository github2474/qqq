package cn.itclass.java核心.多线程.创建线程;

public class TestLambda2 {
    public static void main(String[] args) {
    //1.lambda表达式简化
        /*Ilove love = (int a,int b )->{
                System.out.println("I love you "+a+b);
        };
        //简化1，参数类型
        love = (a)->{
            System.out.println("I love you "+a);
        };

        //简化2.简化括号
        love = a->{
            System.out.println("I love you "+a);
        };*/
        //简化3，去掉花括号
        Ilove love=(a,b)-> System.out.println("I love you "+a+b);
        love.love(520,1);
    }
}

interface Ilove{
    void love(int i,int j);
}

