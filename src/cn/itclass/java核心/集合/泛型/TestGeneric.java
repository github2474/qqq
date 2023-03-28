package cn.itclass.java核心.集合.泛型;

public class TestGeneric {
    public static void main(String[] args) {
        //使用泛型类创建对象
        //泛型只能使用引用类型，不同泛型类型的对象不能相互复制
        //提高代码的重用性！！！
        //防止类型转换异常
        MyGeneric<String> myGeneric = new MyGeneric<>();
        myGeneric.t="ttt";
        System.out.println(myGeneric.getT());
        myGeneric.show("hhh");

        MyGeneric<Integer> myGeneric1 = new MyGeneric<>();
        myGeneric1.t=100;
        myGeneric1.show(888);
        Integer i = myGeneric1.getT();
        System.out.println(i);

        MyGeneric<String> myGeneric2 = myGeneric;
        System.out.println(":"+myGeneric2.getT());

        MyInterFaceImpl impl = new MyInterFaceImpl();
        impl.server("xxxxxx");

        MyInterFaceImpl2<String> impl2 = new MyInterFaceImpl2<>();
        impl2.server("112");

        MyGenericMethod myGenericMethod = new MyGenericMethod();
        myGenericMethod.show("123");
        myGenericMethod.show(666);
        myGenericMethod.show("123"+666+1.22);
    }
}
