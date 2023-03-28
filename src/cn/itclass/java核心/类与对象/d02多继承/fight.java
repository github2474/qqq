package cn.itclass.java核心.类与对象.d02多继承;
import java.util.Random;

public class fight{

    //打印show
    private static void _FightShowPrint(figure one, figure two){
        if(one instanceof hero){
            one.show();
            two.show();
        }else{
            two.show();
            one.show();
        }
        System.out.println("-------------");
    }
    private static void _ShowPrintDead(figure one, figure two){
        if(one.newBlood<=0){
            System.out.println(one.name+"已死亡！");
            System.out.println("-------------");
        }
        if(two.newBlood<=0){
            System.out.println(two.name+"已死亡！");
            System.out.println("-------------");
        }
    }

    public static void hitFight(figure one, figure two) {
        if(one.newBlood<=0){
            _ShowPrintDead(one,two);
        }else if(two.newBlood<=0){
            _ShowPrintDead(one,two);
        }else{
            one._PrintSkill1(one.name, two.name);
            two.hitShow(one.getForce());
            _FightShowPrint(one,two);
        }


    }
    public static void killFight(figure one, figure two) {
        if(one.newBlood<=0) {
            _ShowPrintDead(one, two);
        }else if(two.newBlood<=0){
            _ShowPrintDead(one,two);
        }else{
            one._PrintSkill2(one.name, two.name);
            two.killShow(one.getForce());
            _FightShowPrint(one,two);
        }

    }
    public static void hitKillFight(figure one, figure two) {
        if(one.newBlood<=0){
            _ShowPrintDead(one,two);
        }else if(two.newBlood<=0){
            _ShowPrintDead(one,two);
        }else {
            one._PrintSkill3(one.name, two.name);
            two.hitKillShow(one.getForce());
            _FightShowPrint(one,two);
        }

    }

    //怪物的自动攻击
    public static void idolHitKillAuto(figure one, figure two){
        Random r = new Random();
        if(one instanceof idol){
            while(two.newBlood>0){
                stop();
                randomFight(two, one, r);

            }
        }else{
            while(one.newBlood>0){
                stop();
                randomFight(one, two, r);
            }
        }

    }
    //随机选择打击动作
    private static void randomFight(figure one, figure two, Random r) {
        switch (r.nextInt(100)%3){
            case 0 -> hitFight(two,one);
            case 1 -> killFight(two,one);
            case 2 -> hitKillFight(two,one);
        }
    }
    //怪物自动打击间隔时间
    private static void stop(){
        try{
            Thread.sleep(1_000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }


}
