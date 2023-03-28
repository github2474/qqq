package cn.itclass.java核心.IO流.test;

import java.io.*;
import java.util.*;

public class test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String line;
        TreeMap<Integer,String> map = new TreeMap<>();
        while ((line = br.readLine())!=null){
            String[] strs = line.split("\\.");
            map.put(Integer.parseInt(strs[0]),line);
        }
        br.close();

        //3.写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for (Map.Entry<Integer,String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();
    }
}
