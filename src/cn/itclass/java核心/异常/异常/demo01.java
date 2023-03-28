package cn.itclass.java核心.异常.异常;
/*
* 异常
*StackOverflowError
*
* */
public class demo01 {
    public static void main(String[] args) {
        try {
            new demo01().test(1,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("可以继续执行下面程序");
    }

    public void test(int a,int b){
        if(b == 0 ){
            throw new ArithmeticException();//主动抛出一个异常,一般在方法中使用
        }
    }
}
/*
*         try {//异常监控区域

            System.out.println(10/0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
* */