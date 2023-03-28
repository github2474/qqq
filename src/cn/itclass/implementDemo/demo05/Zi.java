package cn.itclass.implementDemo.demo05;

public class Zi extends Fu{

        int num = 10;

        @Override
        public void method(){
            super.method();
            System.out.println("子类方法执行");
        }

        public void show(){
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(super.num);


        }



}
