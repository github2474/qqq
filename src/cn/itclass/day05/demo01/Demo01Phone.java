package cn.itclass.day05.demo01;

public class Demo01Phone {
    public static void main(String[] args) {
        oldPhone phone = new oldPhone();
        phone.show();
        phone.call();
        phone.send();

        newPhone iphone = new newPhone();
        phone.show();
        phone.call();
        phone.send();

    }
}
