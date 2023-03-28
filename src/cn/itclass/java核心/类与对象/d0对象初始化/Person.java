package cn.itclass.java核心.类与对象.d0对象初始化;

public class Person {
    private static String name;
    private int age;
    private String sex;

    public Person(String name,int age,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public static void show(){
        Person.getName();
    }

    public static void main(String[] args) {
        Person he = new Person("贺兴运",18,"男");
        new Person("匿名",13,"男").show();
        System.out.println(he.name);
        System.out.println(he.age);
        System.out.println(he.sex);
    }
}
