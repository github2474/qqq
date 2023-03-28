package cn.itclass.java核心.IO流.test;

import java.io.*;

public class test07 {
    /*
    * 第一次：欢迎使用本软件，第1次使用免费~
第二次：欢迎使用本软件，第2次使用免费~
第三次：欢迎使用本软件，第3次使用免费~
第四次及以后：本软件只能免费使用3次，欢迎您注册会员后继续使用~*/
    public static void main(String[] args) throws IOException {
        //1.把文件读到内存
        //IO：随用随创建
        // 不用就关闭
        BufferedReader br = new BufferedReader(new FileReader("count.txt"));
        String line = br.readLine();

        br.close();
        int count = Integer.parseInt(line);
        count++;

        //2判断
        if(count<4){
            System.out.println("欢迎使用本软件，第"+count+"次使用免费~");
        }else{
            System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用~");
        }
        //3写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));
        bw.write(count+"");
        bw.close();
    }
}
