package cn.itclass.java核心.IO流.test;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test03 {
    public static void main(String[] args) throws IOException {

        //1.读取数据
        FileReader fileReader= new FileReader("../javalearning/a.txt");
        StringBuilder sb =new StringBuilder();
        int ch;
        while((ch=fileReader.read())!=-1){
            sb.append((char)ch);
        }
        fileReader.close();
        //2.排序
        String[] strings = sb.toString().split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(Integer.parseInt(strings[i]));
        }
        Collections.sort(list);
        String s = list.toString().replace(", ", "-");
        String substring = s.substring(1, s.length() - 1);
        //3.写出
        FileWriter fileWriter = new FileWriter("../javalearning/b.txt");
        fileWriter.write(substring);
        fileWriter.close();
    }
}
