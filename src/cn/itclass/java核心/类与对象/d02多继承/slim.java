package cn.itclass.java核心.类与对象.d02多继承;

public class slim extends idol {
    public slim(String name, int blood, int force){
        super(name,blood,force);
    }

    @Override
    //输入两方姓名，输出技能函数
    public void _PrintSkill1(String name1,String name2){
        System.out.println(name1+"用它坚硬的外壳顶伤了"+name2+"！不要放弃，挑战者！");
    }

    @Override
    public void _PrintSkill2(String name1,String name2){
        System.out.println(name1+"用碎石砸伤了"+name2+"！你可以的，挑战者！");
    }

    @Override
    public void _PrintSkill3(String name1,String name2){
        System.out.println(name1+"用技能击杀了"+name2+"！相信自己，挑战者！");
    }
}
