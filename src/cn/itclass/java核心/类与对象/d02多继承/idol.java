package cn.itclass.java核心.类与对象.d02多继承;


public class idol extends figure{
    public idol(String name, int blood, int force){
        super(name,blood,force);
    }
    public int getForce() {
        int f = (int)((force/3)*r.nextDouble(0.8,1.0));
        return f+force*this.eqF(this.newBlood,this.blood)/100;
    }
    //输入两方姓名，输出技能函数
    public void _PrintSkill1(String name1,String name2){};
    public void _PrintSkill2(String name1,String name2){};
    public void _PrintSkill3(String name1,String name2){};
}
