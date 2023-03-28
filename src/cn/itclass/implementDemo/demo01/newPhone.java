package cn.itclass.implementDemo.demo01;

public class newPhone extends oldPhone {

    @Override
    public void show() {
        super.show();//使用super关键字可以不在重复写oldPhone的方法
        System.out.println("显示名字");
        System.out.println("显示头像");
    }
}
