package cn.itclass.java核心.IO流.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class test09 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
        ArrayList<student> lists =(ArrayList<student>) ois.readObject();
        System.out.println(lists);
        ois.close();
    }
}
