package cn.itclass.day05.demo04;
/*
* super关键字用来访问父类内容，而this关键字用来访问本类内容，用法也有三种：
*
* 1、在本类成员方法中，访问本类成员变量
* 2、在本类成员方法中，访问本类另一个成员方法
* 3、在本类构造方法中，访问本类的另一个构造方法
*      A   this（。。。）必须是【第一个语句】且【唯一】
*      B   super 和  this  不能【同时使用】
* */
public class Zi extends Fu{
    int num=11;

    public Zi(){
        // this(787);
        this(554);
    }

    public Zi(int n){
        System.out.println("无参构造调用有参构造");
    }

    public Zi(int n, int m){
        this();
        System.out.println("dgdgs");
    }

    public void showNum(){
        int num = 20;
        System.out.println(num);//局部变量
        System.out.println(this.num);//本类中的成员变量
        System.out.println(super.num);//父类中的成员变量
    }

    public void methodA(){
        System.out.println("AAA");
    }

    public void methodB(){
        this.methodA();//强调
        System.out.println("BBB");
    }

}
