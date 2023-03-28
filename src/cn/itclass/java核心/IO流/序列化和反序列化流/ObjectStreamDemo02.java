package cn.itclass.java核心.IO流.序列化和反序列化流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
        //2.读取数据
        Object o = ois.readObject();
        //3.打印对象
        System.out.println(o);
        //4.释放资源
        ois.close();
    }
}
