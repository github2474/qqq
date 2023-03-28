package cn.itclass.java核心.IO流.序列化和反序列化流;

import java.io.Serial;
import java.io.Serializable;

/*
* Serializable 没有抽象方法，标记型接口
* 一旦实现了这个接口，那就表明当前的Student类可以被序列化
*
* */

public class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = -5222082392568643994L;

    private String name;
    private int age;
    private transient String adress;

    public Student() {

    }

    public Student(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }
}


