package cn.itclass.implementDemo.demo02;

public class Zi extends Fu{


    public Zi(){
        //  super();  //调用无参构造
        // 【对super的调用必须是构造器中的第一个语句】 ,,【且只能调用一次】
        super(222);   //  可以在父类构造方法重载的情况下，调用父类有参构造方法,,
        //  super(); //     【对super的调用必须是构造器中的第一个语句】
        System.out.println("子类构造方法执行！");
    }


    public void method(){
      //  super();//  【构造器】对super的调用必须是【构造器】中的第一个语句
    }
}
