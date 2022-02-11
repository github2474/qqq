package cn.itclass.day01.Demo04;
/*
 * 题目：
 * 定义一个数组，用于储存三个person对象。
 *
 * 数组缺点：一旦创建，运行期间长度不变；
 * */
public class Demo01Array {

    public static void main(String[] args) {
        //首先创造一个长度为三的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴",18);
        Person two = new Person("古力娜扎",28);
        Person three = new Person("马儿扎哈",99);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());
    }
}
