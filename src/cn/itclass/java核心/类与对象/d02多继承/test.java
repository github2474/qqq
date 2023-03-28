package cn.itclass.java核心.类与对象.d02多继承;

public class test {
    public static void main(String[] args) {
        slim slim1 = new slim("史莱姆",500,50);
        hero hero1 = new hero("挑战者",1000,100);


        fight.hitKillFight(slim1,hero1);
        fight.hitKillFight(hero1,slim1);
        fight.hitKillFight(slim1,hero1);
        fight.hitKillFight(hero1,slim1);
        fight.hitKillFight(slim1,hero1);
        fight.hitKillFight(hero1,slim1);
        fight.hitKillFight(slim1,hero1);
        fight.hitKillFight(hero1,slim1);
        fight.hitKillFight(slim1,hero1);
        fight.hitKillFight(hero1,slim1);
        fight.hitKillFight(slim1,hero1);
        fight.hitKillFight(hero1,slim1);


    }
}
