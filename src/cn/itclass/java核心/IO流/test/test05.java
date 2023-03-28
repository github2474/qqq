package cn.itclass.java核心.IO流.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine())!=null){
            list.add(line);
        }
        br.close();
        //2排序
        Collections.sort(list,(a,b)->(Integer.parseInt(a.split("\\.")[0])-Integer.parseInt(b.split("\\.")[0])));
        //3.写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }

}
