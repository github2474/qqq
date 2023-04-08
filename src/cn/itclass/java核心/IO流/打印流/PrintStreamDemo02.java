package cn.itclass.java核心.IO流.打印流;

import java.io.PrintStream;

public class PrintStreamDemo02 {
    public static void main(String[] args) {
        //特殊的打印流，系统中的标准输出流,是不能关闭的，在系统中唯一的
        PrintStream ps = System.out;
        ps.println("客服说是公司如果输入");
        ps.close();
        //调用打印流的方法println
        //写出数据，自动换行，自动刷新
        System.out.println("123");//不打印这个，因为流关了
    }
}
