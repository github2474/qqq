package cn.itclass.java核心.集合.泛型;

/*
* 泛型方法
* 语法：<T>返回值类型
*
*
* */

public class MyGenericMethod {
    //泛型方法
    public <T> void show(T t){
        System.out.println("泛型方法:"+t);
    }
}
