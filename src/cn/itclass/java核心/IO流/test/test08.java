package cn.itclass.java核心.IO流.test;

import cn.itclass.classdemo.demo01.Teacher;
import cn.itclass.java核心.集合.Student;

import java.io.*;
import java.util.ArrayList;

public class test08 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化多个对象
        student stu1 = new student("李明",29);
        student stu2 = new student("李强",22);
        ArrayList<student> lists = new ArrayList<>();
        lists.add(stu1);
        lists.add(stu2);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"));
        oos.writeObject(lists);
        oos.close();
    }
}
