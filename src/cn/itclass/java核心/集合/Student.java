package cn.itclass.java核心.集合;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(){

    }

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) return  true;
        if(o == null || getClass() != o.getClass()) return false;
        Student stu = (Student) o;
        return name.equals(stu.name) || age == stu.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        int n1=getName().compareTo(o.getName());//先比较名字
        int n2=age-o.getAge();
        return n1==0?n2:n1;//姓名一样再比名字
    }
}
