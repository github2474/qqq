package cn.itclass.java核心.异常.异常实现;

public class demo01 {
    //可能存在异常的方法

    static void test(int a) throws MyException {
        System.out.println("传递的参数为"+a);
        if(a>10){
            throw new MyException(a);//抛出
        }

        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            test(1);
        } catch (MyException e) {
            System.out.println(e);
        }

    }
}
