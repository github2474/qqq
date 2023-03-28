package cn.itclass.java核心.类与对象.d02多继承;

import java.util.Random;

abstract class figure implements hit,kill{
    public String name;
    public  int blood;
    public int newBlood;
    public int force;

    Random r = new Random();

    public figure(String name, int newBlood, int force) {
        this.name = name;
        this.newBlood = newBlood;
        this.force = force;
        this.blood = newBlood;
    }

    public int eqF(int a, int b){
        double c = (double)a/(double)b*100;
        return (int)c;
    }
    //输入两方姓名，输出技能函数
    public abstract void _PrintSkill1(String name1,String name2);
    public abstract void _PrintSkill2(String name1,String name2);
    public abstract void _PrintSkill3(String name1,String name2);
    //获得攻击力，需要重写
    public abstract int getForce();
    //减少血量
    private  void _ReduceBlood(int reduceBlood,int _Force){
        final double _begin = 0.5;
        final double _end = 0.8;
        int b =(int)(reduceBlood+ (reduceBlood+_Force)*r.nextDouble(_begin,_end));
        newBlood=newBlood-b;
        if(newBlood>0) {
            System.out.println(this.name+"减少" + b + "滴血！");
        }else{
            System.out.println(this.name+"血量为零！");
        }
    }

    @Override
    public void killShow(int _Force){
        _ReduceBlood(kill.killBlood,_Force);
    }
    @Override
    public void hitShow(int _Force){
        _ReduceBlood(hit.hitBlood,_Force);
    }

    public void hitKillShow(int _Force){
        _ReduceBlood((hit.hitBlood + kill.killBlood),_Force);
    }
    public void show(){
        int f = getForce();
        if(newBlood>0){
            System.out.println(this.name+"(剩余血量："+newBlood+"，当前攻击力："+f+")");
        }else{
            System.out.println(this.name+":啊！"+"over！");
        }
    }
}
