package cn.itclass.java核心.类与对象.d01单继承;

public class Circle extends Shape{

    public Circle(String yn,int yi){
        super(yn,yi);
    }

    public static void main(String[] args) {
        int n = 1;
        String y = "圆";
        Circle cricle = new Circle(y,n);
        cricle.show();
    }
}
