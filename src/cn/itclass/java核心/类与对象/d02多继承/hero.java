package cn.itclass.java核心.类与对象.d02多继承;

import java.util.Random;

public class hero extends figure {
    public hero(String name, int blood, int force){
        super(name,blood,force);
    }
    @Override
    public int getForce() {
        int f = (int)((force/2)*r.nextDouble(0.8,1.2));
        return f+force*this.eqF(this.newBlood,this.blood)/100;
    }

    @Override
    //输入两方姓名，输出技能函数
    public void _PrintSkill1(String name1,String name2){
        System.out.println("");
        System.out.println(name2+"被"+name1+"的重重的剑柄砸伤了！继续，挑战者！");
    }
    @Override
    //输入两方姓名，输出技能函数
    public void _PrintSkill2(String name1,String name2){
        System.out.println(name2+"被"+name1+"的锋利的剑鞘砍伤了，继续努力，挑战者！");
    }
    @Override
    //输入两方姓名，输出技能函数
    public void _PrintSkill3(String name1,String name2){
        System.out.println(name2+"被"+name1+"用技能击杀了！马上击败它了，挑战者！");
    }
}
