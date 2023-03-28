package cn.itclass.classdemo.demo01;
/*
* 继承关系中，“子类就是一个父类”，也就是说，自雷可以被当做父类看待
* 例如，父类是员工，子类是讲师，那么“讲师就是一个员工”。关系：is-a
* 格式：
* 定义父类的格式就是一个普通类的定义
* public class fu(){
*   //...
* }
*
* 定义子类的格式：
*  public class zi extends fu(){
*   //...
* }
*
* */
public class Demo01Extends {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Assistant assistant = new Assistant();

        assistant.show();
        teacher.show();



    }
}
