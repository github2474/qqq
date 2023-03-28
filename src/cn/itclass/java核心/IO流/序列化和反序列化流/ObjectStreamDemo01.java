package cn.itclass.java核心.IO流.序列化和反序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        Student stu = new Student("张三",18,"123");
        //2.创建一个序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"));
        //3.写出数据
        oos.writeObject(stu);
        oos.close();
    }
}
