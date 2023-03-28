package cn.itclass.java核心.IO流.test;

import java.io.Serial;
import java.io.Serializable;

public class teacher implements Serializable {


    @Serial
    private static final long serialVersionUID = -7754981587435934939L;
    private String name;
    private int age;

    public teacher() {
    }

    public teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
