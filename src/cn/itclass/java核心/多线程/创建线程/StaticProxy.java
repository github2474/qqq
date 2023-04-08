package cn.itclass.java核心.多线程.创建线程;
/*
*
*
* */
public class StaticProxy {
    public static void main(String[] args) {

        new Thread(()->{
            System.out.println("我爱你");
        }).start();

        new WeddingCompany(new You()).HappyMarry();
    }
}

interface Marry{
    void HappyMarry();
}
//真实角色
class You implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("You Are Married！");
    }
}

//代理角色
class WeddingCompany implements Marry{
    //这是代理——>真实角色
    private Marry target;

    public WeddingCompany(Marry target){
        this.target=target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();//这是真实对象
        after();
    }

    private void before(){
        System.out.println("before:");
    }
    private void after(){
        System.out.println("after:");
    }
}

