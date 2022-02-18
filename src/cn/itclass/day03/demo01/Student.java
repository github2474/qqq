package cn.itclass.day03.demo01;

public class Student {
    private int id ; //学号
    private String name;
    private int age;
    static String room;
    private static int idCounter = 1004216100; //学号计数器

    public Student(){
        idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

}
