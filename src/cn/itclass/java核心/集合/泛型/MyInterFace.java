package cn.itclass.java核心.集合.泛型;
/*
* 泛型接口
* 语法：接口名<T>
* 注意不能创建泛型静态常量
* */
public interface MyInterFace<T> {
    String name ="zhangsan";

    T server(T t);
}
