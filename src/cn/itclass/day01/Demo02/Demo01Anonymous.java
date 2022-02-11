package cn.itclass.day01.Demo02;
/*
*创建对象的标准格式
* 类名称 对象名称 = new 类名（）；
*
* 匿名对象就是只有右边的对象，没有作伴的名字和赋值运算
* new 类名称（）；
* 注意事项：匿名对象只使用一次，下次用需要在创建
* 使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象
* */
public class Demo01Anonymous {
    public static void main(String[] args) {

        Person one = new Person();
        one.name="高圆圆";
        one.ShowName();

        //匿名对象
        new Person().name="赵又廷";
        new Person().ShowName();


    }
}
