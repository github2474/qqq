package cn.itclass.day04.demo05;
/*
* 方法覆盖重写的注意事项：
* 1、必须保证父子类之间方法的名称相同，参数列表也相同。
*    @Override写在前面，用来检测是否重写成功
* 2、子类方法的返回值必须满足【小于等于】父类方法的返回值范围
*
* 前提：java.lang.Object类是公共最高类，java.lang.String 就是Object的子类
*
* 3、子类方法的权限必须【大于等于】父类方法的权限修饰
* 提示：public > protected > (default) > privite
* 备注：(default)不是关键字default，而是什么都不写，留空。
*
* */
public class Demo01Override {
    public static void main(String[] args) {

    }
}
