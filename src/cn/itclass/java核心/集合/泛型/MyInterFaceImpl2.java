package cn.itclass.java核心.集合.泛型;

public class MyInterFaceImpl2<T> implements MyInterFace<T>{

    @Override
    public T server(T t) {
        System.out.println(t);
        return t;
    }
}
