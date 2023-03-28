package cn.itclass.java核心.类与对象.d01单继承;

public class Shape {
    public String name;
    public int border;

    public Shape() {
    }

    public Shape(String name, int border ) {
        this.border = border;
        this.name = name;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name+"有"+border+"条边");
    }

    public static void main(String[] args) {
        Shape shape = new Shape("形状",0);
        shape.show();
    }
}
