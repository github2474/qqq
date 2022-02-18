package cn.itclass.day03.demo01;

/*静态代码块
 *
 * public class 类名称{
 *   static{
 *       //静态代码块内容
 *   }
 * }
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次
 * 静态内容总是优于非静态，所以静态代码比构造方法先执行
 *
 * 静态代码块的典型用途：  JDBC会用到
 * 用来一次性对静态成员变量进行赋值
 * */
public class Demo04Static {
    person three = new person();
    person four = new person();

}
