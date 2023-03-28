package cn.itclass.java核心.集合.泛型;

public class MyInterFaceImpl implements MyInterFace<String>{

    @Override
    public String server(String s) {
        System.out.println(s);
        return s;
    }

}
