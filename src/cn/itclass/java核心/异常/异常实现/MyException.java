package cn.itclass.java核心.异常.异常实现;

public class MyException extends Exception{

    //传递数字大于10抛出异常
    private int detal;

    public MyException(int a){
        this.detal = a;
    }

    //toString :打印异常信息

    @Override
    public String toString() {
        return "MyException{" +
                "detal=" + detal +
                '}';
    }
}
